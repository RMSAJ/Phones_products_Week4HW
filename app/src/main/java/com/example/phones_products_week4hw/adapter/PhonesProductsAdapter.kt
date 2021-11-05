package com.example.phones_products_week4hw.adapter

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
    private val productSet: List<Product> = DataSource.products
): RecyclerView.Adapter<PhonesProductsAdapter.PhonesProductViewHolder>() {


    class PhonesProductViewHolder( itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.phoneImage)
        val textViewName: TextView = itemView.findViewById(R.id.productName)
        val textViewPrice: TextView = itemView.findViewById(R.id.price)
        val vipImage: ImageView = itemView.findViewById(R.id.vipMark)
        val buttonpressView: Button = itemView.findViewById(R.id.buyButton)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhonesProductViewHolder {
        val adpterLayout =LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item,parent, false)
        return PhonesProductViewHolder(adpterLayout)
    }
    override fun getItemCount(): Int {
        val size = productSet.size
        return size
    }


    override fun onBindViewHolder(holder: PhonesProductViewHolder, position: Int) {
        val item = productSet[position]
        holder.imageView.apply { item.imageResourceId }
        holder.textViewPrice.apply { item.productPrice  }
        holder.textViewName.apply { item.productName  }
        holder.buttonpressView.apply { isClickable  }
        holder.vipImage.apply { item.isVip }
    }



}