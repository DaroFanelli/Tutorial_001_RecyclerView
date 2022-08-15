package com.example.tutorial_001_recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdaptadorPaises(val paises:List<Pais>)
    : RecyclerView.Adapter<AdaptadorPaises.ViewHolder>() {

    class ViewHolder(v: View):RecyclerView.ViewHolder(v){
        var nombre:TextView
        var bandera:ImageView
        init{
            nombre = v.findViewById(R.id.fila_nombre)
            bandera = v.findViewById(R.id.fila_bandera)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdaptadorPaises.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.fila_paises, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: AdaptadorPaises.ViewHolder, position: Int) {
        val p = paises[position]
        holder.nombre.text = p.nombre
        holder.bandera.setImageResource(p.bandera)
    }

    override fun getItemCount(): Int {
        return paises.size
    }
}