package com.ych.mvvmrecipeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.ych.mvvmrecipeapp.ui.composable.ChildCenterOrEvenly
import com.ych.mvvmrecipeapp.ui.composable.ChildCenterOrEvenlyTest
import com.ych.mvvmrecipeapp.ui.composable.ScrollableList
import com.ych.mvvmrecipeapp.ui.composable.Study1

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            ChildCenterOrEvenly()
            ChildCenterOrEvenlyTest()
//            Study1()
//            ScrollableList()
        }
    }
}












