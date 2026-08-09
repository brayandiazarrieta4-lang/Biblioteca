package com.example.biblioteca.ui.components.lista_libro

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Book
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.biblioteca.model.Book
import com.example.biblioteca.model.sampleBooks
import com.example.biblioteca.ui.theme.BibliotecaTheme
import com.example.biblioteca.ui.theme.LibraryPurple

@Composable
fun LibroCard(book: Book, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
            .clickable { onClick() },
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.Book,
                contentDescription = null,
                modifier = Modifier.size(48.dp),
                tint = LibraryPurple
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(
                    text = book.nombre,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = book.autor,
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
                Text(
                    text = book.categoria,
                    style = MaterialTheme.typography.labelSmall,
                    color = LibraryPurple
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LibroCardPreview() {
    BibliotecaTheme {
        LibroCard(book = sampleBooks[0], onClick = {})
    }
}
