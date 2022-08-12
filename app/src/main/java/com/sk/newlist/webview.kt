package com.sk.newlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sk.newlist.databinding.ActivityWebviewBinding

class webview : AppCompatActivity() {
    lateinit var Binding1:ActivityWebviewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Binding1=ActivityWebviewBinding.inflate(layoutInflater)
        setContentView(Binding1.root)
        Binding1.web1.loadUrl("https://google.com")
        Binding1.web1.settings.javaScriptEnabled=true
    }

    override fun onBackPressed() {
        if (Binding1.web1.canGoBack()) {
            Binding1.web1.goBack()}
        else{
            super.onBackPressed()
        }
    }
}