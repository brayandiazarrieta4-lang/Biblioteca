package com.example.biblioteca.ui.section.detalle_reserva

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.biblioteca.ui.components.common.DetailRow
import com.example.biblioteca.ui.theme.LibraryOrange
import com.example.biblioteca.ui.theme.LightGray

@Composable
fun LibroInfo(
    nombreLibro: String,
    autor: String,
    fechaReserva: String,
    codigoReserva: String
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(12.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                DetailRow(label = "Libro", value = nombreLibro)
                DetailRow(label = "Autor", value = autor)
                DetailRow(label = "Fecha", value = fechaReserva)
                DetailRow(label = "Código", value = codigoReserva)
            }
        }
        
        Spacer(modifier = Modifier.height(16.dp))
        
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(LibraryOrange.copy(alpha = 0.1f), RoundedCornerShape(8.dp))
                .padding(12.dp)
        ) {
            Text(
                text = "Estos datos fueron enviados desde la pantalla anterior a través de argumentos de navegación.",
                fontSize = 12.sp,
                color = LibraryOrange
            )
        }
    }
}
