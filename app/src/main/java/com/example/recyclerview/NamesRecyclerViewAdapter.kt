package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class NamesRecyclerViewAdapter (var names:List<String>)
    :RecyclerView.Adapter<NamesViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesViewHolder {
        val itemView=LayoutInflater.from(parent.context)
            .inflate(R.layout.name_list_item,parent,false)
        return NamesViewHolder((itemView))
    }

    override fun getItemCount(): Int {
        return names.size
    }

    override fun onBindViewHolder(holder: NamesViewHolder, position: Int) {
        holder.tvName.text=names[position]
    }
}

class NamesViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var tvName=itemView.findViewById<TextView>(R.id.tvName)
}
