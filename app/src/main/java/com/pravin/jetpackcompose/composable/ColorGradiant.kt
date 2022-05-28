package com.pravin.jetpackcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
@Preview
fun ColorGradiant(){
       val bHg = Brush.horizontalGradient(colors = listOf(Color.Blue, Color.Green, Color.Cyan))
       val bLg = Brush.linearGradient(colors = listOf(Color.Blue, Color.Green, Color.Cyan))
       val bRg = Brush.radialGradient(colors = listOf(Color.Blue, Color.Green, Color.Cyan))

    Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Box(modifier = Modifier
            .size(200.dp, 200.dp).padding(5.dp)
            .background(bHg))
        Box(modifier = Modifier
            .size(200.dp, 200.dp).padding(5.dp)
            .background(bLg))
        Box(modifier = Modifier
            .size(200.dp, 200.dp).padding(5.dp)
            .background(bRg))
    }

}