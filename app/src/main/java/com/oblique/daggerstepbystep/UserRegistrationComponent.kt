package com.oblique.daggerstepbystep

import dagger.Component
import javax.inject.Singleton

@ApplicationScope
@Component(modules = [NotificationServiceModule::class])
interface UserRegistrationComponent {
    fun inject(mainActivity: MainActivity)

    fun getEmailService() : EmailService
}