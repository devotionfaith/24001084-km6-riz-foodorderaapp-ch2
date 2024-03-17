package com.example.foodapp.presentation.menuList.adapter

import com.example.foodapp.data.model.Menu
import com.example.foodapp.databinding.ItemMenuGridBinding
import com.example.foodapp.utils.ViewHolderBinder
import com.example.foodapp.utils.toIndonesianFormat

class MenuGridAdapter(): ViewHolderBinder<Menu> {
        private lateinit var binding: ItemMenuGridBinding
    override fun bind(item: Menu) {
        item.let{
            binding.ivMenuImage.setImageResource(it.image)
            binding.tvMenuName.text = it.name
            binding.tvMenuPrice.text = it.price.toIndonesianFormat()
        }
    }
}