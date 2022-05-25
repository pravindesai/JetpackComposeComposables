package com.pravin.jetpackcompose.screens

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.compose.runtime.*

@Composable
@Preview
fun FirstScreen(navController: NavController = NavController(LocalContext.current)) {
    var text by remember{ mutableStateOf("")}
    val mContext:Context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(value = text,
            onValueChange ={ text=it },
            label = { Text(text = "Enter your text") }
        )
        Button(onClick = {
            if (text.isBlank()){
                Toast.makeText(mContext, "Text Required", Toast.LENGTH_SHORT).show()
                return@Button
            }
            navController.navigate(Screen.SecondScreen.withArgs(text))
        }) {
            Text(text = "Submit")
        }
    }
}