package com.example.booksapp.data

import com.example.booksapp.data.response.BookBodyResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NYServices {
    @GET("Lists.json")
    fun getBooks(
        @Query("list") list : String = "hardcover-fiction",
        @Query("api-key") apiKey : String = "o792aWUpPILpJomzg5I4lYGRsp9Aip5j"
    ): Call<BookBodyResponse>
}