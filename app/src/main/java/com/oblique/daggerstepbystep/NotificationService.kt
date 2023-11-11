package com.oblique.daggerstepbystep

import android.util.Log
import com.oblique.daggerstepbystep.utils.AppLogger
import javax.inject.Inject
import javax.inject.Singleton

interface NotificationService {
    fun send(user_email: String, email_body: String)
}
@Singleton
class EmailService @Inject constructor() : NotificationService{
    override fun send(user_email: String, email_body: String){
        Log.d(AppLogger.TAG, "${this.javaClass.simpleName}: EmailService.send - Email sent successfully User Email: $user_email Email Body $email_body")
    }
}

class MessageService @Inject constructor(private val retryCount: Int) : NotificationService{
    override fun send(user_email: String, message_body: String){
        Log.d(AppLogger.TAG, "${this.javaClass.simpleName}: MessageService.send - MessageService sent successfully User Email: $user_email Message Body $message_body Retry Count $retryCount")
    }
}