package com.example.mvvmdatabinding.viewmodel

import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel :ViewModel() {

    var username= MutableLiveData<String>()
    var pass= MutableLiveData<String>()
  var edittext= MutableLiveData<String>()
    var status= MutableLiveData<String>()

    fun updateUserName(v: View)
    {
        if(pass.value.equals("") || username.value.equals(""))
            status.value = "Fill All the variable"
        else
            status.value = "Logged"
    }

    val textWatcher : TextWatcher = object : TextWatcher{
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

        }

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            Log.v("TEXXTXTX",s.toString())
            username.value=s.toString()

        }

        override fun afterTextChanged(s: Editable?) {

        }
    }


    val textPaaWatcher : TextWatcher = object : TextWatcher{
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

        }

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            Log.v("TEXXTXTX",s.toString())
            pass.value=s.toString()

        }

        override fun afterTextChanged(s: Editable?) {

        }
    }

}