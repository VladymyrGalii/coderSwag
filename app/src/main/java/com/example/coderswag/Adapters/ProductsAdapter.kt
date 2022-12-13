package com.example.coderswag.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.coderswag.Model.Product
import com.example.coderswag.R

class ProductsAdapter(private val context: Context, private val products: List<Product>) :
    RecyclerView.Adapter<ProductsAdapter.ProductHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.product_list_item, parent, false)
        return ProductHolder(view)
    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        holder?.bindProduct(products[position], context)
    }

    override fun getItemCount(): Int {
        return products.count()
    }

    inner class ProductHolder(itemView: View?) : RecyclerView.ViewHolder(itemView!!) {
        private val productImage = itemView?.findViewById<ImageView>(R.id.productImage)
        private val productName = itemView?.findViewById<TextView>(R.id.productName)
        private val productPrice = itemView?.findViewById<TextView>(R.id.productPrice)

        fun bindProduct(product: Product, context: Context) {
            val resourcesId =
                context.resources.getIdentifier(product.image, "drawable", context.packageName)
            productImage?.setImageResource(resourcesId)
            productName?.text = product.title
            productPrice?.text = product.price
        }
    }
}