package com.example.coderswag.Services

import com.example.coderswag.Model.Category
import com.example.coderswag.Model.Product

object DataService {
    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )
    private val hats = listOf(
        Product("Devs lopes Graphic Beanie", "$18", "hat1"),
        Product("Devs lopes Hat Black", "$20", "hat2"),
        Product("Devs lopes Hat White", "$25", "hat3"),
        Product("Devs lopes Snap back ", "$22", "hat4"),
        Product("Devs lopes Graphic Beanie", "$18", "hat1"),
        Product("Devs lopes Hat Black", "$20", "hat2"),
        Product("Devs lopes Hat White", "$25", "hat3"),
        Product("Devs lopes Snap back ", "$22", "hat4"),
        Product("Devs lopes Graphic Beanie", "$18", "hat1"),
        Product("Devs lopes Hat Black", "$20", "hat2"),
        Product("Devs lopes Hat White", "$25", "hat3"),
        Product("Devs lopes Snap back ", "$22", "hat4")

    )
    private val hoodies = listOf(
        Product("Devs lopes Hoodie Gray ", "$28", "hoodie1"),
        Product("Devs lopes Hoodie Red ", "$25", "hoodie2"),
        Product("Devs lopes Hoodie Blue ", "$18", "hoodie3"),
        Product("Devs lopes Hoodie Black ", "$15", "hoodie4")

    )
    private val shorts = listOf(
        Product("Devs lopes Short Gray ", "$20", "shirt1"),
        Product("Devs lopes Badge Light Gray", "$15", "shirt2"),
        Product("Devs lopes Hustle ", "$18", "shirt3"),
        Product("Kick flip Studios ", "$14", "shirt4")

    )
    private val digitalGood = listOf<Product>()

    fun getProducts(category: String?): List<Product> {
        return when (category) {
            "SHIRTS" -> shorts
            "HOODIES" -> hoodies
            "HATS" -> hats
            else -> digitalGood
        }
    }
}