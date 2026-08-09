package com.example.biblioteca.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.biblioteca.ui.screen.confirm_reserva.ConfirmReservaScreen
import com.example.biblioteca.ui.screen.detalle_libro.DetalleLibroScreen
import com.example.biblioteca.ui.screen.inicio.InicioScreen
import com.example.biblioteca.ui.screen.lista_libro.ListaLibroScreen

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Inicio.route
    ) {
        composable(Screen.Inicio.route) {
            InicioScreen(
                onNavigateToLista = {
                    navController.navigate(Screen.ListaLibro.route)
                }
            )
        }
        composable(Screen.ListaLibro.route) {
            ListaLibroScreen(
                onBack = {
                    navController.popBackStack()
                },
                onNavigateToDetalle = { bookId ->
                    navController.navigate(Screen.DetalleLibro.createRoute(bookId))
                }
            )
        }
        composable(
            route = Screen.DetalleLibro.route,
            arguments = listOf(navArgument("bookId") { type = NavType.StringType })
        ) { backStackEntry ->
            val bookId = backStackEntry.arguments?.getString("bookId") ?: ""
            DetalleLibroScreen(
                bookId = bookId,
                onBack = {
                    navController.popBackStack()
                },
                onNavigateToConfirm = { id ->
                    navController.navigate(Screen.ConfirmReserva.createRoute(id))
                }
            )
        }
        composable(
            route = Screen.ConfirmReserva.route,
            arguments = listOf(navArgument("bookId") { type = NavType.StringType })
        ) { backStackEntry ->
            val bookId = backStackEntry.arguments?.getString("bookId") ?: ""
            ConfirmReservaScreen(
                bookId = bookId,
                onNavigateToInicio = {
                    navController.navigate(Screen.Inicio.route) {
                        popUpTo(Screen.Inicio.route) { inclusive = true }
                    }
                }
            )
        }
    }
}
