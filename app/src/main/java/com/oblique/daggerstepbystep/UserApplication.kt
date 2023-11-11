package com.oblique.daggerstepbystep

import android.app.Application

class UserApplication : Application() {

    lateinit var userRegistrationComponent: UserRegistrationComponent
    override fun onCreate() {
        super.onCreate()
        userRegistrationComponent = DaggerUserRegistrationComponent.builder()
            .notificationServiceModule(NotificationServiceModule(23))
            .build()
    }
}