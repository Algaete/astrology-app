package com.algaete.horoscapp.data.core.interceptors

import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

class AuthInterceptor @Inject constructor(): Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
            .newBuilder().header("Authorization", "fgdfd").build()
        return chain.proceed(request)
    }
}

/*class TokenManager @Inject constructor(){ // solo de ejemplo para mandar el token
    fun getToketn():String = "fdsfdsfds"
}*/