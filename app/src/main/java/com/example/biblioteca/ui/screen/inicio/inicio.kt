package com.example.biblioteca.ui.screen.inicio

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.biblioteca.ui.theme.BibliotecaTheme
import com.example.biblioteca.ui.section.inicio_libro.BtnVerLibros
import com.example.biblioteca.ui.section.inicio_libro.InicioHeader
import com.example.biblioteca.ui.section.inicio_libro.InicioTitle

@Composable
fun InicioScreen(onNavigateToLista: () -> Unit) {
    Scaffold { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            InicioHeader()
            InicioTitle()
            BtnVerLibros(onClick = onNavigateToLista)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun InicioScreenPreview() {
    BibliotecaTheme {
        InicioScreen(onNavigateToLista = {})
    }
}
