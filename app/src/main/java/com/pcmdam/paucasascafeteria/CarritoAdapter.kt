package com.pcmdam.paucasascafeteria

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.paucmd.cafeteria.R

class CarritoAdapter(private val productos: List<Producto>) : RecyclerView.Adapter<CarritoAdapter.ProductoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_bebida, parent, false)
        return ProductoViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProductoViewHolder, position: Int) {
        val producto = productos[position]
        holder.bind(producto)
    }

    override fun getItemCount(): Int = productos.size

    inner class ProductoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(producto: Producto) {
            val nameTextView: TextView = itemView.findViewById(R.id.productName) // Usar el ID correcto
            val priceTextView: TextView = itemView.findViewById(R.id.productPrice) // Usar el ID correcto
            nameTextView.text = producto.nombre
            priceTextView.text = "$${producto.precio}"
        }
    }
}

