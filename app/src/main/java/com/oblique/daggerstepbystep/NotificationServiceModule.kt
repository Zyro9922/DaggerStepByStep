package com.oblique.daggerstepbystep

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NotificationServiceModule(private val retryCount: Int) {

    @EmailQualifier
    @Provides
    fun getEmailService() : NotificationService{
        return EmailService()
    }
    @MessageQualifier
    @Provides
    fun getMessageService() : NotificationService{
        return MessageService(retryCount)
    }
}