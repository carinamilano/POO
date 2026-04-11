package tp4.ejercicio3y4;

public class EmpleadoContratado extends Empleado implements Pagable {
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
    @Override
    public double calcularPago() {
        return calcularSueldo();
    }
}
