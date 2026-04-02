package tp4.ejercicio3;

public class Main {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Juan Perez", 1250000);
        EmpleadoContratado emp2 = new EmpleadoContratado("Laura", 108, 4800);
        System.out.println("Sueldo emp1: " + emp1.calcularSueldo());
        System.out.println("Sueldo emp2: " + emp2.calcularSueldo());
    }
}
//El override permite tener comportamientos distintos,
// y el polimorfismo se da cuando esos comportamientos se eligen en tiempo de ejecución
