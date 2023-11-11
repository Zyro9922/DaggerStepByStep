package com.oblique.daggerstepbystep

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.oblique.daggerstepbystep.utils.AppLogger
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

        val component = (application as UserApplication).userRegistrationComponent
        component.inject(this)
        userRegistrationService.registerUser("test@gmail.com", "test@1234")

        Log.d(AppLogger.TAG, "Hash code of emailService: ${emailService.hashCode()}")
        Log.d(AppLogger.TAG, "Hash code of emailService2: ${emailService2.hashCode()}")
    }
}