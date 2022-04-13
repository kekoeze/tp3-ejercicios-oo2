package tp3.ejercicio3;

public class Desayuno extends Gasto {
    public Desayuno(int monto, String nombre) {
        super(nombre, monto);
    }

    public String marcaExcesoComidas() {
        if (this.monto() > 1000)
            return "X";
        return "";
    }

    public int obtenerTotalComidas(int gastosDeComida) {
        return gastosDeComida += this.monto;

    }
}
