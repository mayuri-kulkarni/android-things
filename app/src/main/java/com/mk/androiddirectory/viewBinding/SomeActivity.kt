package com.mk.androiddirectory.viewBinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mk.androiddirectory.R
import com.mk.androiddirectory.databinding.ActivitySomeBinding

/*

add this to gradle file

buildFeatures {
    viewBinding = true

usage
1. Activity
2. fragment
3. recyclerview
4. custom dialogs


}*/

class SomeActivity : AppCompatActivity() {

    lateinit var binding : ActivitySomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySomeBinding.inflate(layoutInflater)

        setContentView(binding?.root) // this will actually layout the views


        binding.root
    }
}
