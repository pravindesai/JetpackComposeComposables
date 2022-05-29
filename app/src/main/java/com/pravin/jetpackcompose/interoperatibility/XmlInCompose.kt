package com.pravin.jetpackcompose.interoperatibility

import android.annotation.SuppressLint
import android.widget.TextView
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.content.res.ResourcesCompat
import com.pravin.jetpackcompose.R

@SuppressLint("SetTextI18n")
@Preview
@Composable
fun XmlInCompose() {
    val aTv = TextView(LocalContext.current)
    aTv.text = "I'm Android Textview"
    aTv.setTextColor(
        ResourcesCompat.getColor(
            LocalContext.current.resources,
            R.color.light_blue_400,
            null
        )
    )
    AndroidView(factory = {
        aTv
    })


}