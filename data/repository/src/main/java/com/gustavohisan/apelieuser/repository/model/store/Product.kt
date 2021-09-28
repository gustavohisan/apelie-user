package com.gustavohisan.apelieuser.repository.model.store

data class Product(
    val id: Int,
    val price: Float,
    val name: String,
    val description: String,
    val quantity: Int,
    val category: String,
    val images: List<String>
)
