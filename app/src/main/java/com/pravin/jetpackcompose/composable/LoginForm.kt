package com.pravin.jetpackcompose

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun LoginForm(modifier: Modifier=Modifier) {
    val email = remember { mutableStateOf(TextFieldValue("")) }
    val pass = remember { mutableStateOf(TextFieldValue()) }

    Column(modifier = modifier.padding(5.dp)) {
            EmailEt(email)
            PasswordEt(pass)
            LoginButton(email.value, pass.value)
    }
}

fun login(context: Context, email: TextFieldValue, pass: TextFieldValue) {
    val mPassword = email.text
    val mEmail = pass.text
    if (mPassword.isBlank()){
        Toast.makeText(context, "Email should not be empty", Toast.LENGTH_SHORT).show()
        return
    }
    if (mEmail.isBlank()){
        Toast.makeText(context, "Password should not be empty", Toast.LENGTH_SHORT).show()
        return
    }

    if (mEmail=="123" && mPassword=="123"){
        Toast.makeText(context, "Login Success", Toast.LENGTH_SHORT).show()
    }else{
        Toast.makeText(context, "Login Failed", Toast.LENGTH_SHORT).show()
    }

}

@Composable
fun LoginButton(email: TextFieldValue, pass: TextFieldValue) {
    val mContext  = LocalContext.current
    Button(onClick = { login(mContext, email, pass)},
        border = BorderStroke(width = 1.dp, brush = SolidColor(Color.Black)),
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(text = "Login In", color = Color.White )
    }
}

@Composable
fun EmailEt(email: MutableState<TextFieldValue>) {
    OutlinedTextField(value = email.value,
        onValueChange ={ email.value = it},
        label = { Text(text ="Enter Email") },
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White),
        leadingIcon = {
            IconButton(onClick = { }) {
                Icon(imageVector = Icons.Filled.Email , contentDescription ="Email" )
            }
        },
    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
    )
}

@Composable
fun PasswordEt(pass: MutableState<TextFieldValue>) {
    var passwordVisible = rememberSaveable { mutableStateOf(false) }

    OutlinedTextField(
        value = pass.value,
        onValueChange = { pass.value = it },
        visualTransformation = if (passwordVisible.value) VisualTransformation.None else PasswordVisualTransformation(),
        leadingIcon = {
            val passVisibility: ImageVector =
                if (passwordVisible.value) ImageVector.vectorResource(id =R.drawable.ic_baseline_visibility_24 )
            else ImageVector.vectorResource(id = R.drawable.ic_baseline_visibility_off_24)

            val description = if (passwordVisible.value) "Hide password" else "Show password"
            IconButton(onClick = { passwordVisible.value = !passwordVisible.value }) {
                Icon(imageVector = passVisibility, description)
            }
        },
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White),
        label = { Text(text = "Enter Password") },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
    )
}