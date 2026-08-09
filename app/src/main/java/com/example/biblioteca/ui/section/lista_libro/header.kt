package com.example.biblioteca.ui.section.lista_libro

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import com.example.biblioteca.ui.theme.LibraryPurple

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ListaHeader(onBack: () -> Unit) {
    TopAppBar(
        title = {
            Text(
                text = "Catálogo",
                fontWeight = FontWeight.Bold
            )
        },
        navigationIcon = {
            IconButton(onClick = onBack) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = "Volver"
                )
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.surface,
            titleContentColor = LibraryPurple,
            navigationIconContentColor = LibraryPurple
        )
    )
}
