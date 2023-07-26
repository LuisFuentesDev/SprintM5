package com.example.sprintm5

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import coil.load

import com.example.sprintm5.databinding.ItemLayoutBinding

class Adapter : RecyclerView.Adapter<Adapter.ViewHolder>() {
    var ListZapatillas = mutableListOf<zapato>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.ViewHolder {
        var binding = ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: Adapter.ViewHolder, position: Int) {
        val item = ListZapatillas[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return ListZapatillas.size
    }

    fun setData(listazapatos: List<zapato>) {
        ListZapatillas = listazapatos.toMutableList()
    }

    inner class ViewHolder(val binding: ItemLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: zapato) {

            binding.textViewNombre.text = item.nombre
            binding.textViewPrecio.text = item.precio.toString()
            binding.imageViewZapatilla.load(item.url)
            val bundle = Bundle()
            bundle.putString("nombre", item.nombre)
            bundle.putString("precio", item.precio.toString())
            bundle.putString("url", item.url)
            binding.cardView.setOnClickListener {
                Navigation.findNavController(binding.root)
                    .navigate(R.id.action_nav_shopping_carr_to_detalle, bundle)
            }
        }
    }
}