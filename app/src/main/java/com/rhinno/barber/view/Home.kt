package com.rhinno.barber.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rhinno.barber.R
import com.rhinno.barber.databinding.ActivityHomeBinding

class Home : AppCompatActivity() {

    private val binding by lazy {
        ActivityHomeBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)



        val nome = intent.extras?.getString("nome")

        binding.textNomeUsuario.text = "Bem-vindo(a), $nome"
    }
}