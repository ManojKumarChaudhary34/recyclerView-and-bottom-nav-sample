package com.example.assignment1

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class MyAdapter(private val arrayOfProduct: ArrayList<MyData>):
RecyclerView.Adapter<MyAdapter.MyViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView= LayoutInflater.from(parent.context).inflate(R.layout.each_row, parent, false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
       return arrayOfProduct.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentProduct= arrayOfProduct[position]
        holder.pText.text= currentProduct.productName
        holder.pImage.setImageResource(currentProduct.productImage)
    }

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val pImage= itemView.findViewById<ShapeableImageView>(R.id.image)
        val pText= itemView.findViewById<TextView>(R.id.text)
    }
}