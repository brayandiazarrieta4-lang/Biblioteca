package com.example.biblioteca.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.biblioteca.ui.screen.mis_reservas.MisReservasScreen
import com.example.biblioteca.ui.screen.detalle_reserva.DetalleReservaScreen
import com.example.biblioteca.ui.screen.renovar_reserva.RenovarReservaScreen
import com.example.biblioteca.ui.screen.renovacion_exitosa.RenovacionExitosaScreen
import java.net.URLDecoder
import java.nio.charset.StandardCharsets

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.MisReservas.route
    ) {
        // Mis Reservas Flow
        composable(Screen.MisReservas.route) {
            MisReservasScreen(
                onNavigateToDetalle = { nombre, autor, fecha, codigo ->
                    navController.navigate(Screen.DetalleReserva.createRoute(nombre, autor, fecha, codigo))
                }
            )
        }

        composable(
            route = Screen.DetalleReserva.route,
            arguments = listOf(
                navArgument("nombreLibro") { type = NavType.StringType },
                navArgument("autor") { type = NavType.StringType },
                navArgument("fechaReserva") { type = NavType.StringType },
                navArgument("codigoReserva") { type = NavType.StringType }
            )
        ) { backStackEntry ->
            val nombre = URLDecoder.decode(backStackEntry.arguments?.getString("nombreLibro") ?: "", StandardCharsets.UTF_8.toString())
            val autor = URLDecoder.decode(backStackEntry.arguments?.getString("autor") ?: "", StandardCharsets.UTF_8.toString())
            val fecha = URLDecoder.decode(backStackEntry.arguments?.getString("fechaReserva") ?: "", StandardCharsets.UTF_8.toString())
            val codigo = URLDecoder.decode(backStackEntry.arguments?.getString("codigoReserva") ?: "", StandardCharsets.UTF_8.toString())
            
            DetalleReservaScreen(
                nombreLibro = nombre,
                autor = autor,
                fechaReserva = fecha,
                codigoReserva = codigo,
                onBack = { navController.popBackStack() },
                onNavigateToRenovar = { n, f ->
                    navController.navigate(Screen.RenovarReserva.createRoute(n, f))
                }
            )
        }

        composable(
            route = Screen.RenovarReserva.route,
            arguments = listOf(
                navArgument("nombreLibro") { type = NavType.StringType },
                navArgument("fechaReserva") { type = NavType.StringType }
            )
        ) { backStackEntry ->
            val nombre = URLDecoder.decode(backStackEntry.arguments?.getString("nombreLibro") ?: "", StandardCharsets.UTF_8.toString())
            val fecha = URLDecoder.decode(backStackEntry.arguments?.getString("fechaReserva") ?: "", StandardCharsets.UTF_8.toString())
            
            RenovarReservaScreen(
                nombreLibro = nombre,
                fechaReserva = fecha,
                onBack = { navController.popBackStack() },
                onNavigateToExito = { n, fn ->
                    navController.navigate(Screen.RenovacionExitosa.createRoute(n, fn))
                }
            )
        }

        composable(
            route = Screen.RenovacionExitosa.route,
            arguments = listOf(
                navArgument("nombreLibro") { type = NavType.StringType },
                navArgument("fechaNueva") { type = NavType.StringType }
            )
        ) { backStackEntry ->
            val nombre = URLDecoder.decode(backStackEntry.arguments?.getString("nombreLibro") ?: "", StandardCharsets.UTF_8.toString())
            val fecha = URLDecoder.decode(backStackEntry.arguments?.getString("fechaNueva") ?: "", StandardCharsets.UTF_8.toString())
            
            RenovacionExitosaScreen(
                nombreLibro = nombre,
                fechaNueva = fecha,
                onNavigateToMisReservas = {
                    navController.navigate(Screen.MisReservas.route) {
                        popUpTo(Screen.MisReservas.route) { inclusive = true }
                    }
                }
            )
        }
    }
}
