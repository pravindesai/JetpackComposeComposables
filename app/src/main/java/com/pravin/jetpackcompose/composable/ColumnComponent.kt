package com.pravin.jetpackcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun ColumnComponent() {
        Column(modifier = Modifier.size(150.dp, 350.dp).background(Color.White),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally ) {
            Boxx(Color.Red)
            Boxx(Color.Blue)
            Boxx(Color.Black)
        }
}

@Composable
fun Boxx(mColor: Color){
    Box(modifier = Modifier
        .size(100.dp, 100.dp)
        .background(color = mColor))
}