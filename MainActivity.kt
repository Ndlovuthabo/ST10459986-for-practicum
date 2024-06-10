package com.example.st10459986

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //declaring user details.
        val name = findViewById<TextView>(R.id.name)
        val studentNumber = findViewById<TextView>(R.id.studentNumber)
        val btnNext = findViewById<Button>(R.id.BtnNext)

        btnNext.setOnClickListener {
            val intent = Intent(this, Koolkid_sec_page::class.java)
            startActivity(intent)

            finish()


        }


    }
}