package com.algaete.horoscapp.ui.horoscopo

import androidx.lifecycle.ViewModel
import com.algaete.horoscapp.domain.model.HoroscopeInfo.*
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HoroscopeViewModel @Inject constructor():ViewModel(){
    val caja:String = ""
    fun getHoroscopes(){
        listOf(
            Aries,Taurus,Gemini
        )
    }

}