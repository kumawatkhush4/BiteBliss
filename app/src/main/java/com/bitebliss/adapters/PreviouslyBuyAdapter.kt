package com.bitebliss.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bitebliss.databinding.PreviouslyBuyItemListBinding
import com.bitebliss.databinding.RecentBuyItemListBinding

class PreviouslyBuyAdapter(private val items:List<String>, private val image: ArrayList<Int>, private val price: List<String>): RecyclerView.Adapter<PreviouslyBuyAdapter.PreviouslyMyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PreviouslyMyViewHolder {
        return PreviouslyMyViewHolder(
            PreviouslyBuyItemListBinding.inflate(
                LayoutInflater.from(
                    parent.context
                ), parent, false
            )
        )
    }


    override fun onBindViewHolder(holder: PreviouslyMyViewHolder, position: Int) {
        val item = items[position]
        val images = image[position]
        val price = price[position]
        holder.bind(item, price, images)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class PreviouslyMyViewHolder(private val binding: PreviouslyBuyItemListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        private val imageView = binding.foodIv
        fun bind(item: String, price: String, images: Int) {
            binding.tvFoodName.text = item
            binding.tvPrice.text = price
            imageView.setImageResource(images)
        }
    }
}