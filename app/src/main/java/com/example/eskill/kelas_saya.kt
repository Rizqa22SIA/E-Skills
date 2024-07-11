package com.example.eskill

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class kelas_saya : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.statusBarColor = resources.getColor(R.color.blueMain)
        setContentView(R.layout.kelas_saya)

        val tvLihatVideo = findViewById<TextView>(R.id.tvLihatVideo)
        tvLihatVideo.setOnClickListener {
            val intent = Intent(this, video::class.java)
            startActivity(intent)
        }
    }
}