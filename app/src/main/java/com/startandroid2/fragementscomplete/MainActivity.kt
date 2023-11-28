package com.startandroid2.fragementscomplete

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.startandroid2.fragementscomplete.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var fragmentManager: FragmentManager
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)


        setContentView(binding.root)

        binding.buttonFragment1.setOnClickListener{
            goToFragment(Fragment1())
        }
        binding.buttonFragment2.setOnClickListener{
            goToFragment(Fragment2())
        }
//        binding.buttonFragment3.setOnClickListener{
//            goToFragment(Fragment3())
//        }
    }
    private fun goToFragment(fragment: Fragment){
        fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().replace(R.id.fragmentContainer,fragment).commit()


    }
}