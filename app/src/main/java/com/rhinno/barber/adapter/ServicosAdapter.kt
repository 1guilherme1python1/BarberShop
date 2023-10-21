package com.rhinno.barber.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.R
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
        val itemLista = ServicosItemBinding.inflate(
            LayoutInflater.from(context),
            parent,
            false)

        return servicosViewHolder(itemLista)
    }

    override fun getItemCount(): Int {
        return listaService.size
    }

    override fun onBindViewHolder(holder: servicosViewHolder, position: Int) {

        val servico = listaService[position];

        holder.imgServico.setImageResource(servico.img!!)
        holder.textServico.text = servico.nome
    }
}