package com.example.unitconversionapp

import org.junit.Assert.assertEquals
import org.junit.Test

class ConversionUtilsTest {

    @Test
    fun testCelsiusToFahrenheit() {
        val result = ConversionUtils.celsiusToFahrenheit(0.0)
        assertEquals(32.0, result, 0.001)
    }

    @Test
    fun testFahrenheitToCelsius() {
        val result = ConversionUtils.fahrenheitToCelsius(32.0)
        assertEquals(0.0, result, 0.001)
    }

    @Test
    fun testMetersToFeet() {
        val result = ConversionUtils.metersToFeet(1.0)
        assertEquals(3.28084, result, 0.001)
    }

    @Test
    fun testFeetToMeters() {
        val result = ConversionUtils.feetToMeters(3.28084)
        assertEquals(1.0, result, 0.001)
    }

    @Test
    fun testKilogramsToPounds() {
        val result = ConversionUtils.kilogramsToPounds(1.0)
        assertEquals(2.20462, result, 0.001)
    }

    @Test
    fun testPoundsToKilograms() {
        val result = ConversionUtils.poundsToKilograms(2.20462)
        assertEquals(1.0, result, 0.001)
    }
}