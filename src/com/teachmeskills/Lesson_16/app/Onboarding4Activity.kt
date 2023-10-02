package com.example.tms_an_15_homework_lesson_16

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Onboarding4Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding4)
    }
    override fun onPause() {
        super.onPause()
        val intent = Intent(this,RegistrationActivity::class.java)
        startActivity(intent)
    }
}