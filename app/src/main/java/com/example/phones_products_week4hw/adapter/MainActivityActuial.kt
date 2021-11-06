package com.example.phones_products_week4hw.adapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.phones_products_week4hw.R
import com.example.phones_products_week4hw.databinding.ActivityMainActuialBinding
import com.example.phones_products_week4hw.databinding.PurchaseStatementBinding

class MainActivityActuial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
         lateinit var xmlLink: ActivityMainActuialBinding

        xmlLink = ActivityMainActuialBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(xmlLink.root)

                val intentImage = intent.extras?.getInt("phoneImage")
        val intentName = intent.extras?.getString("productName")
        val intentPrice = intent.extras?.getString("price")

        println(intentName)
        xmlLink.phoneImage.setImageResource(intentImage!!)
        xmlLink.productName.text = intentName
        xmlLink.price.text = intentPrice
    }
}