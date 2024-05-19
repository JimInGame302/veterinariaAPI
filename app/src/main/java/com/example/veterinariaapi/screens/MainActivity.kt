package com.example.veterinariaapi.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.veterinariaapi.navigation.AppScreens

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainMenu(navController: NavController) {
    Scaffold {
        MainMenuBodyContent(navController)
    }
}

@Composable
fun MainMenuBodyContent(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = {
            navController.navigate(route = AppScreens.AddPet.route)
        }) {
            Text(text = "Add Pet")
        }
        Button(onClick = {
            navController.navigate(route = AppScreens.ViewPet.route)
        }) {
            Text(text = "View Pet")
        }
    }
}