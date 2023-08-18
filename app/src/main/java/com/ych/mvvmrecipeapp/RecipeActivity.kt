package com.ych.mvvmrecipeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.material3.Text

/**
 * TODO：注意：继承AppCompatActivity的Activity它的主题一定需要使以  Theme.XXX开头的
 */
class RecipeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { 
            Text(text = "张三，李四，王五")
        }
//        setContentView(R.layout.activity_recipe)
//
//        supportFragmentManager.beginTransaction().replace(R.id.main_container, RecipeListFragment())
//            .commit()
    }
}