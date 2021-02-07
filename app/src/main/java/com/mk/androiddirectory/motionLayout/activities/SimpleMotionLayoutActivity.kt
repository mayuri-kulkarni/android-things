package com.mk.androiddirectory.motionLayout.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mk.androiddirectory.databinding.ActivityMotionLayoutBinding
import com.mk.androiddirectory.databinding.ActivitySimpleMotionlayoutBinding

class SimpleMotionLayoutActivity : AppCompatActivity() {

    lateinit var binding: ActivitySimpleMotionlayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySimpleMotionlayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}