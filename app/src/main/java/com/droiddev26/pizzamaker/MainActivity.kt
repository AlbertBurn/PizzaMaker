package com.droiddev26.pizzamaker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // this creates a vertical layout Manager
        recyclerView.layoutManager = LinearLayoutManager(this)
        // This will pass the ArrayList to our Adapter
        val items = ArrayList<PizzaItem>()
        val adapter = PizzaItemAdapter(items)
        // Setting the Adapter with the recyclerview
        recyclerView.adapter = adapter

        items.add(
            PizzaItem(
                R.drawable.pizza1,
                "Hello",
                "Come in"
            )
        )
    }

}