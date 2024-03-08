package com.bitebliss.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavHostController
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import com.bitebliss.R
import com.bitebliss.databinding.ActivityLoginBinding
import com.bitebliss.databinding.ActivityMainBinding
import com.bitebliss.databinding.FragmentOrderPlacedBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class OrderPlacedFragment : BottomSheetDialogFragment() {


    private lateinit var binding : FragmentOrderPlacedBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOrderPlacedBinding.inflate(inflater,container,false)

        binding.goToHomeBtn.setOnClickListener {
            startActivity(Intent(requireContext(),HomeFragment::class.java))
        }

        return binding.root
    }

    companion object {

    }
}