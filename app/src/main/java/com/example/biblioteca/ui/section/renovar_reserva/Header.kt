package com.example.biblioteca.ui.section.renovar_reserva

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.biblioteca.ui.theme.LibraryPurple

@Composable
fun Header(nombreLibro: String) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(LibraryPurple)
            .padding(24.dp)
    ) {
        Text(
            text = "Renovar Reserva",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )
        Text(
            text = nombreLibro,
            fontSize = 16.sp,
            color = Color.White.copy(alpha = 0.9f)
        )
    }
}
