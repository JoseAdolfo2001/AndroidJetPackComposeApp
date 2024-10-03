package com.example.gamermmvmapp.presentation.screens.login.componets

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.ViewModel
import com.example.gamermmvmapp.R
import com.example.gamermmvmapp.presentation.componets.DefaultButton
import com.example.gamermmvmapp.presentation.componets.DefaultTextField
import com.example.gamermmvmapp.presentation.screens.login.LoginViewModel
import com.example.gamermmvmapp.presentation.theme.Darkaray500
import com.example.gamermmvmapp.presentation.theme.Red500

@Composable
fun LoginContent( paddingValues: PaddingValues  , viewModel : LoginViewModel = hiltViewModel()){
    Box(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        BoxHeader()
        CardForm(viewModel)

    }
}


@Composable
fun CardForm(viewModel: LoginViewModel){



    Card(
        modifier = Modifier
            .padding(
                start = 36.dp,
                end = 36.dp,
                top = 200.dp
            ),
        colors = CardDefaults.cardColors(
            containerColor = Darkaray500,
        )
    ) {
        Column(
            modifier = Modifier.padding(horizontal = 24.dp)
        ) {

            Text(
                modifier = Modifier.padding(top = 40.dp),
                text = "LOGIN",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = "Por favor inicia sesion para continuar" , fontSize = 12.sp , color = Color.Gray)

            DefaultTextField(
                modifier = Modifier.padding(top = 25.dp),
                value = viewModel.email.value,
                onValueChanged = { viewModel.email. value = it},
                label = "Correo electrónico",
                icon = Icons.Default.Email,
                keyBoardType = KeyboardType.Email,
                errorMessage = viewModel.emailErrorMessage.value,
                validateField = {
                    viewModel.validateEmail()
                }
            )

            DefaultTextField(
                modifier = Modifier.padding(top = 5.dp),
                value = viewModel.password. value,
                onValueChanged = { viewModel.password. value = it },
                label = "Contraseña",
                icon = Icons.Default.Lock,
                hideText = true,
                errorMessage = viewModel.passwordErrorMessage.value,
                validateField = {
                    viewModel.validatePassword()
                }
            )

            DefaultButton(
                text = "Iniciar Sesion",
                onClick = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 48.dp),
                enabled = viewModel.isEnabledLoginButton
            )
        }
    }
}

@Composable
fun BoxHeader(){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(280.dp)
            .background(Red500)
    ){
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                modifier = Modifier.height(130.dp),
                painter = painterResource(id = R.drawable.control),
                contentDescription = "Control de xbox 360"
            )
            Text(
                text = "FIREBASE MVVM"
            )
        }
    }
}