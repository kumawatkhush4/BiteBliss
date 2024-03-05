package com.bitebliss.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.bitebliss.R
import com.bitebliss.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var NavController : NavController = findNavController(R.id.fragmentContainerView4)
        var bottomNav = findViewById<BottomNavigationView>(R.id.bottom_nav_bar)
        bottomNav.setupWithNavController(NavController)


    }
}