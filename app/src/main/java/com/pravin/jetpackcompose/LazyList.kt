package com.pravin.jetpackcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview(showSystemUi = true)
fun LazyDataList() {
    val numberList = listOf("A","B","C","D","A","B","C","D","A","B","C","D","A","B","C","D","A","B","C","D","A","B","C","D","A","B","C","D","A","B","C","D")
    Column(modifier = Modifier
        .background(Color.White), horizontalAlignment = Alignment.CenterHorizontally) {
        LazyColumn(){
            itemsIndexed(numberList){index, value->
                Row(modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center) {
                    Text(text = "Item $index : $value ", color = Color.Black, fontSize = 16.sp,
                        modifier = Modifier
                            .wrapContentWidth()
                            .padding(10.dp))
                    }
                }
        }
    }
}