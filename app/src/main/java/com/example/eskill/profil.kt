package com.example.eskill

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profil)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_kelas_saya -> {
                    // Handle navigation to "Kelas Saya" screen
                    val intent = Intent(this, kelas_saya::class.java)
                    startActivity(intent)
                    true
                }
                R.id.navigation_profile -> {
                    // Handle navigation to "Profile" screen
                    true
                }
                else -> false
            }
        }
    }
}
