package com.example.sprintm5

import android.content.SharedPreferences

class Model {
    private lateinit var ListZapatillas:MutableList<ListZapatillas>
    private lateinit var mSharedPreferences: SharedPreferences
    fun guardarData (ListZapatillas: ListZapatillas):MutableList<ListZapatillas>{
        ListZapatillas.add(ListZapatillas)
        return ListZapatillas
    }
    fun eliminarData(ListZapatillas: ListZapatillas):MutableList<ListZapatillas>{
        ListZapatillas.remove(ListZapatillas)
        return ListZapatillas
    }

}