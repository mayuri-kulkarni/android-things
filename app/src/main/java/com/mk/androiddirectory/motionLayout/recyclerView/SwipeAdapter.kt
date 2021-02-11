package com.mk.androiddirectory.recyclerView

import android.transition.TransitionListenerAdapter
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.recyclerview.widget.RecyclerView
import com.mk.androiddirectory.R
import com.mk.androiddirectory.databinding.ItemViewSwipeActionBinding
import com.mk.androiddirectory.util.Log

class SwipeAdapter(var list: List<String>) : RecyclerView.Adapter<SwipeAdapter.MyViewHolder>() {
    inner class MyViewHolder(val binding: ItemViewSwipeActionBinding) :
            RecyclerView.ViewHolder(binding.root) {
    }
    var swipeActionListener: SwipeActionListener? = null



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater
                .inflate(R.layout.item_view_swipe_action, parent, false)
        val binding = ItemViewSwipeActionBinding.bind(view)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.textView.text = list[position]
        holder.binding.ivDelete.setOnClickListener {
            swipeActionListener?.onSwipeActionClicked(position)
        }

        holder.binding.rvItemMotionLayout.setTransitionListener(object : MotionLayout.TransitionListener {
            override fun onTransitionStarted(p0: MotionLayout?, p1: Int, p2: Int) {
                swipeActionListener?.onSwipeStarted(position)
            }

            override fun onTransitionCompleted(p0: MotionLayout?, p1: Int) {
                swipeActionListener?.onSwipeCompleted(position)
            }

            override fun onTransitionTrigger(p0: MotionLayout?, p1: Int, p2: Boolean, p3: Float) {
            }

            override fun onTransitionChange(p0: MotionLayout?, p1: Int, p2: Int, p3: Float) {
            }
        })

        holder.binding.rvItemMotionLayout.setOnDragListener { v, event ->
            Log(event.localState.toString())
            true
        }


    }

    override fun getItemCount(): Int {
        return list.size
    }

    fun setSwipeActionClickListener(swipeActionListener: SwipeActionListener) {
        this.swipeActionListener = swipeActionListener
    }

    interface SwipeActionListener {
        fun onSwipeStarted(position: Int)
        fun onSwipeCompleted(position: Int)
        fun onSwipeActionClicked(position: Int)

    }
}


