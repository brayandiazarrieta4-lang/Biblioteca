package com.example.biblioteca.ui.section.lista_libro

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.biblioteca.model.Book
import com.example.biblioteca.ui.components.lista_libro.LibroCard

@Composable
fun ListaLibrosContent(books: List<Book>, onBookClick: (String) -> Unit) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        contentPadding = PaddingValues(bottom = 16.dp)
    ) {
        items(books) { book ->
            LibroCard(book = book, onClick = { onBookClick(book.id) })
        }
    }
}
