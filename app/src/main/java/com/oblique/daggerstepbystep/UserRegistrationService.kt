package com.oblique.daggerstepbystep

import javax.inject.Inject

class UserRegistrationService @Inject constructor(private val notificationService: NotificationService, private val userRepository: UserRepository) {
    fun registerUser(email: String, password: String) {
        userRepository.saveUser(email, password)
        notificationService.send(email, "Email body Lorem Ipsum")
    }
}