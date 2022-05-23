package com.mariovaladez.kotlinintermedio.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mariovaladez.kotlinintermedio.R
import com.mariovaladez.kotlinintermedio.SuperHero

class superHeroAdapter(private val superheroeList:List<SuperHero>) : RecyclerView.Adapter<SuperHeroeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroeViewHolder {

        val layoutInflater = LayoutInflater.from(parent.context)
        return SuperHeroeViewHolder(layoutInflater.inflate(R.layout.item_superheroe,parent,false))

    }

    override fun onBindViewHolder(holder: SuperHeroeViewHolder, position: Int) {

        val item = superheroeList[position]
        holder.render(item)

    }

    override fun getItemCount(): Int = superheroeList.size
    }
