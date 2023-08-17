package com.ych.mvvmrecipeapp

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier.padding(10.dp)) {
                Text(text = "Hey look some text")
                Spacer(modifier = Modifier.padding(top = 10.dp))
                Button(onClick = {
                    Toast.makeText(this@MainActivity,"哈哈哈",Toast.LENGTH_SHORT).show()
                }) {
                    Text(text = "A BUTTON")
                }
                MyComponent()
            }
        }

//        setContent {
//            MvvmRecipeAppTheme {
//                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                    Greeting("Android")
//                }
//            }
//        }
    }

    @Composable
    fun MyComponent() {
        var count by remember { mutableStateOf(0) }

        Button(onClick = { count++ }) {
            Text("点击了 $count 次")
        }
    }
}








