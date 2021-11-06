package com.example.phones_products_week4hw

import DataSource
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.phones_products_week4hw.adapter.PhonesProductsAdapter
import com.example.phones_products_week4hw.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
      // ccnnect with xml

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // intialize data
        val myData =DataSource.products
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = PhonesProductsAdapter (this,myData)


        recyclerView.setHasFixedSize(true)

    }
}