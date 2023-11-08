package com.oblique.daggerstepbystep

import dagger.Module
import dagger.Provides

@Module
class NotificationServiceModule {

    @Provides
    fun getEmailService() : NotificationService{
        return EmailService()
    }

//    @Provides
//    fun getMessageService() : NotificationService{
//        return MessageService()
//    }
}