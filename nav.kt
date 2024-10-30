// nav.kt
package com.example.utsmobcom

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavHostSetup() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = "main") {
        composable("main") { HomeScreen(navController) } // Memanggil HomeScreen
        composable("edit") { EditActivity(navController) }
    }
}
