package com.example.coderswag.Controller

import android.content.Intent
import android.nfc.cardemulation.CardEmulation.EXTRA_CATEGORY
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import android.widget.Toast
import com.example.coderswag.Adapters.CategoryAdapter
import com.example.coderswag.Adapters.CategoryRecyclerAdapter
import com.example.coderswag.Model.Category
import com.example.coderswag.R
import com.example.coderswag.Services.DataService
import com.example.coderswag.Services.DataService.categories
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.category_list_item.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecyclerAdapter(this, DataService.categories){ category ->

            val productIntent = Intent(this@MainActivity, ProductsActivity::class.java)
          productIntent.putExtra(EXTRA_CATEGORY, category.title)
           Toast.makeText(this@MainActivity, "${category.title}", Toast.LENGTH_SHORT).show()
            startActivity(productIntent)

        }
        categoryListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this@MainActivity)
        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true)



    }
}