package com.example.eskill

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class pembayaran_berhasil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pembayaran_berhasil)

        val tvLihat = findViewById<TextView>(R.id.tvLihat)
        tvLihat.setOnClickListener {
            val intent = Intent(this, detail_kelas_pelatihan_sudah_bayar::class.java)
            startActivity(intent)
        }
    }
}