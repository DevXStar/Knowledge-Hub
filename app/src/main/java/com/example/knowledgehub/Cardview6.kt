package com.example.knowledgehub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Cardview6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cardview6)

        val one = findViewById<Button>(R.id.btn7)
        one.setOnClickListener {
            intent = Intent(applicationContext, Webview6::class.java)
            startActivity(intent)
        }
    }
}