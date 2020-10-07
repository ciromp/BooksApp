package com.example.booksapp.data

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory


object APIService {
    private fun initRetrofit() : Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://api.nytimes.com/svc/books/v3/")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }

    val service = initRetrofit().create(NYServices::class.java)
}