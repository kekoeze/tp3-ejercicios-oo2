package com.ejercicio;

public class Cliente {
  private String name;
  private Alquileres alquileres = new Alquileres();

  public Cliente(String nombre) {
    this.name = nombre;
  }

  public Object[] calcularDeudaYPuntosObtenidos() {

    return this.alquileres.calcularCostosLibros();
  }

  public void alquilar(Alquiler rental) {
    this.alquileres.alquilar(rental);

  }

}