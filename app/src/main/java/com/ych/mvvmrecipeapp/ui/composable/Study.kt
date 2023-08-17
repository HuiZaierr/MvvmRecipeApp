package com.ych.mvvmrecipeapp.ui.composable

import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * TODO：学习布局
 */
@Composable
fun Study1() {
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
            Log.e("TAG", "哈哈哈")
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
 * TODO：列表循环
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


/**
 * TODO：子View进行居中或者平分
 *  注意：只能在父View上进行实现
 */
@Composable
fun ChildCenterOrEvenly() {
    Column {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .border(border = BorderStroke(width = 1.dp, color = Color.Black)),
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(
                text = "我是Jetpack Compose1",
                Modifier.align(alignment = Alignment.CenterHorizontally)
            )
            Text(
                text = "我是Jetpack Compose2",
                Modifier.align(alignment = Alignment.CenterHorizontally)
            )
            Text(
                text = "我是Jetpack Compose3",
                Modifier.align(alignment = Alignment.CenterHorizontally)
            )
        }

        Spacer(modifier = Modifier.padding(10.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .border(border = BorderStroke(width = 1.dp, color = Color.Green)),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Text(
                text = "我是Jetpack Compose1",
                Modifier.align(alignment = Alignment.CenterVertically)
            )
            Text(
                text = "我是Jetpack Compose2",
                Modifier.align(alignment = Alignment.CenterVertically)
            )
        }
    }
}

/**
 * TODO：学习测试居中
 */
@Composable
fun ChildCenterOrEvenlyTest() {
    Column {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 15.dp, start = 15.dp, end = 15.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "詹姆斯-哈登",
                modifier = Modifier.align(Alignment.CenterVertically),
                fontSize = 18.sp
            )

            Text(
                text = "$5.99",
                color = Color.Red,
                modifier = Modifier.align(Alignment.CenterVertically)
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 15.dp, start = 15.dp, end = 15.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "勒布朗-詹姆斯",
                fontSize = 18.sp,
                color = Color.Black,
                modifier = Modifier.align(Alignment.CenterVertically)
            )
        }

        Button(onClick = { Log.e("TAG", "下一页") },
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 15.dp)
        ) {
            Text(text = "下一页")
        }
    }
}