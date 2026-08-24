package com.example.biblioteca.ui.components.common

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.biblioteca.ui.theme.LibraryGreen

@Composable
fun StatusBadge(status: String) {
    Surface(
        color = LibraryGreen.copy(alpha = 0.1f),
        shape = RoundedCornerShape(16.dp)
    ) {
        Text(
            text = status,
            modifier = Modifier.padding(horizontal = 12.dp, vertical = 4.dp),
            color = LibraryGreen,
            fontWeight = FontWeight.Bold,
            fontSize = 12.sp
        )
    }
}
