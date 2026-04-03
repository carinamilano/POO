package tp4.ejercicio8;

public class Main {
    public static void main(String[] args) {

    Descuento cli1 = new ClienteVip(500);
    Descuento cli2 = new ClienteComun(500);

    System.out.println(cli1.calcularDescuento());
    System.out.println(cli2.calcularDescuento());
    }
}
