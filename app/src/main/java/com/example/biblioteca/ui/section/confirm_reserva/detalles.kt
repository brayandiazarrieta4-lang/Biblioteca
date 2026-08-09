package com.example.biblioteca.ui.section.confirm_reserva

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.biblioteca.model.Book
import com.example.biblioteca.ui.components.all.DetailRow

@Composable
fun ConfirmDetalles(book: Book) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f))
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = "Detalles de la Reserva",
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier.padding(bottom = 8.dp)
            )
            DetailRow(label = "Libro", value = book.nombre)
            DetailRow(label = "Autor", value = book.autor)
            DetailRow(label = "Código de Reserva", value = "LIB-${book.id}X99")
        }
    }
}
