package com.ejercicio;

import java.util.ArrayList;
import java.util.List;

public class Alquileres {
    private List<Alquiler> alquileres = new ArrayList<Alquiler>();

    public Alquileres() {

    }

    public Object[] calcularCostosLibros() {
        Object[] resultado = new Object[2];
        double total = 0;
        for (Alquiler alquiler : this.alquileres) {

            resultado = alquiler.obtenerCostoDelLibro();
            total += ((Number) resultado[0]).doubleValue();

        }
        resultado[0] = total;
        return resultado;
    }

    public void alquilar(Alquiler rental) {
        this.alquileres.add(rental);
    }
}
