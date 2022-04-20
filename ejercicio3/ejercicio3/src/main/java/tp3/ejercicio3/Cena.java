package tp3.ejercicio3;

public class Cena extends Gasto {

    public Cena(String nombre, int monto) {
        super(nombre, monto);
    }

    public String marcaExcesoComidas() {
        if (this.monto() > 5000)
            return "X";
        return "";
    }

    @Override
    public int obtenerTotalComidas(int gastosDeComida) {
        return gastosDeComida += this.monto;

    }
}
