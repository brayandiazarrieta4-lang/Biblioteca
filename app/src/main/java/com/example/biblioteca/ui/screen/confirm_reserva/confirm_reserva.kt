package com.example.biblioteca.ui.screen.confirm_reserva

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.biblioteca.model.sampleBooks
import com.example.biblioteca.ui.theme.BibliotecaTheme
import com.example.biblioteca.ui.section.confirm_reserva.BtnInicio
import com.example.biblioteca.ui.section.confirm_reserva.ConfirmDetalles
import com.example.biblioteca.ui.section.confirm_reserva.ConfirmHeader

@Composable
fun ConfirmReservaScreen(bookId: String, onNavigateToInicio: () -> Unit) {
    val book = sampleBooks.find { it.id == bookId }
    
    Scaffold { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ) {
            ConfirmHeader()
            book?.let {
                ConfirmDetalles(book = it)
            }
            Spacer(modifier = Modifier.weight(1f))
            BtnInicio(onClick = onNavigateToInicio)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ConfirmReservaScreenPreview() {
    BibliotecaTheme {
        ConfirmReservaScreen(bookId = "1", onNavigateToInicio = {})
    }
}
