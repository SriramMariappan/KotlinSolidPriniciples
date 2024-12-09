package com.sample.JetpackApplication.presentation

import com.google.firebase.database.FirebaseDatabase
import com.sample.JetpackApplication.domain.CarRentalRepository
import com.sample.JetpackApplication.domain.CarRentalRepositoryImpl
import com.sample.JetpackApplication.domain.CarUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideFirebaseDatabase() : FirebaseDatabase {
        return FirebaseDatabase.getInstance()
    }

    @Provides
    @Singleton
    fun provideCarRentalRepository(firebaseDatabase: FirebaseDatabase): CarRentalRepository {
        return CarRentalRepositoryImpl(firebaseDatabase)
    }

    @Provides
    @Singleton
    fun provideCheckSpeedUseCase(repository: CarRentalRepository): CarUseCase {
        return CarUseCase(repository)
    }

}