package com.bitebliss.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
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
    }
}