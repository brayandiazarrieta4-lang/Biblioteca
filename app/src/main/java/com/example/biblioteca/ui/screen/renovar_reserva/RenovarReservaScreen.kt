package com.example.biblioteca.ui.screen.renovar_reserva

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.biblioteca.ui.section.renovar_reserva.Header
import com.example.biblioteca.ui.section.renovar_reserva.RenovarForm

@Composable
fun RenovarReservaScreen(
    nombreLibro: String,
    fechaReserva: String,
    onBack: () -> Unit,
    onNavigateToExito: (String, String) -> Unit
) {
    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) { padding ->
        Column(modifier = Modifier.padding(padding)) {
            Header(nombreLibro = nombreLibro)
            RenovarForm(
                fechaReserva = fechaReserva,
                onRenovate = { nuevaFecha ->
                    onNavigateToExito(nombreLibro, nuevaFecha)
                }
            )
        }
    }
}
