package com.example.knowledgehub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Cardview3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cardview3)

        val one = findViewById<Button>(R.id.btn4)
        one.setOnClickListener {
            intent = Intent(applicationContext, Webview3::class.java)
            startActivity(intent)
        }
    }
}