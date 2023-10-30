package com.example.into_to_android_hw2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.into_to_android_hw2.databinding.ActivityMainBinding

class FoodViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
{

    val foodImage : ImageView = itemView.findViewById(R.id.iv_pizza)
    val foodName : TextView = itemView.findViewById(R.id.tv_pizza_text)
}

class FoodAdapter(private val foodList: ArrayList<Food>):RecyclerView.Adapter<FoodViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val viewLayout = LayoutInflater.from(parent.context).inflate(
            R.layout.pizza_item,
            parent,false)
        return FoodViewHolder(viewLayout)
    }

    override fun getItemCount() = foodList.size

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        val currentFood = foodList[position]
        holder.foodImage.setImageResource(currentFood.foodImage)
        holder.foodName.text = currentFood.foodName
    }
}