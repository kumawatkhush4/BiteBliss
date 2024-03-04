package com.bitebliss.activities

import android.content.Intent
import android.os.Bundle
import android.text.InputType
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bitebliss.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityLoginBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.doNotHaveAccount.setOnClickListener {
            startActivity(Intent(this, SinginActivity::class.java))
        }//khush

        hidePassword()

    }

    //function to hide or show password
    private fun hidePassword(){
        var inputType = 0

        binding.eyeShow.setOnClickListener {
            Toast.makeText(this, "Show Password", Toast.LENGTH_SHORT).show()
            inputType = binding.etPassword.inputType
            binding.etPassword.inputType = InputType.TYPE_CLASS_TEXT
            binding.eyeShow.visibility = View.INVISIBLE
            binding.eyeHide.visibility = View.VISIBLE
        }

        binding.eyeHide.setOnClickListener {
            Toast.makeText(this, "Hide Password", Toast.LENGTH_SHORT).show()
            binding.etPassword.inputType = inputType
            Log.d("Tag", "hide")
            binding.eyeShow.visibility = View.VISIBLE
            binding.eyeHide.visibility = View.INVISIBLE
        }

    }

}
