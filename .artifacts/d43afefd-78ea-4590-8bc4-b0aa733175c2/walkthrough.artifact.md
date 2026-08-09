# Walkthrough - Biblioteca Android App

I have implemented the Biblioteca application following the requested modular structure and design requirements.

## Changes Made

### 1. Project Structure
The project is organized by responsibilities to make it easy for students to understand:
- `model`: Contains `Book.kt` with the data class and sample data.
- `ui/navigation`: Manages routes (`Screen.kt`) and the navigation host (`NavGraph.kt`).
- `ui/screen`: Contains the 4 main screens (Inicio, ListaLibro, DetalleLibro, ConfirmReserva).
- `ui/section`: Contains modular UI parts for each screen (Headers, Lists, Buttons).
- `ui/components`: Contains reusable components like `LibroCard`.

### 2. Navigation
- Used **Navigation Compose** to handle transitions.
- The `bookId` is passed as an argument when navigating from the list to the details and confirmation screens.
- Defined a clear flow: Inicio -> Lista -> Detalle -> Confirm -> Inicio.

### 3. Design & Theme
- Defined custom colors: `LibraryPurple`, `LibraryGreen`, and `LibraryOrange`.
- Used `Material3` with custom shapes and cards.
- Added `material-icons-extended` for expressive icons.

## How to Test
1. **Launch**: The app starts at the `Inicio` screen.
2. **Navigate**: Click "Ver Libros" to see the list.
3. **Select**: Click "Ver Detalle" on any book (e.g., Clean Code).
4. **Reserve**: Click "Reservar Libro" to see the success message.
5. **Return**: Click "Volver al Inicio" to reset the flow.

## Dependencies Added
- `androidx.navigation:navigation-compose`
- `androidx.compose.material:material-icons-extended`
