package com.oblique.daggerstepbystep

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    @Inject
    lateinit var emailService: EmailService
    @Inject
    lateinit var emailService2: EmailService
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerUserRegistrationComponent.builder()
            .notificationServiceModule(NotificationServiceModule(23))
            .build()
        component.inject(this)
        userRegistrationService.registerUser("test@gmail.com", "test@1234")
    }
}