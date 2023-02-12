package com.example.knowledgehub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Cardview5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cardview5)

        val one = findViewById<Button>(R.id.btn6)
        one.setOnClickListener {
            intent = Intent(applicationContext, Webview5::class.java)
            startActivity(intent)
        }
    }
}