package com.pravin.jetpackcompose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun TextFieldComponent() {

    Column() {
        TextField(value = "7020529425",
            label = { Text(text = "Phone Number") },
            leadingIcon = { IconButton(onClick = { }) {
                Icon(imageVector = Icons.Filled.Email , contentDescription = "Email")
            }},
            trailingIcon = { IconButton(onClick = { }) {
                Icon(imageVector = Icons.Filled.Clear , contentDescription = "Email")
            }},
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number, imeAction = ImeAction.Go
            ),
            onValueChange = {})

        OutlinedTextField(value = "123", onValueChange = {})
    }

}