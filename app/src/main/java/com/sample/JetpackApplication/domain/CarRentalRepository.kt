package com.sample.JetpackApplication.domain

import com.sample.JetpackApplication.data.CarRental
import com.sample.JetpackApplication.data.SpeedAlert

interface CarRentalRepository {
    fun getCarRental(rentalId : String) : CarRental
    fun sendSpeedAlert(alert : SpeedAlert)
}