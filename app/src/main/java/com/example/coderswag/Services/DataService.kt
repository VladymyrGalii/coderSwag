package com.example.coderswag.Services

import com.example.coderswag.Model.Category
import com.example.coderswag.Model.Product

object DataService {
    val categories = listOf(
        Category("SHIRTS", "shirtImage"),
        Category("HOODIES", "hoodieImage"),
        Category("HATS", "hatsImage"),
        Category("DIGITAL", "digitalImage")
    )
    val hats = listOf(
        Product("Devs lopes Graphic Beanie","$18", "hat01"),
        Product("Devs lopes Hat Black","$20", "hat02"),
        Product("Devs lopes Hat White","$25", "hat03"),
        Product("Devs lopes Snap back ","$22", "hat04")
    )
    val hoodies = listOf(
        Product("Devs lopes Hoodie Gray ","$28", "hoodie01"),
        Product("Devs lopes Hoodie Red ","$25", "hoodie02"),
        Product("Devs lopes Hoodie Blue ","$18", "hoodie03"),
        Product("Devs lopes Hoodie Black ","$15", "hoodie04")
    )
    val shorts = listOf(
        Product("Devs lopes Short Gray ","$20", "short01"),
        Product("Devs lopes Badge Light Gray","$15", "short02"),
        Product("Devs lopes Hustle ","$18", "short03"),
        Product("Kick flip Studios ","$14", "short04")
    )
}