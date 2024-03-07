package com.bitebliss.activities

import android.R
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.withStarted
import com.bitebliss.databinding.ActivityPlaceOrderBinding
import com.bitebliss.databinding.FragmentCartBinding
import com.bitebliss.fragments.CartFragment

class ActivityPlaceOrder : AppCompatActivity() {
    private lateinit var binding: ActivityPlaceOrderBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlaceOrderBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backBtn.setOnClickListener {
            startActivity(Intent(this, CartFragment::class.java))
        }
        val locationList: Array<String> = arrayOf("UPI","Paytm","PhonePe","Cash On Delivery")
        val adapter = ArrayAdapter(this, R.layout.simple_list_item_1,locationList)
        val autoCompleteTextView: AutoCompleteTextView = binding.listPaymentMethods
        autoCompleteTextView.setAdapter(adapter)
    }
}