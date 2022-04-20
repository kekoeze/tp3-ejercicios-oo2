package tp3.ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Filtro {

    public static List<String[]> filtrar(InterfaceWhere<String[]> c, List<String[]> csvData) {
        List<String[]> results = new ArrayList<String[]>();
        for (int i = 0; i < csvData.size(); i++) {
            if (c.execute(csvData.get(i))) {
                results.add(csvData.get(i));
            }

        }
        return results;
    }
}
