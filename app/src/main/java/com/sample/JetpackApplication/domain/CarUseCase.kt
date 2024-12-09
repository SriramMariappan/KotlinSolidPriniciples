package com.sample.JetpackApplication.domain

import com.sample.JetpackApplication.data.CarRental
import com.sample.JetpackApplication.data.SpeedAlert

class CarUseCase(private val repository: CarRentalRepository) {

    fun execute(rental : CarRental, currentSpeed : Int){
          if (currentSpeed > rental.maxSpeed) {
              val alert = SpeedAlert(
                  rentalId = rental.rentalId,
                  currentSpeed = currentSpeed,
                  maxSpeed = rental.maxSpeed,
                  timeStamp = System.currentTimeMillis()
              )
              repository.sendSpeedAlert(alert)
          }
    }
}