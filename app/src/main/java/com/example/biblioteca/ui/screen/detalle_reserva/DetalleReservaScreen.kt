package com.example.biblioteca.ui.screen.detalle_reserva

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.biblioteca.ui.section.detalle_reserva.ActionButtons
import com.example.biblioteca.ui.section.detalle_reserva.Header
import com.example.biblioteca.ui.section.detalle_reserva.LibroInfo

@Composable
fun DetalleReservaScreen(
    nombreLibro: String,
    autor: String,
    fechaReserva: String,
    codigoReserva: String,
    onBack: () -> Unit,
    onNavigateToRenovar: (String, String) -> Unit
) {
    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) { padding ->
        Column(modifier = Modifier.padding(padding)) {
            Header()
            LibroInfo(
                nombreLibro = nombreLibro,
                autor = autor,
                fechaReserva = fechaReserva,
                codigoReserva = codigoReserva
            )
            ActionButtons(
                onRenovate = { onNavigateToRenovar(nombreLibro, fechaReserva) },
                onCancel = onBack
            )
        }
    }
}
