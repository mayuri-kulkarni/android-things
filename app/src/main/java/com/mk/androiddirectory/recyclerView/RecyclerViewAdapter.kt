package com.mk.androiddirectory.recyclerView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mk.androiddirectory.R


/*
usage

val linearLayoutManager = LinearLayoutManager(this)
recyclerview.layoutManager = linearLayoutManager
recyclerview.adapter = RecyclerViewAdapterWithViewBinding( listOf("a","b"))

OR

        with(recyclerview) {
            layoutManager = LinearLayoutManager(this@ActivityName)
            adapter = Adapter(listOf("a","b"))
        }

*/


class RecyclerViewAdapter(var list: List<String>) :
        RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>() {

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.text_view)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater
                .inflate(R.layout.item_view_recyclerview, parent, false)

        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.textView.text = list[position]
    }

    override fun getItemCount(): Int {
        return list.size
    }
}


