package com.mk.androiddirectory.recyclerView

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mk.androiddirectory.R
import com.mk.androiddirectory.databinding.ItemViewSwipeActionBinding

class SwipeAdapter(var list: List<String>) :
        RecyclerView.Adapter<SwipeAdapter.MyViewHolder>() {


    inner class MyViewHolder(val binding: ItemViewSwipeActionBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater
            .inflate(R.layout.item_view_swipe_action, parent, false)
        val binding = ItemViewSwipeActionBinding.bind(view)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.textView.text = list[position]
    }

    override fun getItemCount(): Int {
        return list.size
    }
}


