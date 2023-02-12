package com.example.knowledgehub

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class Webview1 : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview1)

        val webviewvar = findViewById<WebView>(R.id.webview1)
        webViewSetUp(webviewvar)
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webViewSetUp(webview: WebView) {
        webview.webViewClient= WebViewClient()

        webview.apply {
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
            loadUrl("https://www.geeksforgeeks.org/introduction-to-android-development/")
        }
    }
}