package tp4.ejercicio2;

public class Producto {
    private String nombre;
    private double precio;
    private int stock;

//- Un constructor con todos los atributos
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    //- Un constructor vacío
    public Producto() {
        this("sin nombre",0.0,0);
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public double getStock() {
        return stock;
    }
 // mostrar info
    public void mostrarInfo() {
        System.out.println("Producto: " + nombre +
                " | Precio: " + precio +
                " | Stock: " + stock);
    }

}
