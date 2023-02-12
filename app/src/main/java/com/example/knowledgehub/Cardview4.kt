package com.example.knowledgehub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Cardview4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cardview4)

        val one = findViewById<Button>(R.id.btn5)
        one.setOnClickListener {
            intent = Intent(applicationContext, Webview4::class.java)
            startActivity(intent)
        }
    }
}