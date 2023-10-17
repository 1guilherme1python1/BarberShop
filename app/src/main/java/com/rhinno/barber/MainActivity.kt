package com.rhinno.barber

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.snackbar.Snackbar
import com.rhinno.barber.databinding.ActivityMainBinding
import com.rhinno.barber.view.Home

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.btnLogin.setOnClickListener{view ->

            val nome = binding.editNome.text.toString()
            val senha = binding.editSenha.text.toString()

            when{
                nome.isEmpty() -> {
                    mensagem(view, "Coloque o seu nome!")
                }
                senha.isEmpty()->{
                    mensagem(view, "Preencha a senha!")
                }
                senha.length <=5 -> {
                    mensagem(view, "A senha precisa ter no minimo 5 caracteres")
                }
                else -> {
                    navegarParaHome(nome)
                }
            }

        }
    }

    private fun mensagem(view: View, mensagem: String){
        val snackbar = Snackbar.make(view, mensagem, Snackbar.LENGTH_SHORT)
        snackbar.setBackgroundTint(Color.parseColor("#ff0000"))
        snackbar.setTextColor(Color.parseColor("#ffffff"))
        snackbar.show()
    }

    private fun navegarParaHome(nome: String){
        val intent = Intent(this, Home::class.java)
        intent.putExtra("nome", nome)
        startActivity(intent)
    }

}