package com.example.mvvmdatabinding

import android.app.Activity
import android.app.ProgressDialog.show
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.example.mvvmdatabinding.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    lateinit var binding : ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_login)
        val viewModel=ViewModelProvider(this).get(LoginViewModel::class.java)

        binding.loginviewmodel=viewModel
        binding.lifecycleOwner =this

        viewModel.username.value=""
        viewModel.pass.value=""
        viewModel.status.observe(this, Observer {
            Toast.makeText(this,viewModel.status.value,Toast.LENGTH_SHORT).show()
        })


    }
}

fun Activity.ShowToastMessage(s:String){
    Toast.makeText(this,s,Toast.LENGTH_SHORT).show()
}