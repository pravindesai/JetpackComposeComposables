package com.pravin.jetpackcompose.screens_navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
@Composable
@Preview
fun SecondScreen(data:String="", navController: NavController = NavController(LocalContext.current)) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Magenta),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = data)
        Button(onClick = {
            navController.navigateUp()
        }) {
            Text(text = "Go Back")
        }
    }
}