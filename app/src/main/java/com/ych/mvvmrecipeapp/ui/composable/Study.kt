package com.ych.mvvmrecipeapp.ui.composable

import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

/**
 * TODO：学习布局
 */
@Composable
fun Study1(){
    Column(modifier = Modifier.padding(10.dp)) {
        Surface(
            color = Color.White,
            shadowElevation = 4.dp,
            shape = RoundedCornerShape(8.dp),
            border = BorderStroke(1.dp, Color.Gray)
        ) {
            Text("这是一个表面")
        }
        Text(text = "Hey look some text")
        Spacer(modifier = Modifier.padding(top = 10.dp))
        Button(onClick = {
            Log.e("TAG","哈哈哈")
        }) {
            Text(text = "A BUTTON")
        }
        MyComponent()
    }
}

/**
 * TODO：学习状态保存remember
 */
@Composable
fun MyComponent() {
    var count by remember { mutableStateOf(0) }

    Button(onClick = { count++ }) {
        Text("点击了 $count 次")
    }
}


/**
 * TODO：列表
 */
@Composable
fun ScrollableList() {
//    val items = List(100) { "Item $it" }
//    Column(Modifier.verticalScroll(rememberScrollState())) {
//        items.forEach { item ->
//            Text(text = item, modifier = Modifier.padding(16.dp))
//        }
//    }

    val items = List(100) { "Item $it" }
    LazyColumn(Modifier.fillMaxSize()) {
        items(items) { item ->
            Text(text = item, modifier = Modifier.padding(16.dp))
        }
    }
}