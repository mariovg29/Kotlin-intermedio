package com.mariovaladez.kotlinintermedio.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mariovaladez.kotlinintermedio.R
import com.mariovaladez.kotlinintermedio.SuperHero
import com.mariovaladez.kotlinintermedio.databinding.ItemSuperheroeBinding

class SuperHeroeViewHolder(view: View):RecyclerView.ViewHolder(view) {

    val binding = ItemSuperheroeBinding.bind(view)






    fun render(superheroModel: SuperHero){

        binding.tvSuperheroName.text = superheroModel.superHeroName
        binding.tvRealName.text = superheroModel.realname
        binding.tvPublisher.text = superheroModel.publisher
        Glide.with(binding.ivSpuerHeroeImage.context).load(superheroModel.image).into(binding.ivSpuerHeroeImage)
    }
}