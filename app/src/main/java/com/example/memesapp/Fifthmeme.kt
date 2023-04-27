package com.example.memesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Fifthmeme : AppCompatActivity() {
    lateinit var btnPrev: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifthmeme)
        btnPrev = findViewById(R.id.btnPrev)
        btnPrev.setOnClickListener {
            val intent = Intent(this,Fourthmeme::class.java)
            startActivity(intent)
        }
    }
}

