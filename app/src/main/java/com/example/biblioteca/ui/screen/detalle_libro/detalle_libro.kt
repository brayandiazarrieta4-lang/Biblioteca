package com.example.biblioteca.ui.screen.detalle_libro

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.biblioteca.model.sampleBooks
import com.example.biblioteca.ui.theme.BibliotecaTheme
import com.example.biblioteca.ui.section.detalle_libro.BtnReservar
import com.example.biblioteca.ui.section.detalle_libro.DetalleHeader
import com.example.biblioteca.ui.section.detalle_libro.LibroInfo

@Composable
fun DetalleLibroScreen(bookId: String, onBack: () -> Unit, onNavigateToConfirm: (String) -> Unit) {
    val book = sampleBooks.find { it.id == bookId }
    
    Scaffold(
        topBar = { DetalleHeader(onBack = onBack) }
    ) { padding ->
        Column(modifier = Modifier.padding(padding)) {
            book?.let {
                LibroInfo(book = it)
                BtnReservar(onClick = { onNavigateToConfirm(it.id) })
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DetalleLibroScreenPreview() {
    BibliotecaTheme {
        DetalleLibroScreen(bookId = "1", onBack = {}, onNavigateToConfirm = {})
    }
}
