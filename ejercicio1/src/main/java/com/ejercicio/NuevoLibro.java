package com.ejercicio;

public class NuevoLibro extends Libro {

    public NuevoLibro(String nombre) {
        super(nombre);
    }

    public Object[] obtenerCosto(int dias) {
        Object[] resultado = new Object[2];
        double monto = 0;
        int puntosAlquiler = 0;
        monto += dias * 3;
        resultado[0] = monto;
        resultado[1] = puntosAlquiler++;
        if (dias > 1) {

            resultado[1] = puntosAlquiler++;
        }
        return resultado;
    }
}
