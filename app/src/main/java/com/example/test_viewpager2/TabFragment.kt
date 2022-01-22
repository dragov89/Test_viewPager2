package com.example.test_viewpager2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.test_viewpager2.databinding.FragmentTabBinding
import com.google.android.material.tabs.TabLayoutMediator

class TabFragment: Fragment() {
    private lateinit var binding: FragmentTabBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTabBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()

    }

    private fun init() {
        binding.viewPagerTwo.adapter = AdabterPagerTwo(requireActivity())
        binding.tabLayout.tabIconTint = null
        TabLayoutMediator(binding.tabLayout, binding.viewPagerTwo){
            tab,pos ->
            when(pos){
                0-> tab.setText("Завдання")
                1-> tab.setText("Особа")
                2-> tab.setText("Повідомлення")
            }
        }.attach()
    }
}