package com.example.biblioteca.ui.screen.renovacion_exitosa

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.biblioteca.ui.section.renovacion_exitosa.ExitoDetalles
import com.example.biblioteca.ui.section.renovacion_exitosa.ExitoHeader

@Composable
fun RenovacionExitosaScreen(
    nombreLibro: String,
    fechaNueva: String,
    onNavigateToMisReservas: () -> Unit
) {
    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) { padding ->
        Column(modifier = Modifier.padding(padding)) {
            ExitoHeader()
            ExitoDetalles(
                nombreLibro = nombreLibro,
                fechaNueva = fechaNueva,
                onBackToReservas = onNavigateToMisReservas
            )
        }
    }
}
