package com.example.florateka_diplom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)
        setTitle("Регистрация пользователя");
        val buttonId1: TextView = findViewById(R.id.buttonId1)
        val imgExample: ImageView = findViewById(R.id.imageView)
        imgExample.setImageResource(R.drawable.ic_launcher_foreground);
    }
}