package com.example.biblioteca.ui.navigation

sealed class Screen(val route: String) {
    object Inicio : Screen("inicio")
    object ListaLibro : Screen("lista_libro")
    object DetalleLibro : Screen("detalle_libro/{bookId}") {
        fun createRoute(bookId: String) = "detalle_libro/$bookId"
    }
    object ConfirmReserva : Screen("confirm_reserva/{bookId}") {
        fun createRoute(bookId: String) = "confirm_reserva/$bookId"
    }
}
