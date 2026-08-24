# Implementation Plan - "Mis Reservas" Full Refactor

Refactor the project to strictly follow the "Mis Reservas" flow and structure shown in the new image, cleaning up old files and ensuring visual consistency.

## Proposed Changes

### Clean Up
#### [DELETE] Old Screens and Sections
Remove all files related to the previous "Biblioteca" flow (Inicio, ListaLibro, DetalleLibro, ConfirmReserva) to avoid confusion.

### Navigation
#### [MODIFY] [Screen.kt](file:///C:/Users/braya/AndroidStudioProjects/Biblioteca/app/src/main/java/com/example/biblioteca/ui/navigation/Screen.kt)
Define routes for:
1. `MisReservas`
2. `DetalleReserva` (params: nombreLibro, autor, fechaReserva, codigoReserva)
3. `RenovarReserva` (params: nombreLibro, fechaReserva)
4. `RenovacionExitosa` (params: nombreLibro, fechaNueva)

#### [MODIFY] [NavGraph.kt](file:///C:/Users/braya/AndroidStudioProjects/Biblioteca/app/src/main/java/com/example/biblioteca/ui/navigation/NavGraph.kt)
Set `MisReservas` as the `startDestination`. Update all composables to handle the specific arguments and navigation flow shown in the image.

### UI Structure (Following the specific pattern)

#### [NEW] ui/screen/
- `mis_reservas/mis_reservas.kt`
- `detalle_reserva/detalle_reserva.kt`
- `renovar_reserva/renovar_reserva.kt`
- `renovacion_exitosa/renovacion_exitosa.kt`

#### [NEW] ui/section/
Group components by screen for better organization:
- `mis_reservas/`: `ReservaHeader`, `ReservaList`.
- `detalle_reserva/`: `DetalleHeader`, `LibroInfo`, `ActionButtons`.
- `renovar_reserva/`: `RenovarHeader`, `RenovarForm`.
- `renovacion_exitosa/`: `ExitoHeader`, `ExitoDetalles`.

#### [NEW] ui/components/
- `mis_reservas/reserva_card.kt`
- `common/`: StatusBadge, DetailRow (for DetalleReserva).

### Design Refinement
- Use exact colors from the image (Green buttons for success, Orange for confirmation, Red for cancellation).
- Add "Argumentos recibidos" badge in `DetalleReserva`.
- Implement the "Info" message in `DetalleReserva`.
- Match the layout of `RenovarReserva` with the book image and date fields.

## Verification Plan

### Manual Verification
1. **App Start**: Verify the app opens in "Mis Reservas".
2. **Parameters**: Verify all strings are encoded/decoded correctly between all 4 screens.
3. **Visuals**: Compare the screens with the reference image (buttons, icons, labels).
4. **Flow**: Verify "Volver a Mis Reservas" from the success screen resets the navigation.
