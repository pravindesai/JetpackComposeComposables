package com.pravin.jetpackcompose

import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

 val shimmerColor = listOf(
        Color.LightGray.copy(0.6f),
        Color.LightGray.copy(0.2f),
        Color.LightGray.copy(0.6f))

@Preview
@Composable
fun ContentShimmerAnimation() {

    val infiniteTransition = rememberInfiniteTransition()
    val animateTime = infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = 1000f,
        animationSpec = infiniteRepeatable(tween(durationMillis = 3000, easing = FastOutSlowInEasing))
    )

    val brush = Brush.linearGradient(colors = shimmerColor, start = Offset.Zero, end = Offset(x=animateTime.value, y= animateTime.value))


    Row(modifier = Modifier.fillMaxWidth().padding(5.dp), verticalAlignment = Alignment.CenterVertically) {
        Spacer(modifier = Modifier
            .size(80.dp)
            .clip(CircleShape)
            .background(brush = brush))
        Spacer(modifier = Modifier.width(10.dp))
        Column(verticalArrangement = Arrangement.Center) {
            Spacer(modifier = Modifier
                .height(20.dp)
                .fillMaxWidth(0.7f)
                .background(brush = brush))
            Spacer(modifier = Modifier.height(5.dp))
            Spacer(modifier = Modifier
                .height(20.dp)
                .fillMaxWidth(0.9f)
                .background(brush = brush))
        }
    }
}