package com.oblique.daggerstepbystep

import android.util.Log
import com.oblique.daggerstepbystep.utils.AppLogger

class UserRepository {
    fun saveUser(email: String, password: String){
        Log.d(AppLogger.TAG, "${this.javaClass.simpleName}: UserRepository.saveUser - User saved successfully Email $email Password $password")
    }
}