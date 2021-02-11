package com.mk.androiddirectory.util

import android.content.Context
import android.util.Log
import android.widget.Toast

fun Context.showToast(message :String){
    Toast.makeText(this, message,Toast.LENGTH_SHORT).show()
}

fun Log(message :String, tag:String=""){
    Log.d("",message)
}

class AppUtil {

}