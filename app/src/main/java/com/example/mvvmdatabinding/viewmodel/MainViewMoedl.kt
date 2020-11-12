package com.example.mvvmdatabinding.viewmodel

import android.os.CountDownTimer
import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewMoedl :ViewModel() {


//    lateinit var timer:CountDownTimer
//
//    var countLiveData = MutableLiveData<Int>()



  /*  fun setTimer()
    {
        timer = object :CountDownTimer(10000,1000){
            override fun onTick(millisUntilFinished: Long) {
                val time = millisUntilFinished/1000
                countLiveData.value=time.toInt()

            }

            override fun onFinish() {
                //finishLivedata.value = "done"
            }

        }.start()
    }*/

    var textupdate=MutableLiveData<String>()
    var btntext=MutableLiveData<String>()


    fun clickView(view: View){
         textupdate.value = "helllooo guys"
         btntext.value = "Done"
    }

}