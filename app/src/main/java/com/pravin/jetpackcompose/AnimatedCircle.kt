package com.pravin.jetpackcompose

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.*
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.sp
import kotlin.math.roundToInt

@Composable
@Preview
fun AnimatedCircle() {

    var isPlay by remember { mutableStateOf(false) }

    val animator = animateFloatAsState(targetValue = if (isPlay) 360f else 0f,
    animationSpec = tween(
        durationMillis = 5000,
        delayMillis = 300
    ))

    LaunchedEffect(key1 = true){ isPlay = true }
    
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {

            Box(modifier = Modifier.size(300.dp), contentAlignment = Alignment.Center){
                    Canvas(modifier = Modifier
                        .size(220.dp)
                        .padding(20.dp)){
                        drawArc(color = Color.Green,
                            startAngle = -90f,
                            sweepAngle = animator.value,
                            useCenter = false,
                            style = Stroke(70f, cap = StrokeCap.Round)
                        )
                    }
                Text(text = "${animator.value.roundToInt()}", fontSize = 20.sp, fontStyle = FontStyle.Italic)
            }
    }
}