package com.example.sprintm5

import android.content.SharedPreferences

class Model {
    private lateinit var zapatos:MutableList<zapato>
    private lateinit var mSharedPreferences: SharedPreferences
    fun guardarData (zapato: zapato):MutableList<zapato>{
        zapatos.add(zapato)
        return zapatos
    }
    fun eliminarData(zapato: zapato):MutableList<zapato>{
        zapatos.remove(zapato)
        return zapatos
    }

}