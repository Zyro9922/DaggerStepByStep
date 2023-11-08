package com.oblique.daggerstepbystep

import javax.inject.Inject

class UserRegistrationService @Inject constructor(private val emailService: EmailService, private val userRepository: UserRepository) {
    fun registerUser(email: String, password: String) {
        userRepository.saveUser(email, password)
        emailService.sendEmail(email, "Email body Lorem Ipsum")
    }
}