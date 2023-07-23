package com.example.sprintm5

data class Zapatilla(val id: String, val modelo: String, val tipo: String, val precio: Int, val imgUrl: String)

class Zapatillas {
    companion object {
        fun getZapatillas(): List<Zapatilla> {
            val zapatillas = mutableListOf<Zapatilla>()

            zapatillas.add(Zapatilla("#001","DURAMO SL 2.0","Running",50990, "https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/cde9362a09ba4dd38c9ead6600ac074e_9366/Zapatillas_Duramo_SL_2.0_Negro_GW8336_01_standard.jpg"))
            zapatillas.add(Zapatilla("#002","GAZELLE","Originals",79990, "https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/61f87dec481e4512823ea7fb0080ba1a_9366/Zapatillas_Gazelle_Negro_BB5476_01_standard.jpg"))
            zapatillas.add(Zapatilla("#003","FORUM LOW","Originals",99990, "https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/09c5ea6df1bd4be6baaaac5e003e7047_9366/Zapatillas_Forum_Low_Blanco_FY7756_01_standard.jpg"))
            zapatillas.add(Zapatilla("#004","ZNSORED HI","TERREX",80990, "https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/a6dbfa72f4c54b10b353aec400e3f688_9366/Zapatillas_Znsored_Hi_Negro_GZ2292_01_standard.jpg"))
            zapatillas.add(Zapatilla("#005","AX2S","TERREX",69990, "https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/eb33816f470142c6870bad57013617e9_9366/Zapatillas_de_Senderismo_adidas_AX2S_Verde_GY8311_01_standard.jpg"))
            zapatillas.add(Zapatilla("#006","EQ21 RUN","Running",59990, "https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/8b089f58da5546b8bb39aedf00f4b50f_9366/Zapatillas_EQ21_Run_Blanco_GY2208_01_standard.jpg"))
            zapatillas.add(Zapatilla("#007","DAME EXTPLY 2.0","Basketball",79990, "https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/3092efa207c9409e8c37ae9600f75f7e_9366/Zapatillas_Dame_Extply_2.0_Negro_GY2439_01_standard.jpg"))
            zapatillas.add(Zapatilla("#008","D ROSE SON OF CHI II","Basketball",109990, "https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/05f03523d66542e0b954af15010bedfe_9366/Zapatillas_D_Rose_Son_of_Chi_II_Gris_HQ1006_01_standard.jpg"))
            zapatillas.add(Zapatilla("#009","THE VELOSAMBA MADE WITH NATURE","Ciclismo",149990, "https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/eff4bd2bf50b409b963bafd300f98d28_9366/Zapatillas_de_Ciclismo_The_Velosamba_Made_With_Nature_Negro_HQ9036_01_standard.jpg"))
            zapatillas.add(Zapatilla("#010","GALAXY STAR","Running",69990, "https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/169e671d6b3d46509cc114eb96e53f80_9366/Zapatillas_Galaxy_Star_Gris_IG0761_01_standard.jpg"))

            return zapatillas
        }

    }
}
