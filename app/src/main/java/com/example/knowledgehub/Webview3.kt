package com.example.knowledgehub

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class Webview3 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview3)

        val webviewvar = findViewById<WebView>(R.id.webview3)
        webViewSetUp(webviewvar)
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webViewSetUp(webview: WebView) {
        webview.webViewClient= WebViewClient()

        webview.apply {
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
            loadUrl("https://developer.apple.com/tutorials/app-dev-training")
        }
    }
}