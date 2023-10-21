package com.rhinno.barber.view

import android.icu.util.Calendar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rhinno.barber.R
import com.rhinno.barber.databinding.ActivityAgendamentoBinding

class Agendamento : AppCompatActivity() {

    private lateinit var binding: ActivityAgendamentoBinding
    private val calendar: Calendar = Calendar.getInstance()

    private var data: String = ""
    private var hora: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAgendamentoBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val nome = intent.extras?.getString("nome").toString()


        val datePicker = binding.dataPicker

        datePicker.setOnDateChangedListener { _, year, monthOfYear, dayOfMonth ->
            calendar.set(Calendar.YEAR, year)
            calendar.set(Calendar.MONTH, monthOfYear)
            calendar.set(Calendar.DAY_OF_YEAR, dayOfMonth)


            var dia = dayOfMonth.toString()
            val mes: String

            if(dayOfMonth < 10){
                dia = "0$dayOfMonth"
            }
            if(monthOfYear < 10){
                mes = "" + (monthOfYear+1)
            } else {
                mes = (monthOfYear+1).toString()
            }

            data = "$dia / $mes / $year"

        }

        binding.timePicker.setOnTimeChangedListener { _, hourOfDay , minute ->

            val minuto: String

            if(minute < 10){
                minuto = "0$minute"
            } else {
                minuto = minute.toString()
            }


        }

    }
}