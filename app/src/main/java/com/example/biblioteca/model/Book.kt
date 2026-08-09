package com.example.biblioteca.model

data class Book(
    val id: String,
    val nombre: String,
    val autor: String,
    val categoria: String,
    val descripcion: String
)

val sampleBooks = listOf(
    Book(
        id = "1",
        nombre = "Clean Code",
        autor = "Robert C. Martin",
        categoria = "Programación",
        descripcion = "Guía práctica para escribir código limpio, legible y mantenible. Un clásico imprescindible para desarrolladores."
    ),
    Book(
        id = "2",
        nombre = "Kotlin para Android",
        autor = "Antonio Leiva",
        categoria = "Desarrollo Móvil",
        descripcion = "Aprende a desarrollar aplicaciones Android modernas utilizando el lenguaje de programación Kotlin."
    ),
    Book(
        id = "3",
        nombre = "Arquitectura de Software",
        autor = "Neal Ford",
        categoria = "Ingeniería",
        descripcion = "Explora los diferentes patrones y principios para diseñar sistemas de software robustos y escalables."
    ),
    Book(
        id = "4",
        nombre = "Jetpack Compose",
        autor = "Google Developers",
        categoria = "UI Design",
        descripcion = "Domina el nuevo kit de herramientas moderno de Android para crear interfaces de usuario nativas de forma declarativa."
    )
)
