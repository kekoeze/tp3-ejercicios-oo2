package tp3.ejercicio3;

abstract public class Gasto {
    protected int monto;
    protected String nombre;

    public Gasto(String nombre, int monto) {
        this.monto = monto;
        this.nombre = nombre;
    }

    public int monto() {
        return this.monto;
    }

    public String nombre() {
        return this.nombre;
    }

    public abstract String marcaExcesoComidas();

    public abstract int obtenerTotalComidas(int montoComida);
}
