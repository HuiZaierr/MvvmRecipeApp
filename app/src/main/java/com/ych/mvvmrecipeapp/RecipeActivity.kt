package com.ych.mvvmrecipeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class RecipeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe)

        supportFragmentManager.beginTransaction().replace(R.id.main_container, RecipeListFragment())
            .commit()
    }
}