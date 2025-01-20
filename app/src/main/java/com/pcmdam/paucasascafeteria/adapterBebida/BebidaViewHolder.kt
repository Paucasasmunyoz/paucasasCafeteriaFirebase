package com.pcmdam.paucasascafeteria.adapterBebida

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.pcmdam.paucasascafeteria.Bebida
import com.bumptech.glide.Glide
import com.paucmd.cafeteria.R

class BebidaViewHolder(view: View): ViewHolder(view) {

    val name = view.findViewById<TextView>(R.id.productName)
    val price = view.findViewById<TextView>(R.id.productPrice)
    val photo = view.findViewById<ImageView>(R.id.productImage)

    fun render(bebidaModel: Bebida) {
        name.text = bebidaModel. nombre
        price.text = bebidaModel.precio.toString()
        Glide.with(photo.context).load(bebidaModel.photo).into(photo)
    }
}
