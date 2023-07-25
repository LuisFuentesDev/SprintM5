package com.example.sprintm5

import android.content.SharedPreferences
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.sprintm5.databinding.ItemCarritoBinding
import com.google.gson.Gson

class AdapterCarro(val eliminar: Eliminar) : RecyclerView.Adapter<AdapterCarro.ViewHolder>() {
    var ListZapatillas = mutableListOf<zapato>()

    private lateinit var mSharedPreferences: SharedPreferences
    private lateinit var gson: Gson
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterCarro.ViewHolder {

        var binding = ItemCarritoBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {


        val item = ListZapatillas[position]
        holder.bind(item)
    }


    override fun getItemCount(): Int {
        return ListZapatillas.size
    }

    fun setData(listazapatoes: List<zapato>) {
        ListZapatillas = listazapatoes.toMutableList()
    }

    inner class ViewHolder(val binding: ItemCarritoBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: zapato) {

            binding.txtNombreItem.text = item.nombre
            binding.txtPrecioItem.text = item.precio.toString()
            binding.imgzapatoItem.load(item.url)

            binding.btnBorrarSeleccionado.setOnClickListener {
                ListZapatillas.remove(item)

                notifyDataSetChanged()

                eliminar.eliminar(item)


            }


        }


    }


}