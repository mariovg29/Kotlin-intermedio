package com.mariovaladez.kotlinintermedio.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mariovaladez.kotlinintermedio.R
import com.mariovaladez.kotlinintermedio.SuperHero

class SuperHeroeViewHolder(view: View):RecyclerView.ViewHolder(view) {

    val superHero = view.findViewById<TextView>(R.id.tvSuperheroName)
    val realName = view.findViewById<TextView>(R.id.tvRealName)
    val publisher = view.findViewById<TextView>(R.id.tvPublisher)
    val image = view.findViewById<ImageView>(R.id.ivSpuerHeroeImage)




    fun render(superheroModel: SuperHero){

        superHero.text = superheroModel.superHeroName
        realName.text = superheroModel.realname
        publisher.text = superheroModel.publisher
        Glide.with(image.context).load(superheroModel.image).into(image)
    }
}