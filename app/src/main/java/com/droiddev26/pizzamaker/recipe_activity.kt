package com.droiddev26.pizzamaker

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.view.menu.MenuView.ItemView

class recipe_activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe)

        val pizzaTitle = intent.getStringExtra("pizzaTitle").toString()
        //val pizzaTitle = intent.extras?.getString("pizzaTitle")
        val pizzaRecipe = intent.getStringExtra("pizzaRecipe").toString()
        val pizzaTitleTextView: TextView = findViewById(R.id.titleRecipeText)
        val pizzaRecipeTextView: TextView = findViewById(R.id.recipeTextView)
        pizzaTitleTextView.setText(pizzaTitle)
        pizzaRecipeTextView.setText(pizzaRecipe)
    }
}