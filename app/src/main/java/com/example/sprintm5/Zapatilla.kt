package com.example.sprintm5

data class Zapatilla(val id: String, val nombre: String, val modelo: String, val precio: Int, val imgUrl: String)

class Zapatillas {
    companion object {
        fun getZapatillas(): List<Zapatilla> {
            val zapatillas = mutableListOf<Zapatillas>()


        }

    }
}
