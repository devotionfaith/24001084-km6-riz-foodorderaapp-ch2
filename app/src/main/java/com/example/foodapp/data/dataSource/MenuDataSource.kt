package com.example.foodapp.data.dataSource

import com.example.foodapp.R.*
import com.example.foodapp.data.model.Menu

interface MenuDataSource {
    fun getDataMenu(): List<Menu>
}

class MenuDataSourceImpl(): MenuDataSource{
    override fun getDataMenu(): List<Menu> {
        return mutableListOf(
            Menu(image = drawable.ic_menu_1, price = 50000.0, name = "Ayam Goreng"),
            Menu(image = drawable.ic_menu_2, price = 40000.0, name = "Ayam Geprek"),
            Menu(image = drawable.ic_menu_3, price = 40000.0, name = "Ayam Bakar"),
            Menu(image = drawable.ic_menu_4, price = 15000.0, name = "Sate Ayam"),
            Menu(image = drawable.ic_menu_5, price = 20000.0, name = "Nasi Kuning"),
            Menu(image = drawable.ic_menu_6, price = 18000.0, name = "Nasi Goreng"),
            Menu(image = drawable.ic_menu_7, price = 22000.0, name = "Nila Goreng"),
            Menu(image = drawable.ic_menu_8, price = 18000.0, name = "Nasi Bakar")
        )
    }
}