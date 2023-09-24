package com.example.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.ItemBinding


class MyAdapter(val items: MutableList<MyItem>): RecyclerView.Adapter<MyAdapter.Holder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false )
        return Holder(binding)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.icon.setImageResource(items[position].Icon)
        holder.name.text = items[position].Name
        holder.age.text = items[position].Age
    }
    inner class Holder(val binding: ItemBinding): RecyclerView.ViewHolder(binding.root){
        val icon = binding.iconImg
        val name = binding.NameTxt
        val age = binding.AgeTxt
    }


}

