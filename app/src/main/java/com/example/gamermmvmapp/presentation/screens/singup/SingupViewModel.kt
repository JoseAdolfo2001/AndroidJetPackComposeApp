package com.example.gamermmvmapp.presentation.screens.singup

import android.util.Patterns
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SignupViewModel @Inject constructor() : ViewModel() {

    var username: MutableState<String> = mutableStateOf("")
    var isUserNameValid: MutableState<Boolean> = mutableStateOf(false)
    var userNameErrMsg: MutableState<String> = mutableStateOf("")

    var email: MutableState<String> = mutableStateOf("")
    var isEmailValid: MutableState<Boolean> = mutableStateOf(false)
    var emailErrMsg: MutableState<String> = mutableStateOf("")

    var password: MutableState<String> = mutableStateOf("")
    var isPasswordValid: MutableState<Boolean> = mutableStateOf(false)
    var passwordErrMsg: MutableState<String> = mutableStateOf("")

    var isEnabledButton = false

    fun validatePassword(){
        if(password.value.length >= 6){
            isPasswordValid.value = true
            passwordErrMsg.value = ""
        }else{
            isPasswordValid.value = false
            passwordErrMsg.value = "El password debe tener al menos 6 caracteres`"
        }

    }

    fun validateEmail(){
        if(Patterns.EMAIL_ADDRESS.matcher(email.value).matches()) {
            isEmailValid.value = true
            emailErrMsg.value = ""
        }else{
            isEmailValid.value = false
            emailErrMsg.value = "El email no es valido`"
        }
    }

    fun enabledButton(){
        isEnabledButton = isEmailValid.value && isPasswordValid.value
    }



}