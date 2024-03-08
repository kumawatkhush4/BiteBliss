package com.bitebliss.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bitebliss.databinding.RecentBuyItemListBinding

class RecentlyBuyAdapter(private val items:List<String>, private val image: ArrayList<Int>, private val price: List<String>): RecyclerView.Adapter<RecentlyBuyAdapter.RecentBuyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecentBuyViewHolder {
        return RecentBuyViewHolder( RecentBuyItemListBinding.inflate(LayoutInflater.from( parent.context ), parent, false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: RecentBuyViewHolder, position: Int) {
        val item = items[position]
        val images = image[position]
        val price = price[position]
        holder.bind(item,price,images)
    }
    inner class RecentBuyViewHolder(private val binding: RecentBuyItemListBinding) : RecyclerView.ViewHolder(binding.root) {
        private val imageView = binding.foodIv
        fun bind(item: String, price: String, images: Int) {
            binding.tvFoodName.text = item
            binding.tvPrice.text = price
            imageView.setImageResource(images)

        }
    }

}