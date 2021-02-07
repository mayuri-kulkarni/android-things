package com.mk.androiddirectory.motionLayout.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mk.androiddirectory.databinding.ActivityMotionLayoutBinding


/*

MotionLayout is a subclass of ConstraintLayout

*/

class MotionLayoutActivity : AppCompatActivity() {
    lateinit var binding: ActivityMotionLayoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMotionLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.simpleMotionLayout.setOnClickListener {
            startActivity(Intent(this,SimpleMotionLayoutActivity::class.java))
        }
    }
}