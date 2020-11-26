package com.example.mvvmdatabinding.viewmodel

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {
    var username = MutableLiveData<String>()
    var pass = MutableLiveData<String>()
    var edittext = MutableLiveData<String>()
    var status = MutableLiveData<String>()
    fun updateUserName(v: View) {
        if (pass.value.equals("") || username.value.equals(""))
            status.value = "Fill All the variable"
        else
            status.value = "Logged"
    }
}