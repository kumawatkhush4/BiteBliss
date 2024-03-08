package com.bitebliss.activities

import android.R
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.appcompat.app.AppCompatActivity
import com.bitebliss.databinding.ActivityPlaceOrderBinding
import com.bitebliss.fragments.CartFragment
import com.bitebliss.fragments.OrderPlacedFragment

class ActivityPlaceOrder : AppCompatActivity() {
    private lateinit var binding: ActivityPlaceOrderBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlaceOrderBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.backBtn.setOnClickListener {
            startActivity(Intent(this, CartFragment::class.java))
        }
        binding.placeOrderBtn.setOnClickListener {
            val bottomSheetDialog = OrderPlacedFragment();
            bottomSheetDialog.show(supportFragmentManager, bottomSheetDialog.tag)

        }
        val locationList: Array<String> = arrayOf("UPI", "Paytm", "PhonePe", "Cash On Delivery")
        val adapter = ArrayAdapter(this, R.layout.simple_list_item_1, locationList)
        val autoCompleteTextView: AutoCompleteTextView = binding.listPaymentMethods
        autoCompleteTextView.setAdapter(adapter)
    }
}