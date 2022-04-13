package tp3.ejercicio3;

import java.time.LocalDate;
import java.util.List;

/*interface MontoDelGasto {
  public int obtenerMonto();

  public String marcaExcesoComidas();

  public String obtenerNombreDelGasto();

  public int obtenerGastosDeComida();

}*/

// class Gasto {

//   protected int monto;
//   protected String nombre;

//   public Gasto(String nombre, int monto) {
//     this.monto = monto;
//     this.nombre = nombre;
//   }

//   public int obtenerMonto() {
//     return this.monto;
//   }

//   public String obtenerNombreDelGasto() {
//     return this.nombre;
//   }

// }

// class Comida extends Gasto {

//   public Comida(String nombre, int monto) {
//     super(nombre, monto);
//   }

//   public int obtenerGastosDeComida() {
//     return this.monto;
//   }

//   // abstract public String marcaExcesoComidas();

// }

// class Cena extends Comida {
//   public Cena(String nombre, int monto) {
//     super(nombre, monto);
//   }

//   public String marcaExcesoComidas() {
//     if (this.obtenerMonto() > 5000)
//       return "X";
//     return "";
//   }

// }

// class Desayuno extends Comida {
//   public Desayuno(String nombre, int monto) {
//     super(nombre, monto);
//   }

//   public String marcaExcesoComidas() {
//     if (this.obtenerMonto() > 1000)
//       return "X";
//     return "";
//   }

// }

public class ReporteDeGastos {
  private LocalDate fecha;

  public ReporteDeGastos(LocalDate fecha) {
    this.fecha = fecha;
  }

  public String calcularGastos(List<Gasto> gastos) {
    int gastosDeComida = 0;
    int total = 0;
    for (Gasto gasto : gastos) {
      gastosDeComida = gasto.obtenerTotalComidas(gastosDeComida);
      String marcaExceso = gasto.marcaExcesoComidas();
      System.out.println(gasto.nombre + "\t" + gasto.monto + "\t" + marcaExceso);
      total += gasto.monto();
    }
    return ("Gastos de comida: " + gastosDeComida + " || " + "Total de gastos: " + total);

  }

  /*
   * public void imprimir(List<MontoDelGasto> gastos) {
   * int total = 0;
   * int gastosDeComida = 0;
   * 
   * System.out.println("Expenses " + LocalDate.now());
   * 
   * for (MontoDelGasto gasto : gastos) {
   * 
   * String nombreGasto = "";
   * switch (gasto.tipoGasto) {
   * case CENA:
   * nombreGasto = "Cena";
   * break;
   * case DESAYUNO:
   * nombreGasto = "Desayuno";
   * break;
   * case ALQUILER_AUTO:
   * nombreGasto = "Alquiler de Autos";
   * break;
   * }
   * 
   * String marcaExcesoComidas = gasto.tipoGasto == TipoDeGasto.CENA &&
   * gasto.monto > 5000
   * || gasto.tipoGasto == TipoDeGasto.DESAYUNO && gasto.monto > 1000 ? "X" : " ";
   * 
   * System.out.println(nombreGasto + "\t" + gasto.monto + "\t" +
   * marcaExcesoComidas);
   * 
   * total += gasto.monto;
   * }
   * 
   * System.out.println("Gastos de comida: " + gastosDeComida);
   * System.out.println("Total de gastos: " + total);
   * }
   */
}
