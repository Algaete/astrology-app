package com.algaete.horoscapp.data

import android.util.Log
import com.algaete.horoscapp.data.network.HoroscopeApiService
import com.algaete.horoscapp.data.network.response.PredictionResponse
import com.algaete.horoscapp.domain.Repository
import com.algaete.horoscapp.domain.model.PredictionModel
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiService: HoroscopeApiService):Repository {
    override suspend fun getPrediction(sign: String):PredictionModel? {
        runCatching { apiService.getHoroscope(sign) }
            .onSuccess { return it.toDomain() }
            .onFailure { Log.i("Algaete","Ha ocurrido un error ${it.message}") }
        return null
    }
}