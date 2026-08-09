package com.example.biblioteca.ui.section.detalle_libro

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.biblioteca.model.Book
import com.example.biblioteca.ui.components.all.DetailRow
import com.example.biblioteca.ui.theme.LibraryPurple

@Composable
fun LibroInfo(book: Book) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Text(
            text = book.nombre,
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.Bold,
            color = LibraryPurple
        )
        Spacer(modifier = Modifier.height(16.dp))
        DetailRow(label = "Autor", value = book.autor)
        DetailRow(label = "Categoría", value = book.categoria)
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Descripción",
            style = MaterialTheme.typography.labelMedium,
            color = MaterialTheme.colorScheme.secondary
        )
        Text(
            text = book.descripcion,
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(top = 4.dp)
        )
    }
}
