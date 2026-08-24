package com.example.biblioteca.ui.section.mis_reservas

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.biblioteca.model.Reservation
import com.example.biblioteca.ui.components.mis_reservas.ReservaCard

@Composable
fun ReservaList(
    reservations: List<Reservation>,
    onItemClick: (Reservation) -> Unit
) {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp)
    ) {
        items(reservations) { reservation ->
            ReservaCard(
                reservation = reservation,
                onClick = { onItemClick(reservation) }
            )
        }
    }
}
