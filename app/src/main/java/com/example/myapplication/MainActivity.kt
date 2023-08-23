package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myapplication.ui.login.LoginFragment
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tabLayoutObject: TabLayout = findViewById(R.id.tabLayout)
        tabLayoutObject.addOnTabSelectedListener(
            object: OnTabSelectedListener{
                override fun onTabSelected(tab: Tab?) {
                    when (tab?.position){
                        0 -> supportFragmentManager
                            .beginTransaction()
                            .replace(R.id.fragmentContainerView, LoginFragment())
                            .commit()
                        1 -> supportFragmentManager
                            .beginTransaction()
                            .replace(R.id.fragmentContainerView, SettingsFragment())
                            .commit()
                        2 -> supportFragmentManager
                            .beginTransaction()
                            .replace(R.id.fragmentContainerView, BlankFragment())
                            .commit()
                    }
                }

                override fun onTabUnselected(tab: Tab?) {

                }

                override fun onTabReselected(tab: Tab?) {

                }
            }
        )
    }
}