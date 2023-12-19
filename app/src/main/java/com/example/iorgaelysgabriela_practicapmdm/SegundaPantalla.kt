package com.example.iorgaelysgabriela_practicapmdm

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class SegundaPantalla : AppCompatActivity() {

    companion object {
        var nombreUsuario: String? = null
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pantalla2)
        supportActionBar?.title = null

        val btnSiguiente: Button = findViewById(R.id.btnSiguiente)
        btnSiguiente.setOnClickListener {
            nombreUsuario = obtenerNombreDelUsuario()

            val intent = Intent(this, TerceraPantalla::class.java)
            startActivity(intent)
        }
    }

    private fun obtenerNombreDelUsuario(): String {
        val editTextNombre: EditText = findViewById(R.id.editTextNombre)
        return editTextNombre.text.toString()
    }
}
