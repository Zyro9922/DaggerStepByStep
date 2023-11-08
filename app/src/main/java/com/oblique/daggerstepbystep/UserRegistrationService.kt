package com.oblique.daggerstepbystep

class UserRegistrationService(private val emailService: EmailService, private val userRepository: UserRepository) {
    fun registerUser(email: String, password: String) {
        userRepository.saveUser(email, password)
        emailService.sendEmail(email, "Email body Lorem Ipsum")
    }
}