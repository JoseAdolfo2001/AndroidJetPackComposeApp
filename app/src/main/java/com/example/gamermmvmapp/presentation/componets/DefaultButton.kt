package com.example.gamermmvmapp.presentation.componets

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gamermmvmapp.presentation.theme.Red500
import com.example.gamermmvmapp.presentation.theme.Red700

@Composable
fun DefaultButton(
    text: String,
    errorMessage:String = "",
    onClick: () -> Unit,
    color: Color = Red500,
    icon:ImageVector = Icons.Default.ArrowForward,
    modifier:Modifier,
    enabled: Boolean = true
){
    Column {
        Button(
            modifier = modifier,
            contentPadding = PaddingValues(vertical = 16.dp),
            shape = RoundedCornerShape(8.dp),
            onClick = {onClick()},
            colors = ButtonDefaults.buttonColors(containerColor = color),
            enabled = enabled
        ) {
            Icon(
                imageVector = icon,
                contentDescription = "",
                tint = Color.White
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                color = Color.White,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                text = text
            )
        }

        Text(
            modifier = Modifier.padding(top = 5.dp),
            text = errorMessage,
            fontSize = 11.sp,
            color = Red700
        )
    }
}