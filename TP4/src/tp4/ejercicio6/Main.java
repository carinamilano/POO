package tp4.ejercicio6;
//Dado un arreglo de String con números:
// String[] datos = {"10", "20", "30"};
// Convertirlos a int
// Calcular el promedio
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main (String[] args) {
        int total = 0;
        String[] datos = {"10", "20", "30"};
        List<Integer> lista = new ArrayList<>();
        for (String elem : datos) {
            int x = Integer.parseInt(elem);
            lista.add(x);
            total += x;
        }
        System.out.println("el promedio es: " + ((double) total / lista.size()));
    }
}
