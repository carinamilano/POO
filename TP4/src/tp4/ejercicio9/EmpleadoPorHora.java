package tp4.ejercicio9;

public class EmpleadoPorHora extends Empleado{
    private double horasTrabajadas;
    private double valorHora;

    public EmpleadoPorHora(String nombre,double horasTrabajadas, double valorHora) {
        super(nombre,0);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;

    }
    @Override
    public double calcularSueldo(){
        return horasTrabajadas*valorHora;
    }
}
