package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class BookActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book)
        val recyclerView: RecyclerView = findViewById(R.id.booksList)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        val bookList = listOf(
            Item(nameBooks = "Harry Potter", imageResId = R.drawable.image),
            Item(nameBooks ="Lord of the Rings", imageResId = R.drawable.image),
            Item(nameBooks ="Lord of the Rings", imageResId = R.drawable.image),
            Item(nameBooks ="Lord of the Rings", imageResId = R.drawable.image),
            Item(nameBooks ="Lord of the Rings", imageResId = R.drawable.image),
            Item(nameBooks ="Lord of the Rings", imageResId = R.drawable.image),
            Item(nameBooks ="Lord of the Rings", imageResId = R.drawable.image),
        )
        val adapter = ItemsAdapter(bookList, this)
        recyclerView.adapter = adapter
    }
}