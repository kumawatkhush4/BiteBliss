package com.bitebliss.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.bitebliss.R
import com.bitebliss.adapters.MenuAdapter
import com.bitebliss.databinding.FragmentMenuBottomSheetFragmentBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class MenuBottomSheetFragment : BottomSheetDialogFragment() {

    private lateinit var binding : FragmentMenuBottomSheetFragmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMenuBottomSheetFragmentBinding.inflate(inflater,container,false)

        val menuFoodName = listOf("Burger","Sandwich","Momo","Item")
        val menuItemPrice = listOf("$5", "$7", "$10", "$8")
        val menuFoodImages =
            listOf(R.drawable.menu1, R.drawable.menu2, R.drawable.menu3, R.drawable.menu4)

        val adapter = MenuAdapter(ArrayList(menuFoodName),ArrayList(menuItemPrice),ArrayList(menuFoodImages))
        binding.bottomMenuRecyclerView.layoutManager  = LinearLayoutManager(requireContext())
        binding.bottomMenuRecyclerView.adapter = adapter
        return binding.root
    }

    companion object {

    }
}