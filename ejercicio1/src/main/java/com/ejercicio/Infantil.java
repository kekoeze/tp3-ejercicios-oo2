package com.ejercicio;

public class Infantil extends Libro {
    public Infantil(String nombre) {
        super(nombre);
    }

    public Object[] obtenerCosto(int dias) {
        Object[] resultado = new Object[2];
        int puntosAlquilerFrecuente = 0;
        double monto = 0;
        monto += 1.5;

        if (dias > 3) {
            monto += (dias - 3) * 1.5;
        }
        resultado[0] = monto;
        resultado[1] = puntosAlquilerFrecuente++;
        return resultado;
    }
}
