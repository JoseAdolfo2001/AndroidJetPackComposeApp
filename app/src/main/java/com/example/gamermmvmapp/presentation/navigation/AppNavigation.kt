package com.example.gamermmvmapp.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.gamermmvmapp.presentation.screens.login.LoginScreen
import com.example.gamermmvmapp.presentation.screens.singup.SignupScreen


@Composable
fun AppNavigation( navController:NavHostController) {

    NavHost(
        navController =  navController,
        startDestination = AppScreen.Login.route
    ){
        composable(route = AppScreen.Login.route){
            LoginScreen(navController)
        }

        composable(route = AppScreen.Signup.route){
            SignupScreen(navController)
        }
    }
}