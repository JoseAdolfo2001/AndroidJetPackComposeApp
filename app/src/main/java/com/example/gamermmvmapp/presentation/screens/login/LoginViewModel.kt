package com.example.gamermmvmapp.presentation.screens.login

import android.util.Patterns
import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class LoginViewModel @Inject constructor() : ViewModel() {

    var email:MutableState<String> = mutableStateOf("")
    var isEmailValid:MutableState<Boolean> = mutableStateOf(false)
    var emailErrorMessage:MutableState<String> = mutableStateOf("")


    var password:MutableState<String> = mutableStateOf("")
    var isPasswordValid:MutableState<Boolean> = mutableStateOf(false)
    var passwordErrorMessage:MutableState<String> = mutableStateOf("")

    var isEnabledLoginButton = false

    fun validateEmail(){
        if(Patterns.EMAIL_ADDRESS.matcher(email.value).matches()) {
            isEmailValid.value = true
            emailErrorMessage.value = ""
        }else{
            isEmailValid.value = false
            emailErrorMessage.value = "El email no es valido`"
        }

        enabledLoginButton()
    }

    fun validatePassword(){
        if(password.value.length >= 6){
            isPasswordValid.value = true
            passwordErrorMessage.value = ""
        }else{
            isPasswordValid.value = false
            passwordErrorMessage.value = "El password debe tener al menos 6 caracteres`"
        }

        enabledLoginButton()
    }

    fun enabledLoginButton(){
        isEnabledLoginButton = isEmailValid.value && isPasswordValid.value
    }


}