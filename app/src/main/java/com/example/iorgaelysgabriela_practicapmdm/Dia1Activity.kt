package com.example.iorgaelysgabriela_practicapmdm

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Dia1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pantalla_dia1)

        val btnYoutube: Button = findViewById(R.id.btnYoutube)
        btnYoutube.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=E8gmARGvPlI"))
            startActivity(intent)
        }
    }
}
