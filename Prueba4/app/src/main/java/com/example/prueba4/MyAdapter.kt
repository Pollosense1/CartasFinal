package com.example.prueba4

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val userList : ArrayList<User>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.user_item,parent,false)
        return MyViewHolder(itemView)

    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentitem = userList[position]

        holder.Nombre.text = currentitem.Nombre
        holder.Tipo.text = currentitem.Tipo
        holder.Descripción.text = currentitem.Descripción
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val Nombre : TextView = itemView.findViewById(R.id.nomcart)
        val Tipo : TextView = itemView.findViewById(R.id.tipcart)
        val Descripción : TextView = itemView.findViewById(R.id.descart)

    }
}