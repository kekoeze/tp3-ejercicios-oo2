package tp3.ejercicio3;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void reporteDeGastosTest() {
        List<Gasto> gastos = new ArrayList<Gasto>();
        ReporteDeGastos reporteDeGastos = new ReporteDeGastos(LocalDate.now());
        Desayuno desayuno = new Desayuno(6000, "torta fritas");
        Cena cena = new Cena("empanadas", 1500);
        gastos.add(desayuno);
        gastos.add(cena);
        String todosLosGastos = reporteDeGastos.calcularGastos(gastos);
        System.out.println(todosLosGastos);
        assertEquals(todosLosGastos, "Gastos de comida: 7500 || Total de gastos: 7500");
    }
}
