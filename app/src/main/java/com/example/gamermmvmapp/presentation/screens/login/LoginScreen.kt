package com.example.gamermmvmapp.presentation.screens.login
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.gamermmvmapp.presentation.screens.login.componets.LoginBottomBar

import com.example.gamermmvmapp.presentation.screens.login.componets.LoginContent


@Composable
fun LoginScreen(navController:NavHostController) {

    val viewModel = LoginViewModel()

    Scaffold(
        topBar = {},
        content = {
          LoginContent(it , viewModel)
        },
        bottomBar = {
          LoginBottomBar(navController)
        }
    )
}
