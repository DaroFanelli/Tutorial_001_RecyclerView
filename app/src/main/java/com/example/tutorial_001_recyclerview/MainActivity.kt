package com.example.tutorial_001_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

data class Pais(val nombre:String, val bandera:Int)

class MainActivity : AppCompatActivity() {

    val paises = listOf(
        Pais("España", R.drawable.spa),
        Pais("Reino Unido", R.drawable.uk),
        Pais("Portugal", R.drawable.por),
        Pais("Italia", R.drawable.ita),
        Pais("Rusia", R.drawable.russ),
        Pais("Marruecos", R.drawable.ma),
        Pais("Alemania", R.drawable.ger),
        Pais("Francia", R.drawable.fra),
        Pais("España", R.drawable.spa),
        Pais("Reino Unido", R.drawable.uk),
        Pais("Portugal", R.drawable.por),
        Pais("Italia", R.drawable.ita),
        Pais("Rusia", R.drawable.russ),
        Pais("Marruecos", R.drawable.ma),
        Pais("Alemania", R.drawable.ger),
        Pais("Francia", R.drawable.fra)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        val rv = findViewById<RecyclerView>(R.id.rv_paises)
        rv.adapter = AdaptadorPaises(paises)
        rv.layoutManager = LinearLayoutManager(this)
    }
}