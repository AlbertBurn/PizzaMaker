package com.droiddev26.pizzamaker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), PizzaItemAdapter.Listener {

//    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // getting the recyclerview by its id
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        // this creates a vertical layout Manager
        recyclerView.layoutManager = LinearLayoutManager(this)

        val items = ArrayList<PizzaItem>()

        items.add(
            PizzaItem(
                R.drawable.pizza1,
                R.string.pizza1,
                R.string.pizza1desc,
                R.string.pizza1recipe
            )
        )
        items.add(
            PizzaItem(
                R.drawable.pizza2,
                R.string.pizza2,
                R.string.pizza2desc,
                R.string.pizza2recipe
            )
        )
        items.add(
            PizzaItem(
                R.drawable.pizza3,
                R.string.pizza3,
                R.string.pizza3desc,
                R.string.pizza3recipe
            )
        )
        items.add(
            PizzaItem(
                R.drawable.pizza4,
                R.string.pizza4,
                R.string.pizza4desc,
                R.string.pizza4recipe
            )
        )
        items.add(
            PizzaItem(
                R.drawable.pizza5,
                R.string.pizza5,
                R.string.pizza5desc,
                R.string.pizza5recipe
            )
        )
        items.add(
            PizzaItem(
                R.drawable.pizza6,
                R.string.pizza6,
                R.string.pizza6desc,
                R.string.pizza6recipe
            )
        )
        items.add(
            PizzaItem(
                R.drawable.pizza7,
                R.string.pizza7,
                R.string.pizza7desc,
                R.string.pizza7recipe
            )
        )
        items.add(
            PizzaItem(
                R.drawable.pizza8,
                R.string.pizza8,
                R.string.pizza8desc,
                R.string.pizza8recipe
            )
        )
        items.add(
            PizzaItem(
                R.drawable.pizza9,
                R.string.pizza9,
                R.string.pizza9desc,
                R.string.pizza9recipe
            )
        )
        items.add(
            PizzaItem(
                R.drawable.pizza10,
                R.string.pizza10,
                R.string.pizza10desc,
                R.string.pizza10recipe
            )
        )
        items.add(
            PizzaItem(
                R.drawable.pizza11,
                R.string.pizza11,
                R.string.pizza11desc,
                R.string.pizza11recipe
            )
        )
        items.add(
            PizzaItem(
                R.drawable.pizza12,
                R.string.pizza12,
                R.string.pizza12desc,
                R.string.pizza12recipe
            )
        )
        items.add(
            PizzaItem(
                R.drawable.pizza13,
                R.string.pizza13,
                R.string.pizza13desc,
                R.string.pizza13recipe
            )
        )
        items.add(
            PizzaItem(
                R.drawable.pizza14,
                R.string.pizza14,
                R.string.pizza14desc,
                R.string.pizza14recipe
            )
        )

        // This will pass the ArrayList to our Adapter
        val adapter = PizzaItemAdapter(items, this)
        // Setting the Adapter with the recyclerview
        recyclerView.adapter = adapter

    }

    override fun OnClick (pizza: PizzaItem){

        val titleVal = getString(pizza.title)
        val recipeVal = getString(pizza.recipe)

        val recipeIntent = Intent(this, recipe_activity::class.java)
//        recipeIntent.putExtra("pizzaTitle", pizza.title)
//        recipeIntent.putExtra("pizzaRecipe", pizza.recipe)
        recipeIntent.putExtra("pizzaTitle", titleVal)
        recipeIntent.putExtra("pizzaRecipe", recipeVal)
        startActivity(recipeIntent)

    }

}

