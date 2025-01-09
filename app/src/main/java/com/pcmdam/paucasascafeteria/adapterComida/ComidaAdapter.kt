package com.pcmdam.paucasascafeteria.adapterComida

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.paucmd.cafeteria.R
import com.pcmdam.paucasascafeteria.Comida

class ComidaAdapter(private val ComidaList:List<Comida>) : RecyclerView.Adapter<ComidaViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ComidaViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ComidaViewHolder(layoutInflater.inflate(R.layout.item_comida, parent, false))
    }

    override fun getItemCount(): Int = ComidaList.size


    override fun onBindViewHolder(holder: ComidaViewHolder, position: Int) {
        val item = ComidaList[position]
        holder.render(item)
    }
}