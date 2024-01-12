package com.example.brian_nayaka

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class tiketpesawat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tiketpesawat)

        val iklan1 = findViewById<ImageView>(R.id.iklan1)
        iklan1.setOnClickListener {
            val iklanpesawat = Intent(this, MainActivity::class.java)
            startActivity(iklanpesawat)
            finish()
        }
    }
}