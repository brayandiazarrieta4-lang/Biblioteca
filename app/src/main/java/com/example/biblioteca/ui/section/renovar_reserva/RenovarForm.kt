package com.example.biblioteca.ui.section.renovar_reserva

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.biblioteca.ui.theme.LibraryGreen

@Composable
fun RenovarForm(
    fechaReserva: String,
    onRenovate: (String) -> Unit
) {
    var nuevaFecha by remember { mutableStateOf("25/08/2026") }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        OutlinedTextField(
            value = fechaReserva,
            onValueChange = {},
            label = { Text("Reserva Actual") },
            modifier = Modifier.fillMaxWidth(),
            readOnly = true,
            leadingIcon = { Icon(Icons.Default.DateRange, contentDescription = null) }
        )
        
        Spacer(modifier = Modifier.height(16.dp))
        
        OutlinedTextField(
            value = nuevaFecha,
            onValueChange = { nuevaFecha = it },
            label = { Text("Nueva Fecha") },
            modifier = Modifier.fillMaxWidth(),
            leadingIcon = { Icon(Icons.Default.DateRange, contentDescription = null) }
        )
        
        Spacer(modifier = Modifier.height(24.dp))
        
        Button(
            onClick = { onRenovate(nuevaFecha) },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(containerColor = LibraryGreen)
        ) {
            Text("Confirmar Renovación")
        }
    }
}
