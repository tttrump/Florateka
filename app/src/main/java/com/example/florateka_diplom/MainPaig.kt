package com.example.florateka_diplom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationView

@Suppress("DEPRECATION")
class MainPaig : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_paig)

        val bottomNavigation: BottomNavigationView = findViewById(R.id.bottom_navigation1)

        bottomNavigation.setOnItemSelectedListener{ item ->
            when(item.itemId) {
                R.id.home -> {
                    val intent = Intent(this, Activity_home::class.java)
                    startActivity(intent)
                    true
                }
                R.id.favorite -> {
                    val intent = Intent(this, Activity_favorite::class.java)
                    startActivity(intent)
                    true
                }
                R.id.message -> {
                    val intent = Intent(this, Activity_message::class.java)
                    startActivity(intent)
                    true
                }
                R.id.person -> {
                    val intent = Intent(this, Activity_profile::class.java)
                    startActivity(intent)
                    true
                }
                else -> false
            }
        }

    }
}