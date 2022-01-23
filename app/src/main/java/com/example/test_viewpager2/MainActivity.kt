package com.example.test_viewpager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test_viewpager2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        startFragment(intentsArgs())

    }

    private fun startFragment(arg:Boolean) {
        if(arg){
            supportFragmentManager.beginTransaction().add(R.id.mainContainer, AdminFragment()).commit()
        }else{
            supportFragmentManager.beginTransaction().add(R.id.mainContainer, TabFragment()).commit()
        }
    }

    private fun intentsArgs():Boolean{
        val bundle = intent.extras?: throw IllegalThreadStateException("info null Boolean")
        val arg = MainActivityArgs.fromBundle(bundle)
        return arg.arg
    }
}