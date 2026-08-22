نعم. هذه هي النسخة النهائية المدمجة التي ينبغي اعتمادها كوثيقة الأم للمشروع.
اعتبرت وثيقة Master Specification v1.0 التي أرسلتها هي الأساس، وأدخلت فوقها الأنظمة التي ذكرتها، بحيث لا تكون الأنظمة الجديدة ملحقًا منفصلًا، بل جزءًا أصيلًا من المعمارية. كما أدرجت OmniShield Security & Resilience Architecture v2.0 وطبقات Global Directory/MediRate والـAgentic Architecture والـHealth modules، مع الحفاظ على قائمة الـAPIs وتصنيف حالتها بدل الادعاء بأنها كلها منفذة.
🩺 OMNIDOCTOR AI
MASTER SPECIFICATION v2.0
Global AI Healthcare Operating Platform
Product Name: OmniDoctor AI
Arabic Name: الطبيب المعجزة AI
Nature: Global AI Healthcare Platform
Current Build Platform: Google AI Studio
Target: Web Application → PWA → Capacitor → Android APK → iOS
Architecture: Modular Full-Stack / AI Gateway / Clinical Safety / Controlled Agents / RAG / Healthcare Directory / Security & Resilience
Status: Master Product & Technical Specification
Purpose: Source-of-truth architecture for rebuilding and incrementally implementing OmniDoctor AI without deleting previously defined systems, APIs, integrations, configuration targets, or architectural decisions.

System native language: Arabic (العربية).
Supported languages: All languages (global) — full internationalization (i18n) support; user-visible UI and content must be localizable into any language, with Arabic as the default/native locale.

1. MASTER PRODUCT VISION
OmniDoctor AI is not a simple chatbot.
It is a modular global healthcare operating platform combining:
• AI Medical Companion
• Clinical Safety Engine
• OmniConsult
• Clinical 7-Step Protocol
• OLDCARTS
• Differential Reasoning
• Clinical Decision Support
• Drug Intelligence
• Medication Safety Framework
• Five Rights
• Medication Reconciliation
• Drug Interaction Engine
• Medical OCR
• Prescription Intelligence
• Laboratory Intelligence
• Medical Image Intelligence
• Medical & Visual RAG
• Global Medical Knowledge
• YemenMD
• Global Drug Database
• Voice Medical Assistant
• Multilingual & Dialect AI
• Emergency Assistance
• Nearby Healthcare Facilities
• Global Doctor Directory
• Global Healthcare Directory
• Global Registry Engine
• Official Doctor Verification
• Healthcare Provider Verification
• MediRate Global
• Evidence-Based Ratings
• Google/Search Bridge
• Maps
• Contact Architecture
• Booking Architecture
• Health Memory / Personal Health Record
• EHR-ready Architecture
• PharmaLink
• VitalSync
• MindMend
• HealthQuest
• MedPassport
• Family Shield
• Predictive Health
• Academy / MCQ
• Clinical Glassroom
• AlphaFold / Advanced Biomedical Intelligence
• Multi-AI Gateway
• Controlled Agentic Architecture
• Offline/Local Fallback
• Source Provenance
• Privacy
• Compliance-ready architecture
• OmniShield Security Engine
• OmniIntegrity Engine
• MediRate Integrity Engine
• Security Monitoring
• Incident Response
• High Availability
• Backup / Disaster Recovery
• Supply-Chain Security
• AI Output Security
The platform must be built as a scalable modular healthcare operating system, not as one monolithic conversational interface.
2. GOLDEN ARCHITECTURAL PRINCIPLES
Every architectural and implementation decision must preserve:
• Medical safety first.
• Evidence before generation.
• Verified data before unverified claims.
• Official data must always be distinguished from third-party data.
• AI must never fabricate medical facts.
• AI must never fabricate doctors.
• AI must never fabricate hospitals.
• AI must never fabricate licenses.
• AI must never fabricate ratings.
• AI must never fabricate citations.
• AI must never fabricate API results.
• No rating is equivalent to professional accreditation.
• Google Search results are discovery data, not professional verification.
• Third-party reviews are not official credentials.
• Official Portal is not the same as Official Verification.
• Local YemenMD data must remain available as an offline/local fallback.
• API failure must not crash the application.
• Secrets must never be exposed to the client.
• Every external source must have provenance.
• High-risk medical questions require safety escalation.
• Emergency symptoms must trigger emergency behavior.
• The model is never the final safety boundary.
• All external tools must be controlled.
• Agents must never have unrestricted access to the internet.
• Least privilege must apply to users, services, agents and tools.
• Every sensitive operation must be auditable.
• The architecture must support multiple AI providers.
• Provider-specific capabilities must remain behind abstraction layers.
• Configured APIs must not be represented as active unless actually integrated and tested.
• Existing APIs, URLs, environment variables and integrations must not be deleted merely because they are not part of the first build.
3. PRODUCT IDENTITY
English
OmniDoctor AI
Arabic
الطبيب المعجزة AI
Product Description
A global intelligent medical and healthcare platform capable of understanding:
• medical questions
• symptoms
• diseases
• medications
• laboratory results
• prescriptions
• medical reports
• medical documents
• clinical images
• voice input
while connecting users with:
• reliable medical knowledge
• drug intelligence
• healthcare providers
• official registries
• healthcare facilities
• evidence sources
through a secure, privacy-aware, clinically safe and modular architecture.
4. TARGET PLATFORMS
Phase 1
Web Application
Phase 2
Progressive Web App
Phase 3
Capacitor / Android APK
Phase 4
iOS Application
The architecture must remain platform-independent wherever possible.
5. GLOBAL SYSTEM ARCHITECTURE
Official logical architecture:
USER ↓ FRONTEND ↓ INPUT SECURITY ↓ IDENTITY / PERMISSION ↓ OMNISHIELD SECURITY ENGINE ↓ API GATEWAY ↓ INTENT DETECTION ↓ CLINICAL RISK CLASSIFICATION ↓ MEDICAL NORMALIZATION ↓ EVIDENCE RETRIEVAL ↓ CONTROLLED AGENTS / CONTROLLED TOOLS ↓ CLINICAL REASONING ↓ CLINICAL SAFETY VALIDATION ↓ AI OUTPUT VALIDATION ↓ CITATION / PROVENANCE ↓ PRIVACY FILTER ↓ FINAL RESPONSE 
External architecture:
OmniDoctor AI │ Security Perimeter │ OmniShield │ API Gateway │ Request Validation │ ┌─────┴─────────┐ │ │ Clinical Safety Security Policy │ │ └──────┬────────┘ │ Multi-AI Gateway │ Controlled Agents │ Controlled Tools │ External Medical Sources 
6. CORE AI MEDICAL COMPANION
The primary interface is a conversational medical assistant.
Capabilities:
• Ask medical questions.
• Explain diseases.
• Explain symptoms.
• Explain medications.
• Explain laboratory tests.
• Explain medical reports.
• Analyze uploaded documents.
• Analyze medical images where technically supported.
• Search medical knowledge.
• Compare medications.
• Explain interactions.
• Identify red flags.
• Recommend appropriate level of care.
• Find nearby healthcare facilities.
• Find healthcare professionals.
• Respond in the user's language.
• Respond using supported dialects.
• Provide voice interaction.
• Maintain controlled health memory.
• Provide educational support.
7. OMNICONSULT
OmniConsult is the structured clinical consultation subsystem.
It is not merely chat.
It must support:
• structured history taking
• symptom analysis
• clinical reasoning
• differential reasoning
• red-flag detection
• clinical decision support
• safety escalation
• evidence retrieval
• appropriate-care recommendations
8. CLINICAL 7-STEP PROTOCOL
OmniConsult must support the Clinical 7-Step Protocol.
Conceptually:
1. Patient Context 2. Chief Complaint 3. History 4. Examination / Available Findings 5. Differential Reasoning 6. Safety / Risk Assessment 7. Recommendation / Next Step 
The exact implementation may evolve, but the protocol must remain structured and auditable.
9. OLDCARTS
For symptom assessment, support:
• Onset
• Location
• Duration
• Character
• Aggravating factors
• Relieving factors
• Radiation
• Timing / associated context
• Severity
The system should ask only clinically relevant follow-up questions rather than interrogating users unnecessarily.
10. CLINICAL SAFETY ENGINE
The Clinical Safety Engine sits between user intent and the generated response.
Official pipeline:
User Input ↓ Intent Detection ↓ Clinical Risk Classification ↓ Medical Normalization ↓ Evidence Retrieval ↓ Clinical Reasoning ↓ Safety Validation ↓ Response Generation ↓ Output Validation ↓ Citation / Source Layer ↓ Final Answer 
Risk levels:
Level 0 — General Information
Educational information with no immediate clinical concern.
Level 1 — Low Risk
Common symptoms and basic medication questions.
Level 2 — Moderate Risk
Potentially clinically significant situations requiring professional evaluation.
Level 3 — High Risk
Examples:
• potentially serious disease
• dangerous interaction
• abnormal laboratory result
• pregnancy-related concern
• pediatric concern
• severe allergy
• significant medication risk
Level 4 — Emergency
Possible:
• myocardial infarction
• stroke
• severe respiratory distress
• anaphylaxis
• severe bleeding
• unconsciousness
• seizure
• poisoning
• severe trauma
• suicidal emergency
• other life-threatening conditions
Level 4 must prioritize immediate emergency assistance.
11. EMERGENCY ENGINE
When emergency criteria are detected:
• Stop ordinary lengthy reasoning.
• Clearly identify the emergency warning.
• Recommend immediate emergency medical care.
• Provide appropriate local emergency pathway when reliable local data exists.
• Offer nearby emergency facilities.
• Never falsely claim emergency capability for a facility.
• Never fabricate emergency numbers.
• Do not provide dangerous procedural instructions.
• Preserve the safety-first response hierarchy.
12. DIFFERENTIAL REASONING
The system may provide structured differential reasoning.
It must:
• distinguish possibilities from diagnoses
• rank possibilities only when evidence supports ranking
• identify missing information
• request clinically relevant clarification
• cite evidence where appropriate
• identify red flags
• never present AI differential reasoning as a confirmed diagnosis.
13. CLINICAL DECISION SUPPORT
Clinical Decision Support must provide:
• relevant considerations
• possible risks
• medication safety considerations
• evidence
• recommended next steps
• escalation criteria
It must not falsely imply autonomous physician-level diagnosis or treatment authorization.
14. MEDICATION SAFETY FRAMEWORK
Medication safety is a first-class subsystem.
It must include:
Five Rights
• Right Patient
• Right Drug
• Right Dose
• Right Route
• Right Time
Where appropriate, expand to additional medication-safety checks.
Medication Reconciliation
Compare:
• current medications
• newly entered medications
• prescription OCR
• historical medications
• known allergies
• known conditions
Safety Checks
• duplicate therapy
• duplicate active ingredient
• dose safety
• interaction safety
• contraindication checks
• allergy checks
• drug-disease interactions
• food interactions
• pregnancy considerations
• renal considerations
• hepatic considerations
• pediatric considerations
• geriatric considerations
15. DRUG INTELLIGENCE ENGINE
For every drug request, attempt to resolve:
• Brand name
• Generic name
• Active ingredients
• Strength
• Dosage form
• Therapeutic class
• Indications
• Contraindications
• Warnings
• Adverse effects
• Drug interactions
• Food interactions
• Pregnancy considerations
• Renal considerations
• Hepatic considerations
• Pediatric considerations
• Geriatric considerations
• Alternatives
• Duplicate ingredients
• Therapeutic alternatives
• Regulatory/reference sources
YemenMD must remain available as local fallback.
16. GLOBAL DRUG DATABASE
Potential sources:
• Drugs.com
• Medscape
• RxNav
• OpenFDA
• DailyMed
• PubChem
• ChEMBL
• NLM
• NIH resources
Existing configuration includes:
• DRUGS_COM_MTM_URL
• MEDSCAPE_DRUG_URL
• RXNAV_API_URL
• OPENFDA_API_URL
• DAILYMED_API_URL
• PUBCHEM_API_URL
• CHEMBL_API_URL
17. DRUG EVIDENCE HIERARCHY
When sources disagree:
• Official regulatory source
• Government / NIH source
• Official clinical reference
• Recognized medical database
• Secondary medical source
• Search engine discovery
• User-generated content
The system must not reverse this hierarchy merely because a lower-ranked source appears first.
18. DRUG INTERACTION ENGINE
Detect:
• Drug–drug interactions
• Drug–food interactions
• Drug–disease interactions
• Duplicate therapy
• Duplicate active ingredient
• Contraindicated combinations
• Major/minor severity
• Mechanism where available
• Recommended clinical action
• Evidence
• Source
Example:
Drug A + Drug B ↓ Interaction Detection ↓ Severity ↓ Mechanism ↓ Evidence ↓ Recommended Action ↓ Source 
19. MEDICAL OCR
Support:
• prescriptions
• laboratory reports
• medical documents
• medication labels
• clinical notes
Pipeline:
Image ↓ File Validation ↓ OCR / Multimodal AI ↓ Text Extraction ↓ Medical Entity Recognition ↓ Normalization ↓ Evidence Retrieval ↓ Safety Validation ↓ Explanation 
Never silently invent unreadable text.
If confidence is low:
النص غير واضح، يرجى التقاط صورة أوضح.
20. PRESCRIPTION INTELLIGENCE
Detect:
• Drug
• Strength
• Frequency
• Route
• Duration
• Quantity
• Instructions
• Prescriber information where visible
Clearly distinguish:
Detected from image
from:
Clinically interpreted
Uncertain OCR must never be represented as confirmed prescription instructions.
21. LABORATORY INTELLIGENCE
Support:
• CBC
• HbA1c
• Glucose
• Lipid profile
• Liver function
• Kidney function
• Electrolytes
• Thyroid tests
• Cardiac biomarkers
• Inflammatory markers
• Other common laboratory panels
For each result:
• Test name
• Result
• Unit
• Reference range
• High/low classification
• Possible significance
• Context required
• Red flags
• Recommendation for professional assessment where appropriate
Never diagnose solely from one laboratory value.
22. MEDICAL IMAGE INTELLIGENCE
Support multimodal analysis where technically available.
Potential inputs:
• X-ray
• CT
• MRI
• Skin images
• Medical photographs
• Other clinical images
Use language such as:
AI-assisted interpretation
Never:
This is a confirmed diagnosis.
High-risk findings must recommend professional clinical/radiological assessment.
23. MEDICAL RAG
Medical RAG is foundational.
Question ↓ Query Classification ↓ Medical Entity Extraction ↓ Search ↓ Source Ranking ↓ Evidence Extraction ↓ Context Construction ↓ AI Reasoning ↓ Citation Generation ↓ Safety Validation 
Evidence retrieval should be preferred over unsupported internal generation.
24. VISUAL RAG
Visual RAG combines:
• image understanding
• OCR
• medical knowledge retrieval
• drug databases
• laboratory knowledge
• clinical references
Example:
Prescription Image ↓ OCR ↓ Drug Normalization ↓ Drug Database ↓ Interaction Check ↓ Medication Safety ↓ Final Explanation 
25. MEDICAL KNOWLEDGE DOMAINS
Eventually cover:
• Internal medicine
• Cardiology
• Neurology
• Pediatrics
• Obstetrics & gynecology
• Dermatology
• Psychiatry
• Gastroenterology
• Pulmonology
• Nephrology
• Endocrinology
• Infectious disease
• Oncology
• Ophthalmology
• ENT
• Orthopedics
• Rheumatology
• Urology
• Dentistry
• Emergency medicine
• Clinical pharmacy
• Toxicology
• Nutrition
• Public health
26. MEDICAL TERMINOLOGY NORMALIZATION
Examples:
User:
حبوب الضغط
Internal:
Hypertension medication
User:
سكر تراكمي
Internal:
HbA1c
User:
سيولة
Internal:
Anticoagulation / coagulation-related context
Normalization occurs before evidence retrieval.
27. YEMENMD
YemenMD remains a core regional subsystem.
It contains local:
• Medicines
• Laboratory tests
• Emergency-care information
• Chat history/local data
• Offline pharmaceutical information
Existing Room database entities include:
• DrugEntity
• LabTestEntity
• EmergencyCareEntity
• ChatMessageEntity
Database:
YemenMD.db
Existing local formulary data must remain available.
28. OFFLINE / LOCAL FALLBACK
If external AI/API services fail:
• Search local database.
• Return verified local information.
• Explain that external services are unavailable.
• Never fabricate missing information.
Offline capability should support:
• drug lookup
• basic drug information
• saved conversations
• emergency information
• basic medical reference data
29. HEALTH MEMORY / PERSONAL HEALTH RECORD
Health Memory is a controlled personal health record layer.
Potential information:
• medical history
• allergies
• medications
• previous investigations
• laboratory history
• chronic conditions
• relevant reports
• controlled health preferences
Memory categories must be distinguished:
Current Conversation Context Saved Medical Information Temporary Uploaded Documents User Preferences 
The AI must never infer a permanent medical fact from casual conversation.
The user must control:
• save
• view
• edit
• delete
• export
• export
30. EHR-READY ARCHITECTURE
OmniDoctor must be EHR-ready, but must not falsely claim to be a certified EHR.
The architecture should support future interoperability with healthcare systems through:
• structured clinical data
• patient identity boundaries
• encounter models
• medication models
• laboratory models
• observation models
• document models
• provenance
• authorization
• audit
• interoperability adapters
Certification/compliance must never be implied unless formally obtained.
31. MEDPASSPORT
MedPassport is a portable user-controlled health profile.
It may contain authorized:
• medical history
• allergies
• medications
• laboratory history
• relevant documents
• emergency information
Capabilities:
• export
• controlled sharing
• permission management
• revocation
• expiration
• audit
No third party should receive data without explicit authorization.
32. FAMILY SHIELD
Family Shield provides family health management.
Architecture:
Family Account ├── Member A ├── Member B ├── Member C └── Member D 
Each member must have:
• separate identity
• separate medical data
• separate permissions
• separate history
Family access must not imply unrestricted access to every individual's health information.
33. PHARMALINK
PharmaLink connects users to pharmacy and pharmaceutical services.
Capabilities may include:
• drug availability
• pharmacy discovery
• medication information
• pharmacy contact
• service discovery
• future prescription workflows
Commercial information must remain clearly separated from medical information.
A sponsored pharmacy must not influence clinical recommendations.
34. VITALSYNC
VitalSync is the future health-device integration layer.
Potential inputs:
• heart rate
• blood pressure
• oxygen saturation
• temperature
• glucose
• activity
• sleep
• other supported health-device measurements
Every device value requires:
• source
• timestamp
• unit
• validation
• confidence
• device metadata where available
Device data must never automatically become a diagnosis.
35. MINDMEND
MindMend is the mental-health support layer.
It provides:
• emotional support
• psychoeducation
• coping education
• wellness guidance
• mental-health resource navigation
High-risk situations require specialized escalation.
For crisis indicators, the system must prioritize safety and appropriate professional/emergency support rather than ordinary conversational behavior.
36. HEALTHQUEST
HealthQuest is the health education and motivation layer.
Potential capabilities:
• health education
• healthy habits
• reminders
• wellness goals
• educational challenges
• progress tracking
It must not use unsafe gamification that pressures users into harmful health behavior.
37. PREDICTIVE HEALTH
Predictive Health is a future analytical layer.
It may identify:
• trends
• risk patterns
• changes over time
• potential areas requiring attention
Predictions must never be presented as confirmed diagnoses.
Use explicit language such as:
• possible trend
• risk indicator
• pattern detected
• requires professional evaluation
38. ACADEMY / MCQ
Academy is the medical education platform.
Capabilities:
• medical lessons
• clinical cases
• MCQs
• explanations
• scoring
• progress
• learning paths
• revision
The system should distinguish educational content from direct patient clinical recommendations.
39. CLINICAL GLASSROOM
Clinical Glassroom is an advanced educational/clinical simulation environment.
Potential capabilities:
• clinical cases
• differential reasoning exercises
• drug safety cases
• laboratory cases
• imaging education
• simulated clinical workflows
• evidence-based decision exercises
It is primarily educational and must not be mistaken for autonomous clinical practice.
40. ALPHAFOLD / ADVANCED BIOMEDICAL INTELLIGENCE
Advanced Biomedical Intelligence is a future research/education layer.
Potential areas:
• protein structure
• molecular biology
• biomedical research
• drug discovery education
• advanced biomedical datasets
• research literature
This layer is not part of direct clinical diagnosis.
AlphaFold or equivalent biomedical capabilities must be treated as research/education functionality unless separately validated for a specific clinical use.
41. VOICE SYSTEM
Input:
Speech-to-text.
Output:
Text-to-speech.
Features:
• male medical voice
• female medical voice
• automatic voice response
• manual playback
• language-aware pronunciation
• Arabic
• dialect-aware interaction
• offline native TTS where available
Existing Android Native TextToSpeech implementation must remain supported.
42. GLOBAL LANGUAGE ENGINE
Automatic language detection.
Supported/documented languages:
• All languages (global). Arabic is the native/default system language and the primary authored locale.
43. ARABIC DIALECT ENGINE
Support:
• Modern Standard Arabic
• Yemeni Arabic
• Gulf Arabic
• Egyptian Arabic
• Levantine Arabic
• Maghrebi Arabic
• Iraqi Arabic where supported
The system must understand dialects while preserving medically precise terminology.
44. MULTI-AI GATEWAY
The architecture must use:
Multi-AI Gateway
not merely a Provider Router.
The Gateway is responsible for unified management of:
• Gemini
• Groq
• OpenAI
• OpenRouter
• Together AI
• DeepSeek
• Hugging Face
Responsibilities:
• provider abstraction
• model selection
• task routing
• availability
• latency
• timeout
• retry
• failover
• usage tracking
• cost tracking where available
• capability matching
• security policy
• structured output normalization
45. PROVIDER ROUTER
Create:
AIProviderRouter
Example:
Medical Chat → Gemini Fast Reasoning → Groq Alternative Generation → OpenAI/OpenRouter/Together Multimodal → Gemini-capable model 
The exact model must remain configurable.
Provider-specific functionality must never be hard-coded throughout the application.
46. GEMINI INTEGRATION
Gemini is the initial primary AI provider for the new build.
Implementation must use currently supported Google AI Studio/Gemini capabilities available at implementation time.
The architecture must not make current API behavior a permanent specification constraint.
Use server-side secrets.
Never expose:
GEMINI_API_KEY
to browser/client JavaScript.
Provider abstraction must allow future replacement or addition of providers.
47. FUNCTION CALLING
Controlled functions may include:
• searchDrug()
• checkDrugInteraction()
• searchDoctor()
• verifyDoctor()
• searchHealthcareFacility()
• searchMedicalEvidence()
• analyzeLab()
• searchGlobalDirectory()
• getOfficialRegistry()
• analyzeLab()
• getOfficialRegistry()
AI must never invent tool results.
48. STRUCTURED MEDICAL OUTPUT
Important medical responses should use structured objects.
Conceptual:
MedicalResponse ├── answer ├── clinicalRisk ├── redFlags[] ├── recommendations[] ├── medications[] ├── interactions[] ├── sources[] ├── confidence ├── requiresProfessionalEvaluation └── emergency 
The UI renders the structured result naturally.
49. AGENTIC ARCHITECTURE
OmniDoctor uses Controlled Agents, not unrestricted autonomous agents.
Core agents:
Medical Agent
General medical assistance.
Clinical Agent
Clinical reasoning and structured consultation.
Drug Agent
Pharmacology and medication safety.
Diagnostic Support Agent
Differential reasoning support.
Evidence Agent
Authoritative evidence retrieval.
Emergency Agent
High-risk/emergency handling.
OCR Agent
Document and image extraction.
Doctor Directory Agent
Healthcare professional discovery.
Verification Agent
Official registry verification.
MediRate Agent
Rating aggregation and integrity.
Translation Agent
Language/dialect adaptation.
Additional agents may be added.
Every agent must operate through controlled tools.
50. AGENT PERMISSION MATRIX
AgentRead MedicalDrug ToolsDirectoryVerificationUser DataMedical Agent✓Limited✗✗According to permissionClinical Agent✓Limited✗✗According to permissionDrug Agent✓✓✗✗LimitedEvidence Agent✓✓✓✗✗Emergency Agent✓✓✓Read-onlyAccording to permissionOCR AgentLimitedLimited✗✗According to document permissionTranslation AgentLimited✗✗✗According to permissionVerification Agent✗✗✓✓✗MediRate Agent✗✗✓Read-only✗Doctor Directory Agent✗✗✓Read-only✗ 
Agents must have least-privilege permissions.
For example:
Drug Agent cannot modify doctor verification or MediRate.
51. GLOBAL DOCTOR & HEALTHCARE DIRECTORY
The Global Doctor & Healthcare Directory is a native OmniDoctor module.
Architecture:
OmniDoctor AI ├── Medical AI ├── Drug Intelligence ├── Medical RAG ├── Clinical Safety ├── YemenMD ├── Healthcare Directory │ ├── Doctors │ ├── Hospitals │ ├── Clinics │ ├── Pharmacies │ ├── Laboratories │ └── Institutions └── MediRate Global 
52. DOCTOR PROFILE
Potential fields:
• Name
• Specialty
• Subspecialty
• Country
• Region
• City
• Institution
• Professional registration
• License number where publicly available
• Licensing authority
• Verification status
• Official registry URL
• Official profile URL
• Practice information
• Languages
• Public professional information
• Third-party ratings
• Google/Search discovery
• Provenance
53. MEDIRATE GLOBAL
MediRate Global is the rating/evidence layer.
It must never imply that a rating is a professional credential.
Separate clearly:
Official Verified Data
Confirmed through authoritative professional/government registry.
Official Portal
Link to official regulatory/professional portal.
Third-Party Rating
Independent rating platform.
Google/Search Discovery
Search-discovered information.
These categories must be visually and semantically distinct.
54. CLAIM PROFILES
Every doctor/provider profile must support structured claims.
A Claim Profile records:
• claim
• claim type
• source
• source type
• evidence
• verification status
• confidence
• retrievedAt
• lastVerifiedAt
• expiration where applicable
A claim must never become verified merely because it exists in a search result.
55. VERIFICATION WORKFLOW
Official verification:
Registry Source ↓ Verification Engine ↓ Evidence ↓ Identity Matching ↓ Verification Decision ↓ Immutable Audit Record 
Verification states:
• OFFICIAL_VERIFIED
• OFFICIAL_RECORD_FOUND
• OFFICIAL_PORTAL_AVAILABLE
• INSTITUTION_VERIFIED
• THIRD_PARTY_ONLY
• SEARCH_DISCOVERED
• UNVERIFIED
• VERIFICATION_UNAVAILABLE
• PENDING_REVIEW
56. VERIFICATION HIERARCHY
• Official government registry
• Official medical council
• Official professional licensing authority
• Official hospital/institution
• Recognized professional organization
• Third-party platform
• Google/Search discovery
Only appropriate authoritative sources can establish official verification.
57. GLOBAL REGISTRY ENGINE
Create:
GlobalRegistryEngine
Responsibilities:
• identify country
• identify regulatory authority
• locate official registry
• search professional record
• normalize record
• store evidence
• assign verification state
• timestamp verification
• retain provenance
58. COUNTRY / REGION REGISTRY ARCHITECTURE
Configuration:
CountryRegistry ├── country ├── region ├── authority ├── registryName ├── registryURL ├── searchURL ├── verificationMethod ├── fields ├── supportedSpecialties └── status 
New countries must be addable without rewriting the application core.
59. IDENTITY MATCHING
Avoid false positives.
Match combinations of:
• Name
• License number
• Country
• Specialty
• Institution
• Location
Never merge two doctors solely because their names are identical.
60. VERIFICATION CONFIDENCE
HIGH
Official registry confirms identity/license.
MEDIUM
Official institution/professional source confirms some information.
LOW
Third-party source only.
UNKNOWN
Insufficient evidence.
61. VERIFICATION TAMPERING PROTECTION
An ordinary administrator must not manually convert:
OFFICIAL_VERIFIED
into an arbitrary status.
Verification must follow:
Registry Source ↓ Verification Engine ↓ Evidence ↓ Identity Matching ↓ Decision ↓ Immutable Audit 
Every sensitive modification records:
• actor
• what changed
• reason
• source
• time
• previous value
• new value
62. MEDIRATE INTEGRITY ENGINE
Protect against:
• fake reviews
• review bombing
• duplicate accounts
• duplicate submissions
• automated reviews
• AI-generated review abuse
• coordinated manipulation
• suspicious rating patterns
• paid manipulation
• conflicts of interest
Workflow:
Detection ↓ Risk Score ↓ Moderation ↓ Evidence ↓ Decision ↓ Audit 
Negative reviews must not be deleted merely because they are negative.
63. RATING DATA MODEL
MediRateProfile ├── doctorId ├── officialVerification ├── institutionalVerification ├── thirdPartyRatings[] ├── ratingAverage ├── ratingCount ├── ratingSources[] ├── evidenceQuality ├── profileCompleteness ├── lastUpdated └── methodology 
64. RATING SOURCE TRANSPARENCY
For every rating:
• platform
• rating
• review count
• date
• URL
• source type
• methodology
Never hide the original source.
65. MEDIRATE RANKING
Ranking must not simply sort by stars.
Potential factors:
• official verification
• specialty relevance
• geographic relevance
• profile completeness
• evidence freshness
• rating volume
• rating quality
• source diversity
Methodology must be transparent.
66. NO PAID VERIFICATION
A professional or healthcare organization must never be able to purchase:
Official Verification
Commercial activity must not alter official verification.
67. SPONSORED PROFILES
If monetization is introduced:
Sponsored content must be clearly labeled.
Sponsorship must not:
• change license status
• change official verification
• fabricate ratings
• override safety warnings
• manipulate clinical recommendations
68. GOOGLE / SEARCH BRIDGE
Search may be used for discovery.
But:
Google Result ≠ Official Verification Google Result ≠ Medical License Google Result ≠ Professional Accreditation Google Result ≠ MediRate Verification 
Search results must carry explicit trust labels.
69. GLOBAL HEALTHCARE DIRECTORY
Support:
• Hospitals
• Clinics
• Medical centers
• Pharmacies
• Laboratories
• Diagnostic centers
• Universities
• Medical institutions
Every organization must have provenance.
70. HEALTHCARE FACILITY MODEL
HealthcareFacility ├── id ├── name ├── type ├── country ├── region ├── city ├── address ├── latitude ├── longitude ├── specialties[] ├── emergencyAvailable ├── phone ├── website ├── officialSource └── lastVerifiedAt 
71. MAPS & NEARBY HEALTHCARE
Use geolocation only with explicit permission.
Search:
• hospitals
• emergency departments
• pharmacies
• clinics
• laboratories
• medical centers
Existing Nominatim implementation:
• searches within radius
• calculates distances
• sorts by distance
• provides fallback when network fails
72. NOMINATIM / OPENSTREETMAP
Use:
OpenStreetMap / Nominatim
for:
• geocoding
• reverse geocoding
• nearby healthcare discovery
Existing endpoints:
https://nominatim.openstreetmap.org/search https://nominatim.openstreetmap.org/reverse 
The existing application User-Agent and Arabic/English headers must be retained.
73. CONTACT ARCHITECTURE
Healthcare profiles may expose:
• phone
• website
• map
• official portal
• contact method
Only publicly available or explicitly authorized contact information may be used.
74. BOOKING ARCHITECTURE
Future appointment/booking architecture must support:
• provider availability
• booking request
• booking status
• cancellation
• confirmation
• external booking portals
• audit
Booking must not be represented as active until actually integrated.
75. HEALTHCARE SEARCH TRUST MODEL
Distinguish:
Medical Knowledge Search
What is metformin?
Healthcare Provider Search
Find an endocrinologist.
Emergency Search
Nearest emergency hospital.
Each has a different trust and safety model.
76. SOURCE PROVENANCE SYSTEM
Every important external record should include:
• sourceName
• sourceType
• sourceURL
• retrievedAt
• country
• verificationLevel
• confidence
• sourcePriority
Example:
Source: WHO Type: Official Verification: Official Retrieved: 2026-08-21 
77. CITATION ENGINE
Medical responses should expose sources when appropriate.
Potential sources:
• FDA
• NIH
• WHO
• DailyMed
• Drugs.com
• Medscape
• PubChem
• official professional registry
Sources must be clickable in the UI where possible.
78. MEDICAL DISCLAIMER ENGINE
Disclaimers must be contextual.
General:
هذه المعلومات للتثقيف ولا تغني عن تقييم الطبيب.
High risk:
الأعراض المذكورة قد تحتاج إلى تقييم طبي عاجل.
Medication:
لا تغيّر الجرعة أو توقف الدواء دون استشارة الطبيب/الصيدلي.
Emergency:
إذا كانت هذه الأعراض موجودة الآن، اطلب المساعدة الطبية الطارئة فورًا.
79. PRIVACY ARCHITECTURE
Do not unnecessarily store:
• medical images
• personal health information
• identifying information
• voice recordings
�� sensitive documents
unless required and explicitly authorized.
Provide:
• Delete conversation
• Delete uploaded file
• Clear local history
• Account deletion
• Data export
• MedPassport export
• health-memory deletion
80. OMNISHIELD SECURITY & RESILIENCE ARCHITECTURE v2.0
OmniShield Security Engine is a dedicated central security layer.
It sits between:
User ↓ FrontEND ↓ API Gateway ↓ Security Layer ↓ Clinical Safety ↓ AI / Tools ↓ External APIs 
OmniShield includes:
• WAF
• DDoS protection
• Bot protection
• Rate limiting
• Abuse prevention
• Authentication protection
• Authorization
• Session security
• API security
• Input validation
• Output validation
• Prompt injection defense
• Tool injection defense
• SSRF protection
• CSRF protection
• XSS protection
• SQL injection protection
• NoSQL injection protection
• file security
• malware scanning
• URL validation
• domain allowlisting
• secret protection
• encryption
• audit logging
• anomaly detection
• intrusion detection
• incident response
• backup/recovery
• disaster recovery
81. SECURITY AND CLINICAL SAFETY SEPARATION
Do not merge Clinical Safety Engine and Security Engine.
Official structure:
OmniDoctor AI │ Security Perimeter │ OmniShield │ API Gateway │ Request Validation │ ┌────┴────────────┐ │ │ Clinical Safety Security Policy │ │ └───────┬─────────┘ │ Multi-AI Gateway │ Controlled Tools │ External Sources 
82. ANTI-DDOS / ANTI-DISRUPTION
System must resist:
• massive request volume
• bot attacks
• API abuse
• repeated AI requests
• file-upload flooding
• OCR flooding
• expensive multimodal requests
• file-upload flooding
Pipeline:
Edge Protection ↓ WAF ↓ Rate Limiter ↓ API Gateway ↓ Queue ↓ Service 
Controls:
• per-IP limits
• per-account limits
• per-device limits
• per-endpoint limits
• per-provider limits
• adaptive rate limiting
• burst control
• concurrency limits
• request quotas
83. AI ABUSE PROTECTION
Prompt Injection Defense must inspect:
• user prompt
• uploaded documents
• OCR text
• RAG documents
• web content
• tool responses
Because malicious instructions may originate from retrieved content rather than the user.
84. TOOL INJECTION DEFENSE
Never allow:
execute anything
Instead:
AI ↓ Tool Request ↓ Policy Validation ↓ Schema Validation ↓ Permission Check ↓ Tool ↓ Result Validation ↓ AI 
Every tool request must be:
• typed
• permission checked
• schema validated
• policy validated
• result validated
85. ANTI-TAMPERING
Create:
OmniIntegrity Engine
Protect:
• configuration
• medical knowledge
• drug database
• verification records
• ratings
• source metadata
• registry records
• audit logs
• application files
• deployment artifacts
Controls:
• immutable audit records
• checksums/hashes
• signed artifacts
• integrity verification
• versioning
• change tracking
• privileged approval workflow
86. SECRETS ARCHITECTURE
Never:
Frontend ↓ GEMINI_API_KEY 
Correct:
Frontend ↓ Authenticated API ↓ Backend ↓ Secret Manager ↓ Provider 
Keys must never appear in:
• frontend bundle
• source code
• logs
• browser console
• Git
• client storage
• public configuration
• error messages
• APK source/configuration
87. ZERO TRUST ARCHITECTURE
Principle:
Never Trust — Always Verify
Every:
• user
• device
• service
• API
• agent
• tool
• external source
must receive only the minimum required trust.
Apply:
Least Privilege
88. SECURE FILE PIPELINE
All uploaded files:
• PDF
• images
• prescriptions
• reports
• documents
must follow:
Upload ↓ File Type Validation ↓ Size Validation ↓ Magic-Byte Validation ↓ Malware Scan ↓ Sandbox ↓ Content Extraction ↓ OCR ↓ Medical Entity Extraction ↓ Prompt Injection Scan ↓ Clinical Safety ↓ RAG 
No uploaded file is ever executed.
89. SSRF DEFENSE
Especially because OmniDoctor uses:
• Google Bridge
• Nominatim
• medical sources
• registry URLs
• official portals
Block access to:
• localhost
• private IPs
• internal services
• metadata endpoints
• arbitrary ports
• internal network addresses
External requests require:
URL Validation + Domain Allowlist + Network Policy 
90. DATABASE SECURITY
Require:
• encryption at rest
• encryption in transit