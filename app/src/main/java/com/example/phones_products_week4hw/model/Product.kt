package com.example.phones_products_week4hw.model

import androidx.annotation.DrawableRes

data class Product(
@DrawableRes val imageResourceId: Int,
val productName: String,
val productPrice: String,
val isVip: Boolean,
val quantityNumber: Int
)
