package tp4.ejercicio11;

public class Main {
    public static void main(String[] args) {
        Circulo f1=new Circulo(7,"rojo");
        Circulo f3=new Circulo (5);

        Rectangulo f2=new Rectangulo(3,4);

        System.out.println(f1.calcularArea());
        System.out.println(f2.calcularArea());
        System.out.println(f3.calcularArea());
    }
}

