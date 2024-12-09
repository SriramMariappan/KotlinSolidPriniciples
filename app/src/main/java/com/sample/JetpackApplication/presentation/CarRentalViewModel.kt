package com.sample.JetpackApplication.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sample.JetpackApplication.data.CarRental
import com.sample.JetpackApplication.domain.CarUseCase
import kotlinx.coroutines.launch

class CarRentalViewModel(private val checkSpeedUseCase: CarUseCase) : ViewModel() {

    fun invokeUseCase(carRental: CarRental, currentSpeed : Int){
        viewModelScope.launch {
            checkSpeedUseCase.execute(carRental, currentSpeed)
        }
    }
}