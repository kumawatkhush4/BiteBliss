package com.bitebliss.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bitebliss.R
import com.bitebliss.activities.LoginActivity
import com.bitebliss.activities.OrderHistoryActivity
import com.bitebliss.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {

private lateinit var binding : FragmentProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentProfileBinding.inflate(inflater,container,false)

        binding.apply {
            logoutBtn.setOnClickListener{
                startActivity(Intent(requireContext(),LoginActivity::class.java))
                activity?.finish()
            }

            historyBtn.setOnClickListener {
                startActivity(Intent(requireContext(), OrderHistoryActivity::class.java))
            }
        }

        return binding.root
    }

    companion object {

    }
}