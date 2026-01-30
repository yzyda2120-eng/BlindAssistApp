# BlindAssist - تطبيق أندرويد 📱

تطبيق أندرويد متكامل لمساعدة المكفوفين وضعاف البصر على استخدام التكنولوجيا بسهولة.

## 🎯 الميزات

### المرحلة الأولى: الواجهة الأساسية
- ✅ واجهة رئيسية سهلة الاستخدام
- ✅ دعم كامل لـ TalkBack (قارئ الشاشة)
- ✅ أزرار كبيرة وسهلة الضغط
- ✅ وصف الوصول (Accessibility) لجميع العناصر
- ✅ دعم اللغة العربية

### المرحلة الثانية: الميزات الأساسية
- وصف الصور باستخدام الذكاء الاصطناعي
- التعرف على الأشياء في الصور
- استخراج النصوص من الصور
- تحويل النص إلى كلام
- تحويل الكلام إلى نص

### المرحلة الثالثة: المجتمع
- منصة اجتماعية للمكفوفين
- غرف دردشة صوتية
- مشاركة التجارب والنصائح

## 📋 المتطلبات

- Android 5.0 (API 21) أو أعلى
- Java 11 أو أعلى
- Android Studio 2022.1 أو أعلى
- Gradle 8.0 أو أعلى

## 🔧 التثبيت والبناء

### 1. استنساخ المشروع
```bash
git clone https://github.com/yourusername/BlindAssistApp.git
cd BlindAssistApp
```

### 2. فتح المشروع في Android Studio
```bash
# أو يمكنك فتح المشروع مباشرة من Android Studio
```

### 3. بناء التطبيق
```bash
# باستخدام Gradle
./gradlew build

# أو من خلال Android Studio
# Build > Build Bundle(s) / APK(s) > Build APK(s)
```

### 4. تشغيل التطبيق
```bash
# على جهاز محاكي أو هاتف فعلي
./gradlew installDebug

# أو من خلال Android Studio
# Run > Run 'app'
```

## 📦 بناء APK

### Debug APK
```bash
./gradlew assembleDebug
# سيتم حفظ الملف في: app/build/outputs/apk/debug/app-debug.apk
```

### Release APK
```bash
./gradlew assembleRelease
# سيتم حفظ الملف في: app/build/outputs/apk/release/app-release.apk
```

## 🏗️ هيكل المشروع

```
BlindAssistApp/
├── src/
│   └── main/
│       ├── java/com/blindassist/app/
│       │   ├── ui/              # الواجهات
│       │   ├── data/            # نماذج البيانات
│       │   ├── network/         # الاتصالات
│       │   └── utils/           # الأدوات المساعدة
│       ├── res/
│       │   ├── layout/          # ملفات الواجهات
│       │   ├── values/          # النصوص والألوان والأنماط
│       │   ├── drawable/        # الصور والرسومات
│       │   └── menu/            # القوائم
│       └── AndroidManifest.xml
├── build.gradle
├── settings.gradle
└── README.md
```

## 🔐 الأمان

- جميع الاتصالات تستخدم HTTPS
- كلمات المرور مشفرة
- لا يتم تخزين بيانات حساسة محلياً

## ♿ الوصول (Accessibility)

التطبيق مصمم بالكامل مع مراعاة الوصول للمكفوفين:

- ✅ دعم كامل لـ TalkBack
- ✅ أزرار بحجم كافي (48dp على الأقل)
- ✅ وصف الوصول لجميع العناصر
- ✅ تباين لوني عالي
- ✅ دعم اللغة العربية الكاملة

## 🧪 الاختبار

### اختبار الوصول
1. فعّل TalkBack من الإعدادات
2. استخدم الإيماءات للتنقل
3. تأكد من أن جميع العناصر يمكن الوصول إليها

### اختبار الأداء
```bash
./gradlew connectedAndroidTest
```

## 📝 الترخيص

هذا المشروع مرخص تحت رخصة MIT - انظر ملف [LICENSE](LICENSE) للتفاصيل.

## 🤝 المساهمة

نرحب بمساهماتك! يرجى:

1. عمل Fork للمشروع
2. إنشاء فرع جديد (`git checkout -b feature/AmazingFeature`)
3. الالتزام بالتغييرات (`git commit -m 'Add some AmazingFeature'`)
4. دفع الفرع (`git push origin feature/AmazingFeature`)
5. فتح Pull Request

## 📞 التواصل

- البريد الإلكتروني: info@blindassist.com
- الموقع: https://blindassist.com
- GitHub: https://github.com/blindassist

## 🙏 شكر خاص

شكراً لجميع المساهمين والمستخدمين الذين يساعدوننا على تحسين هذا المشروع!

---

**ملاحظة**: هذا المشروع لا يزال قيد التطوير. نرحب بملاحظاتك واقتراحاتك!
