package com.example.sprintm5


class Presenter(private val view: IviewPresenter, private val view2: Eliminar) {
    private  var modelo:Model = Model()

    fun guardarData(
        nombre:String,
        img:String,
        precio:Int
    ){


        val ListZapatillas = ListZapatillas(nombre,img,precio)
        val zapatos =modelo.guardarData(ListZapatillas)

        view.guardarData(zapatos)
    }

    fun eliminarData(ListZapatillas: ListZapatillas){
        val zapatos = modelo.eliminarData(ListZapatillas)
        view2.eliminar(ListZapatillas)

    }



}