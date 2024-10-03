package com.example.gamermmvmapp.presentation.componets

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gamermmvmapp.presentation.theme.Red700

@Composable
fun DefaultTextField(
    modifier:Modifier,
    value:String,
    errorMessage:String = "",
    onValueChanged:(value:String) -> Unit,
    validateField:() -> Unit = {},
    label:String,
    icon:ImageVector,
    keyBoardType:KeyboardType = KeyboardType.Text,
    hideText:Boolean = false,
    color:Color = Color.White
){
    Column {
        OutlinedTextField(
            modifier = modifier,
            value = value,
            onValueChange = {
                    onValueChanged(it)
                    validateField()
                },
            keyboardOptions = KeyboardOptions(
                keyboardType = keyBoardType
            ),
            visualTransformation = if(hideText) PasswordVisualTransformation() else VisualTransformation.None,
            label = { Text(label) },
            leadingIcon = {
                Icon(
                    imageVector = icon,
                    contentDescription = "",
                    tint = color
                )
            }
        )
        Text(
            modifier = Modifier.padding(top = 5.dp),
            text = errorMessage,
            fontSize = 11.sp,
            color = Red700
        )
    }
}