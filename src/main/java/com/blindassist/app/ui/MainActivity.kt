package com.blindassist.app.ui

import android.os.Bundle
import android.view.View
import android.view.accessibility.AccessibilityEvent
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // تعيين محتوى الواجهة
        setContentView(R.layout.activity_main)
        
        // تفعيل دعم الوصول
        enableAccessibility()
        
        // إعداد الأزرار والعناصر
        setupUI()
    }

    private fun enableAccessibility() {
        // تعيين وصف الوصول لجميع العناصر
        val mainView = findViewById<View>(R.id.main_container)
        ViewCompat.setAccessibilityDelegate(mainView, object : androidx.core.view.AccessibilityDelegateCompat() {
            override fun onInitializeAccessibilityNodeInfo(
                host: View,
                info: AccessibilityNodeInfoCompat
            ) {
                super.onInitializeAccessibilityNodeInfo(host, info)
                info.contentDescription = "تطبيق BlindAssist - مساعد للمكفوفين"
            }
        })
    }

    private fun setupUI() {
        // إعداد الأزرار الرئيسية
        val describeImageBtn = findViewById<View>(R.id.btn_describe_image)
        val communityBtn = findViewById<View>(R.id.btn_community)
        val profileBtn = findViewById<View>(R.id.btn_profile)

        // تعيين وصف الوصول
        describeImageBtn.contentDescription = "زر وصف الصور"
        communityBtn.contentDescription = "زر المجتمع"
        profileBtn.contentDescription = "زر الملف الشخصي"

        // تعيين المستمعين
        describeImageBtn.setOnClickListener {
            // الانتقال إلى صفحة وصف الصور
            announceForAccessibility("جاري الانتقال إلى صفحة وصف الصور")
        }

        communityBtn.setOnClickListener {
            // الانتقال إلى صفحة المجتمع
            announceForAccessibility("جاري الانتقال إلى صفحة المجتمع")
        }

        profileBtn.setOnClickListener {
            // الانتقال إلى صفحة الملف الشخصي
            announceForAccessibility("جاري الانتقال إلى صفحة الملف الشخصي")
        }
    }

    private fun announceForAccessibility(message: String) {
        val rootView = window.decorView.rootView
        rootView.announceForAccessibility(message)
    }
}
