package com.bitebliss.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.bitebliss.R
import com.bitebliss.adapters.RecentlyBuyAdapter
import com.bitebliss.databinding.ActivityOrderHistoryBinding
import com.bitebliss.fragments.ProfileFragment

class OrderHistoryActivity : AppCompatActivity() {

    private lateinit var binding : ActivityOrderHistoryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOrderHistoryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backBtn.setOnClickListener {
                startActivity(Intent(this, ProfileFragment::class.java))
        }

        val cartFoodName = listOf("Burger")
        val cartItemPrice = listOf("$5")
        val cartFoodImages =
            listOf(R.drawable.menu1)

        val adapter = RecentlyBuyAdapter(ArrayList(cartFoodName),
            ArrayList(cartFoodImages),ArrayList(cartItemPrice)
        )
        binding.rcRecentBuy.layoutManager  = LinearLayoutManager(this)
        binding.rcRecentBuy.adapter = adapter


        val previousFoodName = listOf("Burger","Sandwich","Momo","Item")
        val previousItemPrice = listOf("$5", "$7", "$10", "$8")
        val previousFoodImages =
            listOf(R.drawable.menu1, R.drawable.menu2, R.drawable.menu3, R.drawable.menu4)

        val adapter2 = RecentlyBuyAdapter(ArrayList(previousFoodName),ArrayList(previousFoodImages),ArrayList(previousItemPrice))
        binding.rcPreviouslyBuy.layoutManager  = LinearLayoutManager(this)
        binding.rcPreviouslyBuy.adapter = adapter2
    }
}