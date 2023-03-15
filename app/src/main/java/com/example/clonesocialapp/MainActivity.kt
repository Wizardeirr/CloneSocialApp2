package com.example.clonesocialapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.clonesocialapp.fragments.FavFragment
import com.example.clonesocialapp.home.HomeFragment
import com.example.clonesocialapp.fragments.ProfileFragment
import com.example.clonesocialapp.searchfragment.SearchFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    lateinit var bottomNav : BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        jumpFragment(SearchFragment())
        bottomNav=findViewById(R.id.bottom_navigation) as BottomNavigationView
        bottomNav.setOnItemSelectedListener {MenuItem->
            when(MenuItem.itemId){
                R.id.homePage ->{
                    jumpFragment(SearchFragment())
                    true
                }
                R.id.discoveryPage ->{
                    jumpFragment(HomeFragment())
                    true
                }
                R.id.favsPage ->{
                    jumpFragment(FavFragment())
                    true
                }
                R.id.profilePage ->{
                    jumpFragment(ProfileFragment())
                    true
                }

                else -> {false}
            }

        }
    }
    private fun jumpFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.bottom_nav_container,fragment)
        transaction.commit()
    }
}