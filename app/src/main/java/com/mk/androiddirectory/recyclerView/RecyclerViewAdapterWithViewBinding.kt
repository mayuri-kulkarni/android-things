package com.mk.androiddirectory.recyclerView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mk.androiddirectory.R
import com.mk.androiddirectory.databinding.ItemViewRecyclerviewBinding


/*
usage

val linearLayoutManager = LinearLayoutManager(this)
recyclerview.layoutManager = linearLayoutManager
recyclerview.adapter = RecyclerViewAdapterWithViewBinding( listOf("a","b"))

*/


class RecyclerViewAdapterWithViewBinding(var list: List<String>) :
    RecyclerView.Adapter<RecyclerViewAdapterWithViewBinding.MyViewHolder>() {

    inner class MyViewHolder(val binding: ItemViewRecyclerviewBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater
            .inflate(R.layout.item_view_recyclerview, parent, false)
        val binding = ItemViewRecyclerviewBinding.bind(view)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.textView.text = list[position]
    }

    override fun getItemCount(): Int {
        return list.size
    }
}


