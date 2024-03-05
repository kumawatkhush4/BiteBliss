package com.bitebliss.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bitebliss.R
import com.bitebliss.databinding.ActivityChooseLocationBinding

class ChooseLocation : AppCompatActivity() {

    private lateinit var binding : ActivityChooseLocationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_location)
    }
}