package com.pravin.jetpackcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview(showSystemUi = true)
@Composable
fun ToolBar() {
    MaterialTheme() {
        TopAppBar(
            title = { Text(text = "My Toolbar")},
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .background(Color.Green),
            navigationIcon = {IconButton(onClick = {}){
                Icon(imageVector =Icons.Default.Menu , contentDescription = "Toolbar icon") }
            },
            actions = {
                IconButton(onClick = {}){
                    Icon(imageVector =Icons.Default.Search , contentDescription = "search") }
                IconButton(onClick = {}){
                    Icon(imageVector =Icons.Default.Favorite , contentDescription = "setting") }
            }
        )
    }

}