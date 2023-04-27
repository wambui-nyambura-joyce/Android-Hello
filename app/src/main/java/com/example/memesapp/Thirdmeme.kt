package com.example.memesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Thirdmeme : AppCompatActivity() {
    lateinit var btnNexttt: Button
    lateinit var btnPreviouss: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thirdmeme)
        btnNexttt = findViewById(R.id.btnNexttt)
        btnPreviouss = findViewById(R.id.btnPreviouss)
        btnNexttt.setOnClickListener {
            val  intent = Intent(this,Fourthmeme::class.java)
            startActivity(intent)
        }
        btnPreviouss.setOnClickListener {
            val intent = Intent(this,Secondmeme::class.java)
            startActivity(intent)
        }
    }
}


