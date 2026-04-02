package tp4.ejercicio3y4;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Juan Perez", 1250000);
        EmpleadoContratado emp2 = new EmpleadoContratado("Laura", 108, 4800);
        System.out.println("Sueldo emp1: " + emp1.calcularSueldo());
        System.out.println("Sueldo emp2: " + emp2.calcularSueldo());
        List<Pagable> lista  = new ArrayList<>();
        lista.add(emp1);
        lista.add(emp2);
        double total=0;
        for (Pagable p : lista) {
            total+=p.calcularPago();
        }
        System.out.println("total a pagar: "+total);
    }
}
//El override permite tener comportamientos distintos,
// y el polimorfismo se da cuando esos comportamientos se eligen en tiempo de ejecución
