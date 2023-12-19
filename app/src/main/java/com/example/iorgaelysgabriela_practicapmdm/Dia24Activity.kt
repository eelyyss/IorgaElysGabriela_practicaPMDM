package com.example.iorgaelysgabriela_practicapmdm

    import android.os.Bundle
    import android.view.LayoutInflater
    import android.view.View
    import android.view.ViewGroup
    import android.widget.ImageView
    import android.widget.TextView
    import androidx.appcompat.app.AppCompatActivity
    import androidx.recyclerview.widget.LinearLayoutManager
    import androidx.recyclerview.widget.RecyclerView

    class Dia24Activity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.pantalla_dia24)

            val recyclerView: RecyclerView = findViewById(R.id.recyclerViewDia24)
            val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
            recyclerView.layoutManager = layoutManager

            val listaDatosDia24 = listOf(
                R.drawable.navidadpraga to "Praga, República Checa",
                R.drawable.navidadreykjavik to "Reykjavik, Islandia",
                R.drawable.navidadqueenstown to "Queenstown, Nueva Zelanda",
                R.drawable.navidadestrasburgo  to "Estrasburgo, Francia",
            )

            val adapter = Dia24Adapter(listaDatosDia24)
            recyclerView.adapter = adapter
        }

        class Dia24Adapter(private val datos: List<Pair<Int, String>>) :
            RecyclerView.Adapter<Dia24Adapter.Dia24ViewHolder>() {

            inner class Dia24ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
                val imagenDia: ImageView = itemView.findViewById(R.id.imagenDia)
                val textoDia: TextView = itemView.findViewById(R.id.textoDia)
            }

            override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Dia24ViewHolder {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.itemdia24, parent, false)
                return Dia24ViewHolder(view)
            }

            override fun onBindViewHolder(holder: Dia24ViewHolder, position: Int) {
                val (imagenResId, texto) = datos[position]

                holder.imagenDia.setImageResource(imagenResId)
                holder.textoDia.text = texto
            }

            override fun getItemCount(): Int {
                return datos.size
            }
        }
    }

