package com.example.foodapp.model

import java.util.UUID

data class Category (
    var id: String = UUID.randomUUID().toString(),
    var image: Int,
    var name: String
    )