package com.bitebliss.activities

import android.content.Intent
import android.os.Bundle
import android.text.InputType
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.bitebliss.databinding.ActivitySinginBinding

class SinginActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySinginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySinginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.alreadyAccount.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }

        hidePassWord()
    }

    //function to hide or show password
    private fun hidePassWord(){
        var inputType = 0

        binding.eyeShow.setOnClickListener {
            inputType = binding.etPassword.inputType
            binding.etPassword.inputType = InputType.TYPE_CLASS_TEXT
            binding.eyeShow.visibility = View.INVISIBLE
            binding.eyeHide.visibility = View.VISIBLE
        }

        binding.eyeHide.setOnClickListener {
            binding.etPassword.inputType = inputType
            binding.eyeShow.visibility = View.VISIBLE
            binding.eyeHide.visibility = View.INVISIBLE
        }

    }
}