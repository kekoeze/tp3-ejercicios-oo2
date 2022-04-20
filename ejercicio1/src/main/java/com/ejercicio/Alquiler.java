package com.ejercicio;

public class Alquiler {
  private CopiaLibro copia;
  private int diasAlquilados;

  public Alquiler(CopiaLibro copia, int diasAlquilados) {
    this.copia = copia;
    this.diasAlquilados = diasAlquilados;
  }

  public int diasAlquilados() {
    return this.diasAlquilados;
  }

  public Object[] obtenerCostoDelLibro() {
    return this.copia.libroCosto(this.diasAlquilados);
  }
}
