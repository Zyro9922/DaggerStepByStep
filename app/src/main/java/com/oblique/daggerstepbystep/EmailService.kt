package com.oblique.daggerstepbystep

import android.util.Log
import com.oblique.daggerstepbystep.utils.AppLogger
import javax.inject.Inject

class EmailService @Inject constructor(){
    fun sendEmail(user_email: String, email_body: String){
        Log.d(AppLogger.TAG, "${this.javaClass.simpleName}: EmailService.sendEmail - Email sent successfully User Email: $user_email Email Body $email_body")
    }
}