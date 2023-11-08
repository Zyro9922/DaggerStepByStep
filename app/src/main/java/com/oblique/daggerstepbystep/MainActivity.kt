package com.oblique.daggerstepbystep

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val daggerUserRegistrationComponent = DaggerUserRegistrationComponent.builder().build()
        daggerUserRegistrationComponent.getUserRegistrationService().registerUser("test@gmail.com", "test@1234")
    }
}