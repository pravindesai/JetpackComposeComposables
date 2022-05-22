package com.pravin.jetpackcompose.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pravin.jetpackcompose.LoginForm
import com.pravin.jetpackcompose.StickyHeaderDemo
import com.pravin.jetpackcompose.ToolBar
import com.pravin.jetpackcompose.screens.NavigationDesign
import com.pravin.jetpackcompose.ui.theme.JetpackComposeTheme

@ExperimentalMaterialApi
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            JetpackComposeTheme {
                Surface(color = MaterialTheme.colors.background) {
                    App_Ui()
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun App_Ui() {
    JetpackComposeTheme {
        NavigationDesign()
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
@Preview(showSystemUi = true)
fun ToolbarWithForm(){
    Column {

        Row(Modifier.wrapContentHeight()) {
            ToolBar()
        }

        Row(modifier = Modifier.fillMaxHeight()) {
            Column( verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxHeight()
                        .fillMaxWidth()
                        .background(Color.White)
                        .padding(5.dp)) {
                LoginForm(modifier = Modifier.background(Color.White))
            }
        }

    }
}
