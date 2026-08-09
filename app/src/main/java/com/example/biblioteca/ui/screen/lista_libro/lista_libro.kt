package com.example.biblioteca.ui.screen.lista_libro

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.biblioteca.model.sampleBooks
import com.example.biblioteca.ui.theme.BibliotecaTheme
import com.example.biblioteca.ui.section.lista_libro.ListaHeader
import com.example.biblioteca.ui.section.lista_libro.ListaLibrosContent

@Composable
fun ListaLibroScreen(onBack: () -> Unit, onNavigateToDetalle: (String) -> Unit) {
    Scaffold(
        topBar = { ListaHeader(onBack = onBack) }
    ) { padding ->
        Box(modifier = Modifier.padding(padding)) {
            ListaLibrosContent(
                books = sampleBooks,
                onBookClick = onNavigateToDetalle
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ListaLibroScreenPreview() {
    BibliotecaTheme {
        ListaLibroScreen(onBack = {}, onNavigateToDetalle = {})
    }
}
