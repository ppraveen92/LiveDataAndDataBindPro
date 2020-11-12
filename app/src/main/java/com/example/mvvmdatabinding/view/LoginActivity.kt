package com.example.mvvmdatabinding.view

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmdatabinding.R
import com.example.mvvmdatabinding.databinding.ActivityLoginBinding
import com.example.mvvmdatabinding.viewmodel.LoginViewModel

class LoginActivity : AppCompatActivity() {

    lateinit var binding : ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login)
        val viewModel=ViewModelProvider(this).get(LoginViewModel::class.java)

        binding.loginviewmodel=viewModel
        binding.lifecycleOwner =this

        viewModel.username.value=""
        viewModel.pass.value=""
        viewModel.status.observe(this, Observer {
            Toast.makeText(this,viewModel.status.value,Toast.LENGTH_SHORT).show()
        })


        viewModel.edittext.observe(this, Observer {
            Toast.makeText(this,it.toString(),Toast.LENGTH_SHORT).show()
        })

    }
}

fun Activity.ShowToastMessage(s:String){
    Toast.makeText(this,s,Toast.LENGTH_SHORT).show()
}