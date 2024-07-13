package com.algaete.horoscapp.ui.horoscopo

import androidx.lifecycle.ViewModel
import com.algaete.horoscapp.data.providers.HoroscopeProvider
import com.algaete.horoscapp.domain.model.HoroscopeInfo
import com.algaete.horoscapp.domain.model.HoroscopeInfo.*
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class HoroscopeViewModel @Inject constructor(val horoscopeProvider: HoroscopeProvider) : ViewModel() {

    private var _horoscope = MutableStateFlow<List<HoroscopeInfo>>(emptyList())
    val horoscope: StateFlow<List<HoroscopeInfo>> = _horoscope // stateflow es como un live un livedata pero en las nuevas versiones de android, recomendado por google

    init {
        _horoscope.value = horoscopeProvider.getHoroscopes()
    }
}