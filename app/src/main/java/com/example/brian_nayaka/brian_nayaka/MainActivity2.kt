package com.example.brian_nayaka

import android.annotation.SuppressLint
import android.content.Intent
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity2 : AppCompatActivity() {
    val language = arrayOf<String>("Nasi Goreng","Ramen","Fish N Chips")
    val description = arrayOf<String>(
        "8 Menit",
        "15 Menit",
        "25 Menit",)

    val imageId = arrayOf<Int>(
        R.drawable.nasigoreng,R.drawable.ramen,R.drawable.fishnchips
    )
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val listView = findViewById(R.id.listView2) as ListView
        val myListAdapter = MyListAdapter(this,language,description,imageId)
        listView.adapter = myListAdapter

        listView.setOnItemClickListener { _, _, position, _ ->
            // Ambil item yang diklik
            val selectedItem = imageId[position]

            val pindah = Intent(this@MainActivity2, DetailedActivity::class.java)
            pindah.putExtra("selectedItem", selectedItem)
            startActivity(pindah)
            finish();
        }

    }
}
