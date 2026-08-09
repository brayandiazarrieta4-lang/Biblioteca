# Implementation Plan - Biblioteca Android App

Build a simple library application using Kotlin and Jetpack Compose, focusing on clean structure and basic navigation.

## Proposed Changes

### Model
#### [NEW] [Book.kt](file:///C:/Users/braya/AndroidStudioProjects/Biblioteca/app/src/main/java/com/example/biblioteca/model/Book.kt)
Define the `Book` data class with fields: `id`, `nombre`, `autor`, `categoria`, `descripcion`, and `imagenRes` (optional or use icons).

### UI Theme
#### [MODIFY] [Color.kt](file:///C:/Users/braya/AndroidStudioProjects/Biblioteca/app/src/main/java/com/example/biblioteca/ui/theme/Color.kt)
Add theme-specific colors: Purple, Green, and Orange.
#### [MODIFY] [Theme.kt](file:///C:/Users/braya/AndroidStudioProjects/Biblioteca/app/src/main/java/com/example/biblioteca/ui/theme/Theme.kt)
Update the `MaterialTheme` to use the new color palette.

### Navigation
#### [NEW] [Screen.kt](file:///C:/Users/braya/AndroidStudioProjects/Biblioteca/app/src/main/java/com/example/biblioteca/ui/navigation/Screen.kt)
Define routes: `Inicio`, `ListaLibros`, `DetalleLibro/{bookId}`, `ConfirmReserva/{bookId}`.
#### [NEW] [NavGraph.kt](file:///C:/Users/braya/AndroidStudioProjects/Biblioteca/app/src/main/java/com/example/biblioteca/ui/navigation/NavGraph.kt)
Set up `NavHost` and handle navigation between screens.

### Screens and Components
#### [NEW] Screen Packages
- `ui/screen/inicio/inicio.kt`
- `ui/screen/lista_libro/lista_libro.kt`
- `ui/screen/detalle_libro/detalle_libro.kt`
- `ui/screen/confirm_reserva/confirm_reserva.kt`

#### [NEW] Section Packages (Modular UI)
- `ui/section/inicio_libro/` (Header, Title, BtnVerLibros)
- `ui/section/lista_libro/` (Header, Lista)
- `ui/section/detalle_libro/` (Header, LibroInfo, BtnReservar)
- `ui/section/confirm_reserva/` (Header, Detalles, BtnInicio)

#### [NEW] Components Packages
- `ui/components/all/detalles.kt`
- `ui/components/lista_libro/libro_card.kt`

### Main Entry Point
#### [MODIFY] [MainActivity.kt](file:///C:/Users/braya/AndroidStudioProjects/Biblioteca/app/src/main/java/com/example/biblioteca/MainActivity.kt)
Initialize `NavGraph` within the `BibliotecaTheme`.

## Verification Plan

### Automated Tests
- N/A (Requested simple code for students).

### Manual Verification
1. Build and Run the application.
2. Verify "Inicio" screen displays correctly and navigates to "Lista de Libros".
3. Verify "Lista de Libros" displays the 4 sample books.
4. Verify "Ver Detalle" navigates to "Detalle del Libro" with correct data.
5. Verify "Reservar Libro" navigates to "Confirmación".
6. Verify "Volver al Inicio" returns to the start.
