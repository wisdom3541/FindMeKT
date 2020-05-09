package com.example.findme

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.fragments.*

class fragments : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragments)
        bottomNavigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        replaceFragment(home())
    }


    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener {item->
        when(item.itemId){
            R.id.home -> {
                println("fragments pressed")
               replaceFragment(home())
                return@OnNavigationItemSelectedListener true
            }
            R.id.friends -> {
                println("map pressed")
                replaceFragment(favourite())
                return@OnNavigationItemSelectedListener true
            }
            R.id.profile -> {
                println("cart pressed")
              replaceFragment(profile())
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }




    private fun replaceFragment(fragment: Fragment){
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frag_container, fragment)
        fragmentTransaction.commit()
    }
}



