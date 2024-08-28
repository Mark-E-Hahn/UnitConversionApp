package com.example.unitconversionapp

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etInputValue = findViewById<EditText>(R.id.et_input_value)
        val spConversionType = findViewById<Spinner>(R.id.sp_conversion_type)
        val btnConvert = findViewById<Button>(R.id.btn_convert)
        val tvResult = findViewById<TextView>(R.id.tv_result)

        btnConvert.setOnClickListener {
            val inputValue = etInputValue.text.toString().toDoubleOrNull()
            if (inputValue == null) {
                Toast.makeText(this, "Please enter a valid number", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val result = when (spConversionType.selectedItem.toString()) {
                "Celsius to Fahrenheit" -> ConversionUtils.celsiusToFahrenheit(inputValue)
                "Fahrenheit to Celsius" -> ConversionUtils.fahrenheitToCelsius(inputValue)
                "Meters to Feet" -> ConversionUtils.metersToFeet(inputValue)
                "Feet to Meters" -> ConversionUtils.feetToMeters(inputValue)
                "Kilograms to Pounds" -> ConversionUtils.kilogramsToPounds(inputValue)
                "Pounds to Kilograms" -> ConversionUtils.poundsToKilograms(inputValue)
                else -> 0.0
            }

            tvResult.text = "Result: $result"
        }
    }
}