package com.oblique.daggerstepbystep

import android.util.Log
import com.oblique.daggerstepbystep.utils.AppLogger
import javax.inject.Inject

class UserRepository @Inject constructor(){
    fun saveUser(email: String, password: String){
        Log.d(AppLogger.TAG, "${this.javaClass.simpleName}: UserRepository.saveUser - User saved successfully Email $email Password $password")
    }
}