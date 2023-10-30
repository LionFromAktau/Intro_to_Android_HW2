package com.example.into_to_android_hw2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.into_to_android_hw2.databinding.ActivityMainBinding
import androidx.recyclerview.widget.LinearLayoutManager

class MainActivity : AppCompatActivity() {

    private lateinit var foodList: ArrayList<Food>
    private lateinit var foodAdapter: FoodAdapter
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        foodList = ArrayList()
        foodAdapter = FoodAdapter(foodList)
        foodListItems()
        binding.recyclerView.layoutManager =
            LinearLayoutManager(this) // Fix typo here
        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.adapter = foodAdapter
    }

    private fun foodListItems() {
        foodList.add(Food(R.drawable.pizza1, "Chicken Pizza"))
        foodList.add(Food(R.drawable.pizza1, "Beef Chicken"))
        foodList.add(Food(R.drawable.pizza1, "Normal Pizza"))
        foodList.add(Food(R.drawable.pizza1, "Sweet Chicken"))
    }
}
