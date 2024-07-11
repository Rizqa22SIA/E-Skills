package com.example.eskill

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class detail_kelas_pelatihan_sudah_bayar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_kelas_pelatihan_sudah_dibayar)

        val ivTambahVideo = findViewById<ImageView>(R.id.ivTambahVideo)
        ivTambahVideo.setOnClickListener {
            val intent = Intent(this, video_berhasil_ditambahkan::class.java)
            startActivity(intent)
        }

        val btnBack = findViewById<Button>(R.id.btnBack)
        btnBack.setOnClickListener {
            val intent = Intent(this, detail_kategori::class.java)
            startActivity(intent)
        }

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_kelas_saya -> {
                    val intent = Intent(this, kelas_saya::class.java)
                    startActivity(intent)
                    true
                }
                else -> false
            }
        }
    }
}