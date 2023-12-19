package com.example.iorgaelysgabriela_practicapmdm

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Dia4Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pantalla_dia4)

        val btnRegalos: Button = findViewById(R.id.btnRegalos)
        btnRegalos.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.glamour.es/placeres/galerias/mejores-regalos-tecnologicos/19887"))
            startActivity(intent)
        }
    }
}
