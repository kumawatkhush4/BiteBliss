package com.bitebliss.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bitebliss.databinding.CartItemsRcViewRowBinding

class CartListAdapter (private val cartItems:MutableList<String>, private val cartItemPrice:MutableList<String>, private val cartImage:MutableList<Int>): RecyclerView.Adapter<CartListAdapter.CartViewHolder>() {

    private val itemQuantities =IntArray(cartItems.size){1}
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder {
        val binding = CartItemsRcViewRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return CartViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CartViewHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int = cartItems.size

   inner class CartViewHolder(private val binding: CartItemsRcViewRowBinding): RecyclerView.ViewHolder(binding.root) {

       private val imageView = binding.foodIv
        fun bind(position: Int) {
            binding.apply {
                val quantities = itemQuantities[position]

                tvFoodName.text = cartItems[position]
                tvPrice.text = cartItemPrice[position]
                imageView.setImageResource(cartImage[position])
                tvItemsCount.text = quantities.toString()
            }
        }

    }
}