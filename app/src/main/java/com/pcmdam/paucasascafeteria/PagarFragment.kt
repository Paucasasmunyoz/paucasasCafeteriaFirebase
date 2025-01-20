package com.pcmdam.paucasascafeteria

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.RecyclerView
import com.paucmd.cafeteria.R

class PagarFragment : Fragment() {

    private val carritoViewModel: CarritoViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_pagar, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerViewCarrito)
        val totalTextView: TextView = view.findViewById(R.id.totalTextView)
        val vaciarButton: Button = view.findViewById(R.id.vaciarButton)

        carritoViewModel.productos.observe(viewLifecycleOwner) { productos ->
            recyclerView.adapter = CarritoAdapter(productos)
        }

        carritoViewModel.total.observe(viewLifecycleOwner) { total ->
            totalTextView.text = "Total: $${total}"
        }

        vaciarButton.setOnClickListener {
            carritoViewModel.vaciarCarrito()
        }
    }
}
