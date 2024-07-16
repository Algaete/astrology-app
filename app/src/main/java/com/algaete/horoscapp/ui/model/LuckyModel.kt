package com.algaete.horoscapp.ui.model

import androidx.annotation.DrawableRes   //obligarnos a q el valor q entregamos sea una referencia a und drawable
import androidx.annotation.StringRes

data class LuckyModel(
    @DrawableRes val image:Int,
    @StringRes val text:Int
)