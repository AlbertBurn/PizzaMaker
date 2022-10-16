package com.droiddev26.pizzamaker

import android.os.Parcel
import android.os.Parcelable

data class PizzaItem(val imageResource: Int, val title: Int, val description: Int, val recipe: Int) :Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readInt()!!,
        parcel.readInt()!!,
        parcel.readInt()!!
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(imageResource)
        parcel.writeInt(title)
        parcel.writeInt(description)
        parcel.writeInt(recipe)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<PizzaItem> {
        override fun createFromParcel(parcel: Parcel): PizzaItem {
            return PizzaItem(parcel)
        }

        override fun newArray(size: Int): Array<PizzaItem?> {
            return arrayOfNulls(size)
        }
    }
}