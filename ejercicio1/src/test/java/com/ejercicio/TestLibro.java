package com.ejercicio;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class TestLibro {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void DeudasYPuntosTest() {
        Regular elTunel = new Regular("El Túnel");
        Regular antesDelFin = new Regular("Antes del Fin");
        CopiaLibro elTunelCopia = new CopiaLibro(elTunel);
        CopiaLibro antesDelFinCopia = new CopiaLibro(antesDelFin);
        Alquiler alquilerElTunel = new Alquiler(elTunelCopia, 5);
        Alquiler alquilerAntesDelFin = new Alquiler(antesDelFinCopia, 5);
        Cliente yo = new Cliente("Javier");
        yo.alquilar(alquilerElTunel);
        yo.alquilar(alquilerAntesDelFin);
        Object[] resultado = yo.calcularDeudaYPuntosObtenidos();
        double deuda = (double) resultado[0];
        int puntos = (int) resultado[1];
        assertEquals(deuda, 9.0, 0.001);
        assertEquals(puntos, 1);
    }
}
