package com.example.knowledgehub

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class Cardview1 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cardview1)


        val one = findViewById<Button>(R.id.btn2)
        one.setOnClickListener {
            intent = Intent(applicationContext, Webview1::class.java)
            startActivity(intent)
        }
    }
}
