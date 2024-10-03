package com.example.gamermmvmapp.presentation.screens.singup

import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.gamermmvmapp.presentation.componets.DefaultTopBar
import com.example.gamermmvmapp.presentation.screens.singup.componets.SignupContent

@Composable
fun SignupScreen(navController:NavHostController){
    Scaffold(
        topBar = {
                 Surface (
                     shadowElevation = 3.dp
                 ){
                     DefaultTopBar(
                         title = "Nuevo Usuario",
                         upAvailable = true,
                         navController = navController,
                     )
                 }
        },
        content = {
            SignupContent(paddingValues = it)
        },
        bottomBar = {}
    )
}