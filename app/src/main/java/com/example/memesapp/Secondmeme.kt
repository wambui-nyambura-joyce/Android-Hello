package com.example.memesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Secondmeme : AppCompatActivity() {
    lateinit var btnNextt: Button
    lateinit var btnPrevious: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondmeme)
        btnNextt = findViewById(R.id.btnNextt)
        btnPrevious = findViewById(R.id.btnPrevious)
        btnNextt.setOnClickListener {
            val intent = Intent(this,Thirdmeme::class.java)
            startActivity(intent)
        }
        btnPrevious.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

    }
}


