package tp4.ejercicio7;

public class Computadora {
    private String marca;
    private String modelo;

    public Computadora(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    public void mostrarComputadora() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }

    public class Procesador {
        private int velocidad;
        private int cantNucleos;

        public Procesador(int velocidad, int cantNucleos) {
            this.velocidad = velocidad;
            this.cantNucleos = cantNucleos;
        }
        public void mostrarProcesador() {
            System.out.println("Velocidad: " + velocidad);
            System.out.println("Núcleos: " + cantNucleos);
        }
    }
}
