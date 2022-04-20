package com.ejercicio;

public class Regular extends Libro {

    public Regular(String nombre) {
        super(nombre);
    }

    public Object[] obtenerCosto(int dias) {
        Object[] resultado = new Object[2];
        int puntosAlquilerFrecuente = 0;
        double monto = 0;

        if (dias > 3) {
            monto += (dias - 2) * 1.5;
        }
        resultado[0] = monto;
        resultado[1] = puntosAlquilerFrecuente + 1;
        System.out.println(resultado[1]);
        return resultado;
    }
}
