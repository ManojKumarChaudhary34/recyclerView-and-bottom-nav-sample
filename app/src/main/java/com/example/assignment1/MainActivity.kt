package com.example.assignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()
        val bottomView= findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        replaceWithFragment(CategoryFragment())
        bottomView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.categories -> replaceWithFragment(CategoryFragment())
                R.id.cart -> replaceWithFragment(CartFragment())
                R.id.account -> replaceWithFragment(AccountFragment())
                else -> {

                }
            }
            true

        }
    }

    private fun replaceWithFragment(fragment: Fragment) {
        val fragmentManager= supportFragmentManager
        val fragmentTransaction= fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout, fragment)
        fragmentTransaction.commit()

    }
}