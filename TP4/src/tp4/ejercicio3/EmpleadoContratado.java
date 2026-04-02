package tp4.ejercicio3;

public class EmpleadoContratado extends Empleado {
    private double valorHora;
    private int horasTrabajadas;

    public EmpleadoContratado(String nombre, int horasTrabajadas, double valorHora) {
        super(nombre,0);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSueldo() {
        return horasTrabajadas * valorHora;

    }
}
