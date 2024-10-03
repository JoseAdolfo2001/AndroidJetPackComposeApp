package com.example.gamermmvmapp.presentation.navigation

sealed class AppScreen(val route:String) {

    data object Login : AppScreen(route = "login")
    data object Signup : AppScreen(route = "signup")
}