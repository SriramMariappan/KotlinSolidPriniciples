package com.sample.JetpackApplication.presentation

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.sample.JetpackApplication.R
import com.sample.JetpackApplication.data.CarRental

class CarRentalActivity : AppCompatActivity() {
    private val viewModel:CarRentalViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val carRental = CarRental("rental234", "Cust456", "Ford134", 120 )
        viewModel.invokeUseCase(carRental, 140)
    }
}