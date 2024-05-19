package com.example.veterinariaapi.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.veterinariaapi.screens.AddPet
import com.example.veterinariaapi.screens.MainMenu
import com.example.veterinariaapi.screens.ViewPet

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreens.MainMenu.route) {
        composable(route = AppScreens.MainMenu.route) {
            MainMenu(navController)
        }
        composable(route = AppScreens.AddPet.route) {
            AddPet(navController)
        }
        composable(route = AppScreens.ViewPet.route) {
            ViewPet(navController)
        }
    }
}