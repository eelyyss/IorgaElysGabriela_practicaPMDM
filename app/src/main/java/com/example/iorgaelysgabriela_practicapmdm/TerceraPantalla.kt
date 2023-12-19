package com.example.iorgaelysgabriela_practicapmdm

import android.os.Bundle
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class Lista(private val dias: List<Dias>, private val onItemClick: (Dias) -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is DiaViewHolder) {
            val diaItem = dias[position]

            holder.button.text = diaItem.nombre
            holder.button.setOnClickListener { onItemClick(diaItem) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.dias, parent, false)
        return DiaViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dias.size
    }

    inner class DiaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val button: Button = itemView.findViewById(R.id.btnDia)
    }
}
class TerceraPantalla : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pantalla3)
        supportActionBar?.title = null

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager

        val dias = obtenerListaDeDias()

        val adapter = Lista(dias) { diaItem ->
            when (diaItem.nombre) {
                "Día 1" -> {
                    val intent = Intent(this, Dia1Activity::class.java)
                    startActivity(intent)
                }
                "Día 4" -> {
                    val intent = Intent(this, Dia4Activity::class.java)
                    startActivity(intent)
                }
                "Día 24" -> {
                    val intent = Intent(this, Dia24Activity::class.java)
                    startActivity(intent)
                }
                "Día 14" -> {
                    val intent = Intent(this, Dia14Activity::class.java)
                    startActivity(intent)
                }
                else -> {

                    Toast.makeText(this, "Día ${diaItem.nombre} clickeado", Toast.LENGTH_SHORT).show()
                }
            }
        }

        recyclerView.adapter = adapter
    }
    private fun obtenerListaDeDias(): List<Dias> {
        return mutableListOf(
            Dias("Día 1"),
            Dias("Día 2"),
            Dias("Día 3"),
            Dias("Día 4"),
            Dias("Día 5"),
            Dias("Día 6"),
            Dias("Día 7"),
            Dias("Día 8"),
            Dias("Día 9"),
            Dias("Día 10"),
            Dias("Día 11"),
            Dias("Día 12"),
            Dias("Día 13"),
            Dias("Día 14"),
            Dias("Día 15"),
            Dias("Día 16"),
            Dias("Día 17"),
            Dias("Día 18"),
            Dias("Día 19"),
            Dias("Día 20"),
            Dias("Día 21"),
            Dias("Día 22"),
            Dias("Día 23"),
            Dias("Día 24"),
        )
    }
}

