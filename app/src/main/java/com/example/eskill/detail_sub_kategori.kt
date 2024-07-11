package com.example.eskill

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class detail_sub_kategori : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_sub_kategori)

        val btnBack = findViewById<Button>(R.id.buttonBack)
        btnBack.setOnClickListener {
            finish()
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

        val buttonLihatDetail = findViewById<Button>(R.id.buttonLihatDetail)
        buttonLihatDetail.setOnClickListener {
            val intent = Intent(this, detail_kelas_pelatihan_sebelum_bayar::class.java)
            startActivity(intent)
        }
    }
}