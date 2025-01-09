package com.pcmdam.paucasascafeteria

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.paucmd.cafeteria.R
import com.pcmdam.paucasascafeteria.adapterBebida.BebidaAdapter

class BebidaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_bebida, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecyclerView(view)
    }

    private fun initRecyclerView(view: View){
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerBebida)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = BebidaAdapter(BebidasProvider.bebidaList)
    };
}

 /*Enaitz ho habia fet i hem funcionaba pero nose que va passar vaig tocar algo i ja no puc accedir al fragment de begudes */
