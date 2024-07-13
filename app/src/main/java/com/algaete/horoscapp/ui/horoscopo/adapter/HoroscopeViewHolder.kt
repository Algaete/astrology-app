package com.algaete.horoscapp.ui.horoscopo.adapter

import android.view.View
import android.view.animation.LinearInterpolator
import androidx.recyclerview.widget.RecyclerView
import com.algaete.horoscapp.data.providers.HoroscopeProvider
import com.algaete.horoscapp.databinding.ItemHoroscopeBinding
import com.algaete.horoscapp.domain.model.HoroscopeInfo

class HoroscopeViewHolder(view: View):RecyclerView.ViewHolder(view) {

    private val binding = ItemHoroscopeBinding.bind(view)

    fun render(horoscopeInfo: HoroscopeInfo, onItemSelected: (HoroscopeInfo) -> Unit){
        val context = binding.tvTitle.context
        binding.ivHoroscope.setImageResource(horoscopeInfo.img)
        binding.tvTitle.text = context.getString(horoscopeInfo.name)

        binding.parent.setOnClickListener{
            startRotationAnimation(binding.ivHoroscope, newLambda = {onItemSelected(horoscopeInfo)})
          //  onItemSelected(horoscopeInfo)
        }
    }
}

private fun startRotationAnimation(view:View, newLambda:()->Unit){
    view.animate().apply {
        duration = 500 // medio segundo
        interpolator = LinearInterpolator()
        rotationBy(360f) // rotar sobre su punto
        withEndAction { newLambda() } // cuando termine animacion ejecuta la funcion lambda
        start()
    }
}