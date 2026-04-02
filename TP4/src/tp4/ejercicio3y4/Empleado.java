package tp4.ejercicio3y4;

public class Empleado implements Pagable {
    protected String nombre;
    protected double sueldo;

    public Empleado(String nombre,double sueldo){
        this.nombre=nombre;
        this.sueldo=sueldo;
    }
    public double calcularSueldo() {
        return sueldo;
    }
    @Override
    public double calcularPago() {
        return calcularSueldo();
    }

}




