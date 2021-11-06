package com.example.phones_products_week4hw.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.example.phones_products_week4hw.MainActivity
import com.example.phones_products_week4hw.PurchaseActivity
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
        holder.textViewName.text = item.productName
        holder.textViewPrice.text = item.productPrice

        holder.buttonpressView.setOnClickListener {

            if (item.quantityNumber > 0) {
                Toast.makeText(context, "the item ", Toast.LENGTH_LONG).show()
                val intent = Intent(context, MainActivityActuial::class.java )
                intent.putExtra("phoneImage", item.imageResourceId )
                intent.putExtra("productName", item.productName )
                intent.putExtra("price", item.productPrice )
               it?.context?.startActivity(intent)

            } else { Toast.makeText(context, "the item is not available", Toast.LENGTH_LONG).show() }

        }

//        holder.vipImage.isVisible = if (item.isVip ) { true } else {false}
//        holder.buttonpressView.setOnClickListener {
//            //it.isClickable
//            if (item.quantityNumber > 0) {
//                Toast.makeText(context, "the item ", Toast.LENGTH_LONG).show()
////                val intent = Intent(context, PurchaseActivity::class.java )
////                intent.putExtra("phoneImage", item.imageResourceId )
////                intent.putExtra("productName", item.productName )
////                intent.putExtra("price", item.productPrice )
////               it.context.startActivity(intent)
//
//            } else { Toast.makeText(context, "the item is not available", Toast.LENGTH_LONG).show() }
//
//        }
    }

}