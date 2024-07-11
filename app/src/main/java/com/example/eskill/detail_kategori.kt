package com.example.eskill

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.google.android.material.bottomnavigation.BottomNavigationView

class detail_kategori : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_kategori)

        val cardViewDetailKategori = findViewById<CardView>(R.id.cardViewNetworking)
        cardViewDetailKategori.setOnClickListener {
            val intent = Intent(this, detail_sub_kategori::class.java)
            startActivity(intent)
        }

        val lihatLainnya = findViewById<TextView>(R.id.tvLihatLainnya)
        lihatLainnya.setOnClickListener {
            val intent = Intent(this, detail_sub_kategori::class.java)
            startActivity(intent)
        }

        val btnLihatDetail = findViewById<Button>(R.id.btnLihatDetail)
        btnLihatDetail.setOnClickListener {
            val intent = Intent(this, detail_kelas_pelatihan_sebelum_bayar::class.java)
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

        val btnBack = findViewById<Button>(R.id.buttonBack)
        btnBack.setOnClickListener {
            finish()
        }
    }
}