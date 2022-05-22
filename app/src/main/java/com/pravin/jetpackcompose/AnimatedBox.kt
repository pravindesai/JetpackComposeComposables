package com.pravin.jetpackcompose

import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.*
import kotlinx.coroutines.delay

@Composable
@Preview
fun AnimatedBox() {
    val mSize = remember { mutableStateOf(200)}
    val animationSizeState = animateDpAsState(targetValue = mSize.value.dp,
    animationSpec = tween(durationMillis = 500, delayMillis = 200, easing = LinearOutSlowInEasing))
//    animationSpec = spring(Spring.DampingRatioMediumBouncy ))
    Card(modifier = Modifier
        .size(size = animationSizeState.value)){
        Button(onClick = { mSize.value = mSize.value+50},
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()) {
            Text(text = "Click")
        }
    }
}