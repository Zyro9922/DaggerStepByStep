package com.oblique.daggerstepbystep

import dagger.Component

@Component(modules = [NotificationServiceModule::class])
interface UserRegistrationComponent {
    fun inject(mainActivity: MainActivity)
}