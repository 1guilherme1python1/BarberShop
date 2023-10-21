package com.rhinno.barber.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import androidx.recyclerview.widget.GridLayoutManager
import com.rhinno.barber.R
import com.rhinno.barber.adapter.ServicosAdapter
import com.rhinno.barber.databinding.ActivityHomeBinding
import com.rhinno.barber.model.Servicos

class Home : AppCompatActivity() {

    private val binding by lazy {
        ActivityHomeBinding.inflate(layoutInflater)
    }

    private lateinit var servicosAdapter: ServicosAdapter
    private val listaServicos: MutableList<Servicos> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)



        val nome = intent.extras?.getString("nome")

        binding.textNomeUsuario.text = "Bem-vindo(a), $nome"

        val recyclerViewServicos = binding.recyclerViewServicos

        recyclerViewServicos.layoutManager = GridLayoutManager(this, 2)

        servicosAdapter = ServicosAdapter(this, listaServicos)

        recyclerViewServicos.setHasFixedSize(true)
        recyclerViewServicos.adapter = servicosAdapter

        getServicos()

        binding.btnAgendar.setOnClickListener {
            val intent = Intent(this, Agendamento::class.java)
            intent.putExtra("nome", nome)
            startActivity(intent)
        }
    }


    private fun getServicos(){
        val servico1 = Servicos(R.drawable.img1, "Corte de cabelo")
        listaServicos.add(servico1)
        val servico2 = Servicos(R.drawable.img2, "Corte de barba")
        listaServicos.add(servico2)
        val servico3 = Servicos(R.drawable.img3, "Lavagem de cabelo")
        listaServicos.add(servico3)
        val servico4 = Servicos(R.drawable.img4, "Tratamento de cabelo")
        listaServicos.add(servico4)
    }

}
