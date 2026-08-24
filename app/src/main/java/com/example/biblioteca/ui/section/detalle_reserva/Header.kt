package com.example.biblioteca.ui.section.detalle_reserva

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Detalle de Reserva",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )
        Spacer(modifier = Modifier.height(8.dp))
        Surface(
            color = Color.White.copy(alpha = 0.2f),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text(
                text = "Argumentos recibidos",
                modifier = Modifier.padding(horizontal = 12.dp, vertical = 4.dp),
                color = Color.White,
                fontSize = 12.sp
            )
        }
    }
}
