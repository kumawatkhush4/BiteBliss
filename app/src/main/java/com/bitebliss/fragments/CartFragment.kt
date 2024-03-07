package com.bitebliss.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.bitebliss.R
import com.bitebliss.activities.ActivityPlaceOrder
import com.bitebliss.adapters.CartListAdapter
import com.bitebliss.databinding.FragmentCartBinding
import com.bitebliss.databinding.FragmentHomeBinding


class CartFragment : Fragment() {

    private lateinit var binding: FragmentCartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = FragmentCartBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCartBinding.inflate(inflater, container, false)

        binding.proceedBtn.setOnClickListener {
            startActivity(Intent(requireContext(),ActivityPlaceOrder::class.java))
        }

        val cartFoodName = listOf("Burger","Sandwich","Momo","Item")
        val cartItemPrice = listOf("$5", "$7", "$10", "$8")
        val cartFoodImages =
            listOf(R.drawable.menu1, R.drawable.menu2, R.drawable.menu3, R.drawable.menu4)

        val adapter = CartListAdapter(ArrayList(cartFoodName),ArrayList(cartItemPrice),ArrayList(cartFoodImages))
        binding.rcCartView.layoutManager  = LinearLayoutManager(requireContext())
        binding.rcCartView.adapter = adapter

        return binding.root
    }

    companion object {

    }
}