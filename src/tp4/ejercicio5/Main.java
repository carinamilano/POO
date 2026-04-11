package tp4.ejercicio5;

public class Main {
    public static void main(String[] args) {
        Cliente c1=new Cliente ("carina","carinamilano@gmail.com");
        Cliente c2 = new Cliente("Ana", null);

        c1.mostrarEmail();
        c2.mostrarEmail();

        System.out.println("Email de c1: " + c1.obtenerEmail());
        System.out.println("Email de c2: " + c2.obtenerEmail());

    }
}
