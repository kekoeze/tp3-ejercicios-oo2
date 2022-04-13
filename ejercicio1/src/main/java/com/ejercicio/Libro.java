package com.ejercicio;

public abstract class Libro {

  private String nombre;

  public Libro(String nombre) {
    this.nombre = nombre;

  }

  public String nombre() {
    return nombre;
  }

  public abstract Object[] obtenerCosto(int dias);
}