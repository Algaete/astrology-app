package com.algaete.horoscapp.data.providers

import com.algaete.horoscapp.domain.model.HoroscopeInfo
import com.algaete.horoscapp.domain.model.HoroscopeInfo.Aquarius
import com.algaete.horoscapp.domain.model.HoroscopeInfo.Aries
import com.algaete.horoscapp.domain.model.HoroscopeInfo.Cancer
import com.algaete.horoscapp.domain.model.HoroscopeInfo.Capricorn
import com.algaete.horoscapp.domain.model.HoroscopeInfo.Gemini
import com.algaete.horoscapp.domain.model.HoroscopeInfo.Leo
import com.algaete.horoscapp.domain.model.HoroscopeInfo.Libra
import com.algaete.horoscapp.domain.model.HoroscopeInfo.Pisces
import com.algaete.horoscapp.domain.model.HoroscopeInfo.Sagittarius
import com.algaete.horoscapp.domain.model.HoroscopeInfo.Scorpio
import com.algaete.horoscapp.domain.model.HoroscopeInfo.Virgo
import javax.inject.Inject

class HoroscopeProvider @Inject constructor() {
    fun getHoroscopes():List<HoroscopeInfo>{
        return listOf(
            Aries,
            Gemini,
            Cancer,
            Leo,
            Virgo,
            Libra,
            Scorpio,
            Sagittarius,
            Capricorn,
            Aquarius,
            Pisces
        )
    }
}