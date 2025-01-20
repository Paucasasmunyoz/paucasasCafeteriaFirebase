package com.pcmdam.paucasascafeteria.adapterComida

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.paucmd.cafeteria.R
import com.pcmdam.paucasascafeteria.CarritoViewModel
import com.pcmdam.paucasascafeteria.Comida

class ComidaAdapter(
    private val comidaList: List<Comida>,
    private val carritoViewModel: CarritoViewModel
) : RecyclerView.Adapter<ComidaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ComidaViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.item_comida, parent, false)
        return ComidaViewHolder(view, carritoViewModel)
    }

    override fun getItemCount(): Int = comidaList.size

    override fun onBindViewHolder(holder: ComidaViewHolder, position: Int) {
        val item = comidaList[position]
        holder.render(item)


        holder.itemView.setOnClickListener {
            carritoViewModel.agregarProducto(item)
        }
    }
}
