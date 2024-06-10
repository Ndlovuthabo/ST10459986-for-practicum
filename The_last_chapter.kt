package com.example.st10459986

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class The_last_chapter : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_the_last_chapter)
        //
        val weatherTemperature = intent.getIntArrayExtra("weatherTemperature") ?: intArrayOf()
        val categories = intent.getStringArrayExtra("categories") ?: arrayOf()

        val totalWeatherTemperature = weatherTemperature.sum()
        val averageWeatherTemperature = if (weatherTemperature.isNotEmpty()) totalWeatherTemperature / weatherTemperature.size else 0

        findViewById<TextView>(R.id.totalWeatherTemperature).text = "Total daily weather tempertaer $totalWeatherTemperature week"
        findViewById<TextView>(R.id.averageWeatherTemperature).text = "Average daily weather temperature $averageWeatherTemperature week"

        findViewById<Button>(R.id.btnExit).setOnClickListener {
            finish()

        }



    }
}