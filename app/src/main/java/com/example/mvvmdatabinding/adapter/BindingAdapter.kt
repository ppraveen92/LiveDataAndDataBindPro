package com.example.mvvmdatabinding

import android.text.TextWatcher
import android.widget.EditText
import androidx.databinding.BindingAdapter

@BindingAdapter("app:textWatchher")
fun textWatcher(view:EditText,textWatcher:TextWatcher)
{
    view.addTextChangedListener(textWatcher)
}

@BindingAdapter("app:textPassWatcher")
fun passwatcher(view: EditText,textWatcher: TextWatcher)
{
    view.addTextChangedListener(textWatcher)
}

