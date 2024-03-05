package com.bitebliss.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bitebliss.databinding.PopularFoodRcRowBinding

class PopularAdapter (private val items:List<String>,private val image:List<Int>, private val price: List<String>) : RecyclerView.Adapter<PopularAdapter.PopularViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularViewHolder {
        return PopularViewHolder(PopularFoodRcRowBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: PopularViewHolder, position: Int) {
        val item = items[position]
        val images = image[position]
        val price = price[position]
        holder.bind(item,price,images)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class PopularViewHolder(private val binding: PopularFoodRcRowBinding) : RecyclerView.ViewHolder(binding.root) {

        private val imageView = binding.foodIv
        fun bind(item: String, price: String, images: Int) {
            binding.tvFoodName.text = item
            binding.tvPrice.text = price
            imageView.setImageResource(images)

        }

    }
}