package com.example.sqlite_room.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sqlite_room.Usuario
import com.example.sqlite_room.databinding.CardLayoutBinding

class UserAdapter : RecyclerView.Adapter<UserAdapter.NomesViewHolder>(){

    private var listUser = emptyList<Usuario>()

    class NomesViewHolder (val binding: CardLayoutBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NomesViewHolder {
        return NomesViewHolder(CardLayoutBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        ))
    }

    override fun onBindViewHolder(holder: NomesViewHolder, position: Int) {
        val nome = listUser[position]

        holder.binding.textNome.text = nome.nome
        holder.binding.textSobrenome.text = nome.sobrenome
        holder.binding.textIdade.text = nome.idade.toString()

    }

    override fun getItemCount(): Int {
        return listUser.size
    }

    fun setList(list: List<Usuario>){
        listUser = list
        notifyDataSetChanged()
    }

}