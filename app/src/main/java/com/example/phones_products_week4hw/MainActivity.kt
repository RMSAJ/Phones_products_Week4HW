package com.example.phones_products_week4hw

import DataSource
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.phones_products_week4hw.adapter.PhonesProductsAdapter
import com.example.phones_products_week4hw.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
     private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        val myDataset = DataSource.products
        val adapter = PhonesProductsAdapter()
            this.binding.recyclerListView?.adapter = adapter
        this.binding.recyclerListView?.layoutManager = LinearLayoutManager(this)
      binding.recyclerListView?.setHasFixedSize(true)

        // Enable up button for backward navigation
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }
}