package com.example.coderswag.Services

import com.example.coderswag.Model.Category
import com.example.coderswag.Model.Product

object DataService {
    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")


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
        Product("Devs lopes Short Gray ","$20", "shirt01"),
        Product("Devs lopes Badge Light Gray","$15", "shirt02"),
        Product("Devs lopes Hustle ","$18", "shirt03"),
        Product("Kick flip Studios ","$14", "shirt04")
    )
}