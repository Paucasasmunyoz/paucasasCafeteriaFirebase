package com.pcmdam.paucasascafeteria.adapterComida

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.pcmdam.paucasascafeteria.Comida
import com.bumptech.glide.Glide
import com.paucmd.cafeteria.R
import com.pcmdam.paucasascafeteria.CarritoViewModel

class ComidaViewHolder(view: View, carritoViewModel: CarritoViewModel): ViewHolder(view) {

    val name = view.findViewById<TextView>(R.id.productName)
    val price = view.findViewById<TextView>(R.id.productPrice)
    val photo = view.findViewById<ImageView>(R.id.productImage)

    fun render(comidaModel: Comida){
        name.text = comidaModel.nombre
        price.text = comidaModel.precio.toString()
        Glide.with(photo.context).load(comidaModel.photo).into(photo)
    }
}
