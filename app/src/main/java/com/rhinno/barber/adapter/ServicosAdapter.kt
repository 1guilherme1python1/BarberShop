package com.rhinno.barber.adapter

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.rhinno.barber.databinding.ServicosItemBinding
import com.rhinno.barber.model.Servicos

class ServicosAdapter(
    private val context: Context,
    private val listaService: MutableList<Servicos>
): Adapter<ServicosAdapter.servicosViewHolder>() {

    inner class servicosViewHolder(binding: ServicosItemBinding): ViewHolder(binding.root) {
        val imgServico = binding.imgServicos
        val textServico = binding.textServico


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): servicosViewHolder {
        val itemLista = ServicosItemBinding.inflate()
    }

    override fun getItemCount(): Int {
        return listaService.size
    }

    override fun onBindViewHolder(holder: servicosViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}