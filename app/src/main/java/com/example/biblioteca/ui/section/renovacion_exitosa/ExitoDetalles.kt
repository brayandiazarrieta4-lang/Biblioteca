package com.example.biblioteca.ui.section.renovacion_exitosa

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.biblioteca.ui.components.common.DetailRow

@Composable
fun ExitoDetalles(
    nombreLibro: String,
    fechaNueva: String,
    onBackToReservas: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        DetailRow(label = "Libro", value = nombreLibro)
        DetailRow(label = "Nueva Fecha", value = fechaNueva)
        
        Spacer(modifier = Modifier.height(32.dp))
        
        Button(
            onClick = onBackToReservas,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Volver a mis reservas")
        }
    }
}
