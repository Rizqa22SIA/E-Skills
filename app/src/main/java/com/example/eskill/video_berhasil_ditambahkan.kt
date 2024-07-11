package com.example.eskill

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class video_berhasil_ditambahkan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.video_berhasil_ditambahkan)

        val tvLihat = findViewById<TextView>(R.id.tvLihat)
        tvLihat.setOnClickListener {
            val intent = Intent(this, kelas_saya::class.java)
            startActivity(intent)
        }
    }
}