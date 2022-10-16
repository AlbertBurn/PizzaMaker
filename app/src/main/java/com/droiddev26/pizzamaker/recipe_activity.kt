package com.droiddev26.pizzamaker

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.view.menu.MenuView.ItemView


class recipe_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe)

//        val recipeTitle = intent.getParcelableExtra<PizzaItem>("pizza")
//        if (recipeTitle != null) {
            val recipeTitleText: TextView = findViewById(R.id.titleRecipeText)
            val recipeText: TextView = findViewById(R.id.recipeTextView)

            var titleText = recipeTitleText
            var recipeTextvar = recipeText


        titleText.text = intent.extras?.getString("title")
        recipeTextvar.text = intent.extras?.getString("text")


//        }
    }

}