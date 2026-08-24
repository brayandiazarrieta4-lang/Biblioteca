package com.example.biblioteca.ui.section.mis_reservas

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
fun Header() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(LibraryPurple)
            .padding(24.dp)
    ) {
        Text(
            text = "Mis Reservas",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )
        Text(
            text = "Lista de reservas activas",
            fontSize = 14.sp,
            color = Color.White.copy(alpha = 0.8f)
        )
    }
}
