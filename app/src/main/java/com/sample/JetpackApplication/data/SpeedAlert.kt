package com.sample.JetpackApplication.data

data class SpeedAlert(
    val rentalId : String,
    val currentSpeed : Int,
    val maxSpeed : Int,
    val timeStamp : Long
)