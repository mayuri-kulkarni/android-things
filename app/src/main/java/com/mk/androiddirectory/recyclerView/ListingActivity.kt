
package com.mk.androiddirectory.recyclerView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mk.androiddirectory.databinding.ActivityListingBinding
import com.mk.androiddirectory.databinding.ActivityMotionLayoutBinding
import com.mk.androiddirectory.databinding.ActivitySwipeToOptionsListBinding
import com.mk.androiddirectory.recyclerView.SwipeAdapter

class ListingActivity : AppCompatActivity() {

    lateinit var binding: ActivityListingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding.recyclerView) {
            layoutManager = LinearLayoutManager(this@ListingActivity)
            adapter = RecyclerViewAdapterWithViewBinding(listOf("MSHBDJHCJH","SDHJGbjjbvjhdfbhvbd fhbvhbhbfvfdjjdjj      jjajjaja j38838hhfhhfhfhfddddddddhfhfhfhhfhfhFVGHHX","ADGSFDGVGHCV"))
            addItemDecoration(DividerItemDecoration(this@ListingActivity , (layoutManager as LinearLayoutManager).orientation))
        }
    }
}