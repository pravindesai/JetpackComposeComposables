package com.pravin.jetpackcompose

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun ImageComponent() {

    Card(modifier = Modifier.size(50.dp,50.dp),
        shape = RoundedCornerShape(5.dp),
        backgroundColor = Color.White,
        border = BorderStroke(1.dp, Color.Black),
        elevation = 5.dp) {

               Image(painter = painterResource(
                   id = R.drawable.ic_launcher_background),
                   contentDescription = "test",
                   modifier = Modifier.size(50.dp, 50.dp).padding(1.dp))

    }


}