package com.example.brian_nayaka

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.brian_nayaka.R
import com.ncorti.slidetoact.SlideToActView

class Slide_To_Act : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slide_to)


        val slidetoact = findViewById<SlideToActView>(R.id.example)
        slidetoact.onSlideCompleteListener = object : SlideToActView.OnSlideCompleteListener{
            override fun onSlideComplete(view: SlideToActView){
                exitApp()

            }
            private fun exitApp(){
                System.exit(0)
            }
        }
    }

}