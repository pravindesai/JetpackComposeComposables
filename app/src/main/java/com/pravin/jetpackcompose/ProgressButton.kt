package com.pravin.jetpackcompose

import android.graphics.drawable.shapes.Shape
import android.widget.Space
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pravin.jetpackcompose.ui.theme.Shapes
import androidx.compose.runtime.*

@OptIn(ExperimentalMaterialApi::class)
@Preview
@Composable
fun ProgressButton(modifier: Modifier= Modifier) {
    var isButtonClicked by remember { mutableStateOf(false) }
    Surface(onClick = {isButtonClicked = !isButtonClicked},
        shape = Shapes.medium,
        border = BorderStroke(1.dp, Color.Blue),
        color = Color.White,
        elevation = 5.dp){
            Row(verticalAlignment = Alignment.CenterVertically, modifier = modifier.padding(10.dp,5.dp, 10.dp, 5.dp)) {
                Icon(painter = painterResource(id = R.drawable.ic_baseline_login_24),
                    contentDescription ="",
                    tint = Color.Unspecified )
                Spacer(modifier = Modifier.width(10.dp))
                Text(text = "Login")

                if (isButtonClicked){
                    Spacer(modifier = Modifier.width(10.dp))
                    CircularProgressIndicator(
                        modifier = Modifier.width(16.dp).height(16.dp),
                        color = MaterialTheme.colors.primary,
                        strokeWidth = 2.dp
                    )
                }

            }
    }
}