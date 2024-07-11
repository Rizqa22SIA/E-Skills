package com.example.eskill

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.google.android.material.bottomnavigation.BottomNavigationView

class semua_kategori : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.semua_kategori)

        val cardView = findViewById<CardView>(R.id.cardViewTechnology)
        cardView.setOnClickListener {
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