package com.pravin.jetpackcompose

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun StickyHeaderDemo() {
    var stickyHeader = listOf<String>("A","B","C","D","E","F","G","H","I","J","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z")

    val dataMap = hashMapOf<String, List<String>>(
        Pair("A", listOf("A","AA","AAA","AAAAA","AAAAAA","AAAAAAA","AAAAAAAAA")),
        Pair("B", listOf("B","BB","BBB","BBBBB","BBBBBB","BBBBBBB","BBBBBBBBB")),
        Pair("C", listOf("C","CC","CCC","CCCCC","CCCCCC","CCCCCCC","CCCCCCCCC")),
        Pair("D", listOf("D","DD","DDD","DDDDD","DDDDDD","DDDDDDD","DDDDDDDDD")),
        Pair("E", listOf("E","EE","EEE","EEEEE","EEEEEE","EEEEEEE","EEEEEEEEE"))
        )

    LazyColumn(){
        dataMap.keys.forEach {
            stickyHeader {
                Card(modifier = Modifier.fillMaxWidth(),
                    backgroundColor = Color.Cyan,
                    elevation = 10.dp) {
                    Text(text = it,
                        modifier = Modifier.padding(5.dp).fillMaxWidth(),
                        fontSize = 22.sp,
                        textAlign = TextAlign.Center)
                }
            }
            itemsIndexed(dataMap[it]?: listOf()){ index, value->
                Card(modifier = Modifier.fillMaxWidth().padding(10.dp),
                    backgroundColor = Color.Blue) {
                    Text(text = "$value",color = Color.White,
                        modifier = Modifier.padding(5.dp).fillMaxWidth(),
                        fontSize = 18.sp, textAlign = TextAlign.Center)
                }
            }
        }

    }
}