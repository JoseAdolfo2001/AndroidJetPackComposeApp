package com.example.gamermmvmapp.presentation.screens.singup.componets

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gamermmvmapp.R
import com.example.gamermmvmapp.presentation.componets.DefaultButton
import com.example.gamermmvmapp.presentation.componets.DefaultTextField
import com.example.gamermmvmapp.presentation.theme.Darkaray500
import com.example.gamermmvmapp.presentation.theme.Red500

@Composable
fun SignupContent(paddingValues: PaddingValues){
    Box(
        modifier = Modifier.fillMaxWidth()
    ) {
        BoxHeader(paddingValues)
        CardFormRegister()
    }
}


@Composable
fun CardFormRegister(){
    var email by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

    Card(
        modifier = Modifier
            .padding(
                start = 36.dp,
                end = 36.dp,
                top = 230.dp
            ),
        colors = CardDefaults.cardColors(
            containerColor = Darkaray500,
        )
    ) {
        Column(
            modifier = Modifier.padding(horizontal = 24.dp)
        ) {

            Text(
                modifier = Modifier.padding(top = 30.dp),
                text = "REGISTRO",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = "Por favor ingresa estos datos continuar" , fontSize = 12.sp , color = Color.Gray)

            DefaultTextField(
                modifier = Modifier.padding(top = 5.dp),
                value = password,
                onValueChanged = { password = it },
                label = "Nombre de usuario",
                icon = Icons.Default.Person,
                hideText = true
            )

            DefaultTextField(
                modifier = Modifier.padding(top = 0.dp),
                value = email,
                onValueChanged = { email = it},
                label = "Correo electrónico",
                icon = Icons.Default.Email,
                keyBoardType = KeyboardType.Email
            )

            DefaultTextField(
                modifier = Modifier.padding(top = 0.dp),
                value = password,
                onValueChanged = { password = it },
                label = "Contraseña",
                icon = Icons.Default.Lock,
                hideText = true
            )

            DefaultTextField(
                modifier = Modifier.padding(top = 0.dp),
                value = password,
                onValueChanged = { password = it },
                label = "Confirmar Contraseña",
                icon = Icons.Default.Lock,
                hideText = true,
                color = Color.Gray
            )

            DefaultButton(
                text = "REGISTRARSE",
                onClick = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 24.dp),
            )
        }
    }
}



@Composable
fun BoxHeader(paddingValues: PaddingValues){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(300.dp)
            .background(Red500)
            .padding(paddingValues)
    ){
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 30.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                modifier = Modifier.height(120.dp),
                alignment = Alignment.Center,
                painter = painterResource(id = R.drawable.user),
                contentDescription = "user"
            )
        }
    }
}