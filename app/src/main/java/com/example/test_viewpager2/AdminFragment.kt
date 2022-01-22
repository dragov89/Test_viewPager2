package com.example.test_viewpager2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.test_viewpager2.databinding.FragmentAdminBinding

class AdminFragment : Fragment() {
    private lateinit var binding: FragmentAdminBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAdminBinding.inflate(inflater)
    return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.next.setOnClickListener {
            parentFragmentManager.beginTransaction().replace(R.id.mainContainer, ThreeFragmentNext()).addToBackStack(null).commit()
        }
        binding.tab.setOnClickListener {
           parentFragmentManager.beginTransaction().replace(R.id.mainContainer, TabFragment()).commit()
        }
    }
    }