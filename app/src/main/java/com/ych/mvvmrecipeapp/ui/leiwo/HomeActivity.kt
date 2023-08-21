package com.ych.mvvmrecipeapp.ui.leiwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import com.ych.mvvmrecipeapp.R
import com.ych.mvvmrecipeapp.ui.composable.ChildCenterOrEvenlyTest
import com.ych.mvvmrecipeapp.ui.leiwo.composable.home.Home_TOP_WEATHER
import com.ych.mvvmrecipeapp.ui.theme.Typography

/**
 * todo
 */
class HomeActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Home_TOP_WEATHER()
        }
    }
}