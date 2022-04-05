package com.example.florateka_diplom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class EnterPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enter_page)
        setTitle("Вход в личный кабинет");
        val buttonId1: TextView = findViewById(R.id.buttonId1)

    }
}