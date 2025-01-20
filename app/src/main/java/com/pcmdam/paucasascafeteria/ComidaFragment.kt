package com.pcmdam.paucasascafeteria

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.pcmdam.paucasascafeteria.adapterComida.ComidaAdapter
import com.paucmd.cafeteria.R

class ComidaFragment : Fragment() {

    private val carritoViewModel: CarritoViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_comida, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initRecyclerView(view)
    }

    private fun initRecyclerView(view: View) {
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerComida)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        recyclerView.adapter = ComidaAdapter(ComidaProvider.comidaList, carritoViewModel)
    }
}
