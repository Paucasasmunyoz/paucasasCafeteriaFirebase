package com.pcmdam.paucasascafeteria.adapterBebida

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.paucmd.cafeteria.R
import com.pcmdam.paucasascafeteria.Bebida
import com.pcmdam.paucasascafeteria.CarritoViewModel

class BebidaAdapter(
    private val BebidaList: List<Bebida>,
    private val carritoViewModel: CarritoViewModel
) : RecyclerView.Adapter<BebidaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BebidaViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.item_bebida, parent, false)
        return BebidaViewHolder(view)
    }

    override fun getItemCount(): Int = BebidaList.size

    override fun onBindViewHolder(holder: BebidaViewHolder, position: Int) {
        val item = BebidaList[position]
        holder.render(item)

        holder.itemView.setOnClickListener {
            carritoViewModel.agregarProducto(item)
        }
    }
}
