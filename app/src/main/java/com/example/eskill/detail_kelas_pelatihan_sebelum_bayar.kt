package com.example.eskill

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class detail_kelas_pelatihan_sebelum_bayar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_kelas_pelatihan_sebelum_bayar)

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

        val buttonIkutiKelas = findViewById<Button>(R.id.buttonIkutiKelas)
        buttonIkutiKelas.setOnClickListener {
            val intent = Intent(this, pembayaran::class.java)
            startActivity(intent)
        }
    }
}