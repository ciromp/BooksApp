package com.example.booksapp.presentation.books

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.booksapp.data.APIService
import com.example.booksapp.data.model.Book
import com.example.booksapp.data.response.BookBodyResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class BooksViewModel : ViewModel() {

    val booksLiveData : MutableLiveData<List<Book>> = MutableLiveData()

    fun getBooks() {
        //booksLiveData.value = createFakeBooks()
        APIService.service.getBooks().enqueue(object: Callback<BookBodyResponse> {
            override fun onResponse(call: Call<BookBodyResponse>, response: Response<BookBodyResponse>) {

            }

            override fun onFailure(call: Call<BookBodyResponse>, t: Throwable) {

            }

        })
    }

    fun createFakeBooks() : List<Book> {
        return listOf<Book>(
                Book("Title 1", "Author 1"),
                Book("Title 2", "Author 2"),
                Book("Title 3", "Author 3"),
                Book("Title 4", "Author 4"),
                Book("Title 5", "Author 5")
        )
    }
}