package com.example.eskill

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class metode_pembayaran : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.metode_pembayaran)

        val btnBack = findViewById<Button>(R.id.btnBack)
        btnBack.setOnClickListener {
            finish()
        }

        val btnDaftarSekarang = findViewById<Button>(R.id.btnDaftarSekarang)
        btnDaftarSekarang.setOnClickListener {
            val intent = Intent(this, pembayaran_berhasil::class.java)
            startActivity(intent)
        }
    }
}