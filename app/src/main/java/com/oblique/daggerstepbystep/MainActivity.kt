package com.oblique.daggerstepbystep

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * The purpose of UserRegistrationService should only
         * be to register user.
         * Not create EmailService and UserRepository objects
         */
        val emailService = EmailService()
        val userRepository = UserRepository()

        val userRegistrationService = UserRegistrationService(emailService, userRepository)
        userRegistrationService.registerUser("test@gmail.com", "test@1234")
    }
}