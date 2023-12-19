package com.example.iorgaelysgabriela_practicapmdm

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Dia14Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pantalla_dia14)

        val mensajeBienvenida = "¡Feliz Navidad, ${SegundaPantalla.nombreUsuario}!"

        val textViewMensajeBienvenida: TextView = findViewById(R.id.textViewMensajeBienvenida)

        textViewMensajeBienvenida.text = mensajeBienvenida
    }
}
