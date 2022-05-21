package com.pravin.jetpackcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun BoxComponent() {
    Box(
        modifier = Modifier.size(400.dp, 400.dp).background(Color.Cyan),
        contentAlignment = Alignment.BottomCenter) {

        Box(modifier = Modifier.size(50.dp, 50.dp).background(Color.Green)) {
        }

    }
}