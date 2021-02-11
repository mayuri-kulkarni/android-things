package com.mk.androiddirectory.motionLayout.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mk.androiddirectory.databinding.ActivityMotionLayoutBinding
import com.mk.androiddirectory.databinding.ActivitySwipeToOptionsListBinding
import com.mk.androiddirectory.recyclerView.SwipeAdapter
import com.mk.androiddirectory.util.Log
import com.mk.androiddirectory.util.showToast

class SwipeToOptionsListActivity : AppCompatActivity() {

    lateinit var binding: ActivitySwipeToOptionsListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySwipeToOptionsListBinding.inflate(layoutInflater)
        setContentView(binding.root)


        with(binding.recyclerView) {
            layoutManager = LinearLayoutManager(this@SwipeToOptionsListActivity)
            var rvAdapter = SwipeAdapter(listOf("MSHBDJHCJH", "SDHJGbjjbvjhdfbhvbd fhbvhbhbfvfdjjdjj    jjajjaja j38838hhfhhfhfhfddddddddhfhfhfhhfhfhFVGHHX", "ADGSFDGVGHCV"))
            adapter = rvAdapter
            rvAdapter.setSwipeActionClickListener(object : SwipeAdapter.SwipeActionListener {
                override fun onSwipeStarted(position: Int) {
                    Log("onSwipeStarted : $position")
                }

                override fun onSwipeCompleted(position: Int) {
                    Log("onSwipeCompleted : $position")
                }

                override fun onSwipeActionClicked(position: Int) {
                    Log("onSwipeCompleted : $position")
                }
            })
            addItemDecoration(DividerItemDecoration(this@SwipeToOptionsListActivity, (layoutManager as LinearLayoutManager).orientation))
        }
    }
}