package com.example.brian_nayaka

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.bottomsheet.BottomSheetDialog

class DetailedActivity : AppCompatActivity() {

    lateinit var btnShowBottomSheet: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed)

        val backbtn = findViewById<Button>(R.id.button)
        backbtn.setOnClickListener {
            val lgn = Intent(this@DetailedActivity, MainActivity2::class.java)
            startActivity(lgn)
            finish()

        }

        btnShowBottomSheet = findViewById(R.id.buttonpesen);

        btnShowBottomSheet.setOnClickListener{

            val dialog = BottomSheetDialog(this)
            val view = layoutInflater.inflate(R.layout.bottom_sheet, null)
            val btnClose = view.findViewById<Button>(R.id.idBtnDismiss)

            btnClose.setOnClickListener {
                dialog.dismiss()
            }

            dialog.setCancelable(false)
            dialog.setContentView(view)
            dialog.show()
        }


    }
}