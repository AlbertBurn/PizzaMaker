package com.droiddev26.pizzamaker

import android.content.Context
import android.content.Intent
import android.content.res.Resources
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PizzaItemAdapter(private val items: ArrayList<PizzaItem>) :
    RecyclerView.Adapter<PizzaItemAdapter.PizzaItemViewHolder>(){

    var onItemClick: ((PizzaItem) -> Unit)? = null
    // Holds the views for adding it to image and text
    class PizzaItemViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {

        val imageView: ImageView = itemView.findViewById(R.id.pizzaView)
        val text1: TextView = itemView.findViewById(R.id.titleTextView)
        val text2: TextView = itemView.findViewById(R.id.descriptionTextView)
    }

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PizzaItemViewHolder {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.pizza_item, parent, false)
        return PizzaItemViewHolder(itemView)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: PizzaItemViewHolder, position: Int) {

        val itemsViewModel = items[position]

        // sets the image to the imageview from our itemHolder class
        holder.imageView.setImageResource(itemsViewModel.imageResource)

        // sets the text to the textview from our itemHolder class
        holder.text1.text = holder.itemView.context.getString(itemsViewModel.title)

        // sets the text to the textview from our itemHolder class
        holder.text2.text = holder.itemView.context.getString(itemsViewModel.description)

        holder.itemView.setOnClickListener {
            onItemClick?.invoke(itemsViewModel)

        }
    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return items.size
    }
}