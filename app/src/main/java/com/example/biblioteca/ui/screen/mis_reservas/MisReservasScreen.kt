package com.example.biblioteca.ui.screen.mis_reservas

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.biblioteca.model.sampleReservations
import com.example.biblioteca.ui.section.mis_reservas.Header
import com.example.biblioteca.ui.section.mis_reservas.ReservaList

@Composable
fun MisReservasScreen(
    onNavigateToDetalle: (String, String, String, String) -> Unit
) {
    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) { padding ->
        Column(modifier = Modifier.padding(padding)) {
            Header()
            ReservaList(
                reservations = sampleReservations,
                onItemClick = { reservation ->
                    onNavigateToDetalle(
                        reservation.nombreLibro,
                        reservation.autor,
                        reservation.fechaReserva,
                        reservation.codigoReserva
                    )
                }
            )
        }
    }
}
