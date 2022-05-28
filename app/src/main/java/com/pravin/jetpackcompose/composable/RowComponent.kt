package com.pravin.jetpackcompose

import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.runtime.Composable
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun RowComponent() {
    Row(modifier = Modifier.size(350.dp, 350.dp).background(Color.White),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically) {
        Cube(mColor = Color.Green)
        Cube(mColor = Color.Blue)
        Cube(mColor = Color.Red)
    }
}

@Composable
fun Cube(mColor: Color){
    Box(modifier = Modifier
        .size(100.dp, 100.dp)
        .background(color = mColor))
}