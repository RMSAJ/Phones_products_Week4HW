package com.example.phones_products_week4hw

import android.content.ClipData
import android.os.Bundle
import android.text.Layout
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.phones_products_week4hw.databinding.PurchaseStatementBinding
import android.content.Intent
class PurchaseActivity: AppCompatActivity() {

private lateinit var xmlLink: PurchaseStatementBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        xmlLink = PurchaseStatementBinding.inflate(layoutInflater)
        setContentView(xmlLink.root)
//        val intentImage = intent.extras?.getInt("phoneImage")
//        val intentName = intent.extras?.getString("productName")
//        val intentPrice = intent.extras?.getString("price")
//
//        println(intentName)
//       // xmlLink.phoneImage.setImageResource(intentImage)
//        xmlLink.productName.text = intentName
//        xmlLink.price.text = intentPrice
//      val itemView = findViewById<RecyclerView>(R.id.purchase_recycler_view)
//       val iphoneImage = xmlLink.phoneImage
//        val iphoneName = xmlLink.productName
//        val iphonePrice = xmlLink.price
//        xmlLink.phoneImage = DataSource.products


    }

}