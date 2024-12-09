package com.sample.JetpackApplication.domain

import com.google.firebase.database.FirebaseDatabase
import com.sample.JetpackApplication.data.CarRental
import com.sample.JetpackApplication.data.SpeedAlert

class CarRentalRepositoryImpl(private val firebaseDatabase: FirebaseDatabase) : CarRentalRepository{
    override fun getCarRental(rentalId: String): CarRental {
        return CarRental("rental234", "Cust456", "Ford134", 120 )
    }

    override fun sendSpeedAlert(alert: SpeedAlert) {
        firebaseDatabase.reference.child("alerts").push().setValue(alert)
    }

}