package com.pravin.jetpackcompose

import androidx.compose.material.Switch
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.*

@Composable
@Preview(showSystemUi = true)
fun SwitchComponent() {
    var isChecked by remember{ mutableStateOf(false) }
    Switch(checked = isChecked, onCheckedChange = {
        isChecked = it
    })
}