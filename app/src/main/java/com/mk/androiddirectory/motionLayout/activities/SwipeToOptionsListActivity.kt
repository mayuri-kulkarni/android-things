package com.mk.androiddirectory.motionLayout.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.mk.androiddirectory.databinding.ActivityMotionLayoutBinding
import com.mk.androiddirectory.databinding.ActivitySwipeToOptionsListBinding
import com.mk.androiddirectory.recyclerView.SwipeAdapter

class SwipeToOptionsListActivity : AppCompatActivity() {

    lateinit var binding: ActivitySwipeToOptionsListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySwipeToOptionsListBinding.inflate(layoutInflater)
        setContentView(binding.root)


        with(binding.recyclerView) {
            layoutManager = LinearLayoutManager(this@SwipeToOptionsListActivity)
            adapter = SwipeAdapter(listOf("MSHBDJHCJH","SDHJGbjjbvjhdfbhvbd fhbvhbhbfvfdjjdjj      jjajjaja j38838hhfhhfhfhfhfhfhfhhfhfhFVGHHX","ADGSFDGVGHCV"))
        }
    }
}