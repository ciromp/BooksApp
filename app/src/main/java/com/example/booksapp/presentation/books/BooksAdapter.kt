package com.example.booksapp.presentation.books

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.booksapp.R
import com.example.booksapp.data.model.Book
import kotlinx.android.synthetic.main.item_book.view.*

class BooksAdapter (val books: List<Book>) : RecyclerView.Adapter<BooksAdapter.BooksViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BooksViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_book, parent, false)
        return BooksViewHolder(view)
    }

    override fun onBindViewHolder(holder: BooksViewHolder, position: Int) {
            holder.bindView(books[position])
    }

    override fun getItemCount() = books.count()

    class BooksViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private val title = view.textTitle
        private val author = view.textAuthor

        fun bindView(book: Book) {
            title.text = book.title
            author.text = book.author

        }
    }
}