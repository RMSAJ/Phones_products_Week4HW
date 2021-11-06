package com.example.phones_products_week4hw.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.phones_products_week4hw.R
import com.example.phones_products_week4hw.model.Product

class PhonesProductsAdapter(
    private val context: Context,
    private val productSet: List<Product>) : RecyclerView.Adapter<PhonesProductsAdapter.PhonesProductViewHolder>() {


    class PhonesProductViewHolder(private val itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.phoneImage)
        val textViewName: TextView = itemView.findViewById(R.id.productName)
        val textViewPrice: TextView = itemView.findViewById(R.id.price)
        val vipImage: ImageView = itemView.findViewById(R.id.vipMark)
        val buttonpressView: Button = itemView.findViewById(R.id.buyButton)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhonesProductViewHolder {
        val adpterLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return PhonesProductViewHolder(adpterLayout)
    }

    override fun getItemCount(): Int {
        return productSet.size

    }


    override fun onBindViewHolder(holder: PhonesProductViewHolder, position: Int) {
        val item = productSet[position]
        holder.imageView.setImageResource(item.imageResourceId)
        holder.textViewName.text = context.getSystemService(item.productName).toString()
        holder.textViewPrice.text = context.getSystemService(item.productPrice).toString()
        holder.vipImage.apply { if (item.isVip) setImageResource(R.drawable.ic_baseline_star_24) }
        holder.buttonpressView.setOnClickListener { it.isClickable }


    }

}