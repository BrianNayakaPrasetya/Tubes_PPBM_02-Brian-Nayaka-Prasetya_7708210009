package com.example.brian_nayaka

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class tikethotel : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tikethotel)

        val iklan1 = findViewById<ImageView>(R.id.iklan1)
        iklan1.setOnClickListener {
            val iklanhotel = Intent(this, TabLayoutActivity::class.java)
            startActivity(iklanhotel)
            finish()
        }
    }


}