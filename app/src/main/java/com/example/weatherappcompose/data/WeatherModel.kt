package com.example.weatherappcompose.data

data class WeatherModel(
    val city: String,
    val time: String,
    val currentTemperature: String,
    val condition: String,
    val icon: String,
    val maxTemperature: String,
    val minTemperature: String,

    val maxWindSpeed: String,
    val windDirection: String,
    val sunriseTime: String,
    val sunsetTime: String,
    val moonRise: String,
    val moonSet: String,
    val hours: String
)
