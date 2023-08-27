package com.alura.screenmatch.calculos;

import com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public int getTiempoTotal() {
        return this.tiempoTotal;
    }

//    public void incluido(Filme f) {
//        this.tiempoTotal += f.getDuracionEnMinutos();
//    }
//
//    public void incluido(Serie s) {
//        this.tiempoTotal += s.getDuracionEnMinutos();
//    }

    public void incluido(Titulo titulo) {
        System.out.println("Agregando duración en minutos de " + titulo);
        this.tiempoTotal += titulo.getDuracionEnMinutos();
    }
}
