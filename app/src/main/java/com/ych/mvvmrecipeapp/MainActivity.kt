package com.ych.mvvmrecipeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.ych.mvvmrecipeapp.ui.composable.ScrollableList
import com.ych.mvvmrecipeapp.ui.composable.Study1

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .border(border = BorderStroke(width = 5.dp, color = Color.Black))
            ) {
                Text(text = "我是Jetpack Compose",Modifier.align(alignment = Alignment.CenterHorizontally))
            }
//            Study1()
//            ScrollableList()
        }
    }
}












