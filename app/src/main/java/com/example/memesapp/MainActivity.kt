package com.example.memesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var btnNext: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnNext = findViewById(R.id.btnNext)
        btnNext.setOnClickListener {
            val intent = Intent(this,Secondmeme::class.java)
            startActivity(intent)
        }
    }
}

