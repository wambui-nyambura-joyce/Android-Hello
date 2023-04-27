package com.example.memesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Fourthmeme : AppCompatActivity() {
    lateinit var btnNextttt: Button
    lateinit var btnPreviousss: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourthmeme)
        btnNextttt = findViewById(R.id.btnNextttt)
        btnPreviousss = findViewById(R.id.btnPreviousss)
        btnNextttt.setOnClickListener {
            val intent = Intent(this,Fifthmeme::class.java)
            startActivity(intent)
        }
        btnPreviousss.setOnClickListener {
            val intent = Intent(this,Thirdmeme::class.java)
            startActivity(intent)
        }
    }
}


