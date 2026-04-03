package tp4.ejercicio7;

public class Main {
    public static void main(String[] args) {
        // crear computadora
        Computadora pc = new Computadora("Dell", "XPS");

        // crear procesador
        Computadora.Procesador cpu = pc.new Procesador(3200, 8);

        pc.mostrarComputadora();
        cpu.mostrarProcesador();
    }
}
