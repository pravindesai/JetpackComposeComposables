package com.pravin.jetpackcompose.screens

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
fun FirstScreen(navController: NavController= NavController(LocalContext.current)) {
    var text by remember{ mutableStateOf("")}
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
            navController.navigate(Screen.SecondScreen.routs)
        }) {
            Text(text = "Submit")
        }
    }
}