package com.ych.mvvmrecipeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ych.mvvmrecipeapp.ui.theme.MvvmRecipeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Row{
//                MessageCard("Hello")
                MessageCard2(Message("Android", "Jetpack Compose"))
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
}

@Composable
private fun MessageCard(s: String) {
    Text(text = "$s World~~~~")
}

@Composable
private fun MessageCard2(message: Message) {
    Text(text = message.author)
    Text(text = message.body)
}

data class Message(val author: String, val body: String)

