# Anas — simple ChatGPT Android demo

This repository contains a minimal Android app (Kotlin + Jetpack Compose) named "أنس" that demonstrates sending messages to OpenAI's Chat Completions API.

CI Trigger: small update to README to trigger GitHub Actions build — updated by Copilot on 2026-08-08T00:00:00Z

How to use:
1. Clone your repo locally:
   git clone https://github.com/othmanalhajji2025-dev/anas123.git
   cd anas123

2. Paste the files from this message into the repo tree, then:
   git add .
   git commit -m "Add Anas Android app"
   git push origin main

3. After push, GitHub Actions will build the debug APK automatically. Go to the repository's Actions tab → Build Debug APK job → download artifact `app-debug-apk`.

Or build locally:
- Open the project in Android Studio (Electric Eel or newer recommended).
- Run: Build > Build Bundle(s) / APK(s) > Build APK(s)
- Or via terminal: ./gradlew assembleDebug
- Install the APK from app/build/outputs/apk/debug/app-debug.apk on your device/emulator.

Important:
- On first run the app shows a field to paste your OpenAI API key (sk-...). The key is stored using EncryptedSharedPreferences on-device.
- For production, consider using a backend proxy to hide the OpenAI key server-side.
- This is a simple demo for testing only.
