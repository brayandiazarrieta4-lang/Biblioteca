package com.example.biblioteca.model

data class Reservation(
    val id: String,
    val nombreLibro: String,
    val autor: String,
    val fechaReserva: String,
    val codigoReserva: String,
    val estado: String // "Activa", "Cancelada", etc.
)

val sampleReservations = listOf(
    Reservation(
        id = "1",
        nombreLibro = "Clean Code",
        autor = "Robert C. Martin",
        fechaReserva = "15/06/2026",
        codigoReserva = "RES-2026-001",
        estado = "Activa"
    )
)
