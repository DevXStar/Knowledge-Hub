package com.example.knowledgehub

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        val cardview1 = findViewById<CardView>(R.id.Cardview1)
        val cardview2 = findViewById<CardView>(R.id.Cardview2)
        val cardview3 = findViewById<CardView>(R.id.Cardview3)
        val cardview4 = findViewById<CardView>(R.id.Cardview4)
        val cardview5 = findViewById<CardView>(R.id.Cardview5)
        val cardview6 = findViewById<CardView>(R.id.Cardview6)

        val btn= findViewById<Button>(R.id.btn)
        btn.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://t.me/INFINIXEL")
            startActivity(intent)
        }

        cardview1.setOnClickListener {
            intent = Intent(applicationContext, Cardview1::class.java)
            startActivity(intent)
        }

        cardview2.setOnClickListener {
            intent = Intent(applicationContext, Cardview2::class.java)
            startActivity(intent)
        }
        cardview3.setOnClickListener {
            intent = Intent(applicationContext, Cardview3::class.java)
            startActivity(intent)
        }

        cardview4.setOnClickListener {
            intent = Intent(applicationContext, Cardview4::class.java)
            startActivity(intent)
        }

        cardview5.setOnClickListener {
            intent = Intent(applicationContext, Cardview5::class.java)
            startActivity(intent)
        }

        cardview6.setOnClickListener {
            intent = Intent(applicationContext, Cardview6::class.java)
            startActivity(intent)
        }

    }
}