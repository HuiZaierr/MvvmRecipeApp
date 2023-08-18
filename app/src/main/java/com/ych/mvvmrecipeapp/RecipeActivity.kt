package com.ych.mvvmrecipeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/**
 * TODO：注意：继承AppCompatActivity的Activity它的主题一定需要使以  Theme.XXX开头的
 */
class RecipeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe)

        supportFragmentManager.beginTransaction().replace(R.id.main_container, RecipeListFragment())
            .commit()
    }
}