package com.example.st10459986

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Koolkid_sec_page : AppCompatActivity() {
    private val weathertemperature = IntArray(4)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_koolkid_sec_page)
        //
        val mondayInput = findViewById<EditText>(R.id.mondayInput)
        val tuesdayInput = findViewById<EditText>(R.id.tuesdayInput)
        val saturdayInput = findViewById<EditText>(R.id.saturdayInput)
        val sundayInput = findViewById<EditText>(R.id.sundayInput)
        val txtResult = findViewById<TextView>(R.id.txtResult)

        val weatherTemperature = intent.getIntArrayExtra("weatherTemperature") ?: intArrayOf()
        val categories = intent.getStringArrayExtra("categories") ?: arrayOf()

        val totalWeatherTemperature = weatherTemperature.sum()
        val averageWeatherTemperature = if (weatherTemperature.isNotEmpty()) totalWeatherTemperature / weatherTemperature.size else 0


        findViewById<Button>(R.id.btnSubmit).setOnClickListener {
            weathertemperature[0] = mondayInput.text.toString().toInt()
            weathertemperature[1] = tuesdayInput.text.toString().toInt()
            weathertemperature[2] = saturdayInput.text.toString().toInt()
            weathertemperature[3] = sundayInput.text.toString().toInt()
            Toast.makeText(this, "Data saved successfully", Toast.LENGTH_SHORT).show()

            txtResult.text = "Sunny day"
            txtResult.text = "Raining"

            findViewById<Button>(R.id.btnClear).setOnClickListener {
                mondayInput.text.clear()
                tuesdayInput.text.clear()
                saturdayInput.text.clear()
                sundayInput.text.clear()
                Toast.makeText(this, "Incorrect user input, Please re-enter the data that are need!", Toast.LENGTH_SHORT).show()

                findViewById<TextView>(R.id.totalWeatherTemperature).text = "Total daily weather tempertaer $totalWeatherTemperature week"
                findViewById<TextView>(R.id.averageWeatherTemperature).text = "Average daily weather temperature $averageWeatherTemperature week"

                findViewById<TextView>(R.id.txtResult).text.toString().toInt()


                findViewById<Button>(R.id.btnSubmit).setOnClickListener {
                    val intent = Intent(this, The_last_chapter::class.java).apply {
                        putExtra("weathertemperature", weathertemperature)
                        startActivity(intent)



                        finish()
                    }


                }

            }

        }

    }
}