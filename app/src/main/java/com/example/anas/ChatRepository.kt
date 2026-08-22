package com.example.anas

import android.content.Context
import androidx.security.crypto.EncryptedSharedPreferences
import androidx.security.crypto.MasterKey
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody

enum class MessageSender { User, Assistant }
data class ChatMessage(val sender: MessageSender, val text: String)

class ChatRepository(private val context: Context) {
    private val _messages = MutableStateFlow<List<ChatMessage>>(emptyList())
    val messages: StateFlow<List<ChatMessage>> = _messages.asStateFlow()

    private val client = OkHttpClient()
    private val json = Json { ignoreUnknownKeys = true }

    // store API key securely using EncryptedSharedPreferences
    private val prefs by lazy {
        val masterKey = MasterKey.Builder(context)
            .setKeyScheme(MasterKey.KeyScheme.AES256_GCM)
            .build()
        EncryptedSharedPreferences.create(
            context,
            "anas_prefs",
            masterKey,
            EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
            EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM
        )
    }

    private var apiKey: String?
        get() = prefs.getString("OPENAI_API_KEY", null)
        set(value) = prefs.edit().putString("OPENAI_API_KEY", value).apply()

    private val _hasKey = MutableStateFlow(!apiKey.isNullOrBlank())
    val hasKey: StateFlow<Boolean> = _hasKey.asStateFlow()

    suspend fun sendUserMessage(text: String) {
        if (apiKey.isNullOrBlank()) {
            appendLocalMessage(MessageSender.Assistant, "مفتاح OpenAI غير موجود. أضف المفتاح أولاً ثم أعد المحاولة.")
            return
        }
        appendLocalMessage(MessageSender.User, text)
        val assistant = callOpenAI(apiKey!!, text)
        appendLocalMessage(MessageSender.Assistant, assistant)
    }

    fun setApiKey(key: String) {
        apiKey = key.trim()
        _hasKey.value = !apiKey.isNullOrBlank()
    }

    fun clearApiKey() {
        apiKey = null
        _hasKey.value = false
    }

    private fun appendLocalMessage(sender: MessageSender, text: String) {
        _messages.value = _messages.value + ChatMessage(sender, text)
    }

    private fun callOpenAI(key: String, userPrompt: String): String {
        val url = "https://api.openai.com/v1/chat/completions"
        val payload = OpenAIRequest(
            model = "gpt-3.5-turbo",
            messages = listOf(Message(role = "user", content = userPrompt))
        )
        val bodyJson = json.encodeToString(payload)
        val body = bodyJson.toRequestBody("application/json; charset=utf-8".toMediaType())
        val req = Request.Builder()
            .url(url)
            .addHeader("Authorization", "Bearer $key")
            .post(body)
            .build()
        client.newCall(req).execute().use { resp ->
            if (!resp.isSuccessful) {
                val text = resp.body?.string() ?: "خطأ غير معروف"
                return "خطأ من الخادم: $text"
            }
            val respText = resp.body?.string() ?: return "استجابة فارغة"
            val parsed = json.decodeFromString<OpenAIResponse>(respText)
            return parsed.choices.firstOrNull()?.message?.content?.trim() ?: "لا توجد إجابة"
        }
    }
}

@Serializable
data class Message(val role: String, val content: String)

@Serializable
data class OpenAIRequest(val model: String, val messages: List<Message>)

@Serializable
data class Choice(val index: Int, val message: Message)

@Serializable
data class OpenAIResponse(
    val id: String,
    @SerialName("object") val objectType: String? = null,
    val created: Long? = null,
    val choices: List<Choice> = emptyList(),
    val usage: Map<String, Int>? = null
)