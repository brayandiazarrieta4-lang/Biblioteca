package com.example.biblioteca.ui.navigation

import java.net.URLEncoder
import java.nio.charset.StandardCharsets

sealed class Screen(val route: String) {
    object Inicio : Screen("inicio")
    object ListaLibro : Screen("lista_libro")
    
    object DetalleLibro : Screen("detalle_libro/{bookId}") {
        fun createRoute(bookId: String): String {
            val encId = URLEncoder.encode(bookId, StandardCharsets.UTF_8.toString())
            return "detalle_libro/$encId"
        }
    }
    
    object ConfirmReserva : Screen("confirm_reserva/{bookId}") {
        fun createRoute(bookId: String): String {
            val encId = URLEncoder.encode(bookId, StandardCharsets.UTF_8.toString())
            return "confirm_reserva/$encId"
        }
    }

    object MisReservas : Screen("mis_reservas")
    
    object DetalleReserva : Screen("detalle_reserva/{nombreLibro}/{autor}/{fechaReserva}/{codigoReserva}") {
        fun createRoute(nombre: String, autor: String, fecha: String, codigo: String): String {
            val encNombre = URLEncoder.encode(nombre, StandardCharsets.UTF_8.toString())
            val encAutor = URLEncoder.encode(autor, StandardCharsets.UTF_8.toString())
            val encFecha = URLEncoder.encode(fecha, StandardCharsets.UTF_8.toString())
            val encCodigo = URLEncoder.encode(codigo, StandardCharsets.UTF_8.toString())
            return "detalle_reserva/$encNombre/$encAutor/$encFecha/$encCodigo"
        }
    }
    
    object RenovarReserva : Screen("renovar_reserva/{nombreLibro}/{fechaReserva}") {
        fun createRoute(nombre: String, fecha: String): String {
            val encNombre = URLEncoder.encode(nombre, StandardCharsets.UTF_8.toString())
            val encFecha = URLEncoder.encode(fecha, StandardCharsets.UTF_8.toString())
            return "renovar_reserva/$encNombre/$encFecha"
        }
    }
    
    object RenovacionExitosa : Screen("renovacion_exitosa/{nombreLibro}/{fechaNueva}") {
        fun createRoute(nombre: String, fechaNueva: String): String {
            val encNombre = URLEncoder.encode(nombre, StandardCharsets.UTF_8.toString())
            val encFecha = URLEncoder.encode(fechaNueva, StandardCharsets.UTF_8.toString())
            return "renovacion_exitosa/$encNombre/$encFecha"
        }
    }
}
