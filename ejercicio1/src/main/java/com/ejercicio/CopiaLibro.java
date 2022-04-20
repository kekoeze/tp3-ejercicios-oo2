package com.ejercicio;

public class CopiaLibro {
  private Libro libro;

  public CopiaLibro(Libro libro) {
    this.libro = libro;
  }

  public Object[] libroCosto(int dias) {
    return this.libro.obtenerCosto(dias);
  }
}