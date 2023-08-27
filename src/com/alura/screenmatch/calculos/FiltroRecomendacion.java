package com.alura.screenmatch.calculos;

public class FiltroRecomendacion {
    private String recomendacion;

    public void filtra(Clasificable clasificable) {
        if (clasificable.getClasificacion() >= 4) {
            System.out.println("Está entre los favoritos del momento");
        } else if (clasificable.getClasificacion() >= 2) {
            System.out.println("Bien evaluado actualmente");
        } else {
            System.out.println("Colocalo en tu lista para verlo después");
        }
    }
}
