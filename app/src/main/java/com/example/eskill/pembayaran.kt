package com.example.eskill

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class pembayaran : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pembayaran)

        val btnDaftarSekarang = findViewById<Button>(R.id.btnDaftarSekarang)
        btnDaftarSekarang.setOnClickListener {
            val intent = Intent(this, metode_pembayaran::class.java)
            startActivity(intent)
        }

        val btnBack = findViewById<Button>(R.id.btnBack)
        btnBack.setOnClickListener {
            finish()
        }
    }
}