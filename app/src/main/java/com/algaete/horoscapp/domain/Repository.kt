package com.algaete.horoscapp.domain

import com.algaete.horoscapp.data.network.response.PredictionResponse
import com.algaete.horoscapp.domain.model.PredictionModel

interface Repository {
    suspend fun getPrediction(sign:String): PredictionModel?
}