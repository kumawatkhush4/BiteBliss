package com.bitebliss.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import com.bitebliss.R
import com.bitebliss.databinding.ActivityChooseLocationBinding

class ChooseLocation : AppCompatActivity() {

    private lateinit var binding : ActivityChooseLocationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChooseLocationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val locationList: Array<String> = arrayOf("Jaipur","Odisha","Ajmer","Sikar")
        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,locationList)
        val autoCompleteTextView: AutoCompleteTextView = binding.listOfLocation
        autoCompleteTextView.setAdapter(adapter)
    }
}