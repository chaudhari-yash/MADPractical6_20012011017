package com.example.madpractical6_20012011017

import android.content.Intent
import android.os.Bundle
import android.webkit.WebSettings
import androidx.appcompat.app.AppCompatActivity
import com.example.madpractical6_20012011017.databinding.ActivityYoutubeBinding

class YoutubeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityYoutubeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = com.example.madpractical6_20012011017.databinding.ActivityYoutubeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initYoutubePlayer()

        binding.button.setOnClickListener{
            Intent(this, MainActivity::class.java).apply { startActivity(this) }
        }
    }

    private val youtubeid = "yYVAiCQfsno"
    private fun initYoutubePlayer(){
        val webSettings: WebSettings = binding.youtubeView.settings
        webSettings.javaScriptEnabled = true
        webSettings.loadWithOverviewMode = true
        webSettings.useWideViewPort = true
        binding.youtubeView.loadUrl("https://www.youtube.com/embed/$youtubeid")
    }
}