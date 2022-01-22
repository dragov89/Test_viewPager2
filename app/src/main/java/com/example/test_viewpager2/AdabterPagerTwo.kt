package com.example.test_viewpager2

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class AdabterPagerTwo(fragment: FragmentActivity): FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {
     return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0->MainFragment()
            1->TwoFragment()
            else ->ThreeFragment()
        }
    }
}