package com.oblique.daggerstepbystep

import dagger.Component

@Component
interface UserRegistrationComponent {
    fun getUserRegistrationService() : UserRegistrationService
}