package com.oblique.daggerstepbystep

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NotificationServiceModule {

    @MessageQualifier
    @Provides
    fun getEmailService() : NotificationService{
        return EmailService()
    }
    @NotificationQualifier
    @Provides
    fun getMessageService() : NotificationService{
        return MessageService()
    }
}