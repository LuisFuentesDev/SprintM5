package com.example.sprintm5

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sprintm5.Adapter.ViewHolder
import com.example.sprintm5.databinding.ItemLayoutBinding

class Adapter : RecyclerView.Adapter<ViewHolder>() {

    var zapatilla = mutableListOf<Zapatilla>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = zapatilla[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return zapatilla.size
    }
    fun setData(zapatillas: List<Zapatilla>) {
        this.zapatilla = zapatilla.toMutableList()
    }

    class ViewHolder(val binding: ItemLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(zapatilla: Zapatilla) {
            binding.tvNombreZapatilla.text = zapatilla.modelo
            binding.tvModeloZapatilla.text = zapatilla.tipo
            binding.tvPrecioZapatilla.text = zapatilla.precio.toString()

        }

    }
}