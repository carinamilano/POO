package tp4.ejercicio2;

public class Main {
    public static void main(String[] args) {
        Producto p1=new Producto("manzana",1500.25,15);
        Producto p2=new Producto("pizza",2000.00,15);
        // Producto con constructor vacío
        Producto p3 = new Producto();
        p1.mostrarInfo();
        p2.mostrarInfo();
        p3.mostrarInfo();

    }
}
