package com.example.knowledgehub

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Cardview2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cardview2)


        val one = findViewById<Button>(R.id.btn3)
        one.setOnClickListener {
            intent = Intent(applicationContext, Webview2::class.java)
            startActivity(intent)
        }
    }
}