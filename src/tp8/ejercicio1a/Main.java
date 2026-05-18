package tp8.ejercicio1a;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        String texto = scanner.nextLine();

        try {
            int numero = Integer.parseInt(texto);
            System.out.println("Número válido: " + numero);

        } catch (NumberFormatException e) {
            System.out.println("Error: el valor ingresado no es un número");
        }

        System.out.println("Programa finalizado");
    }
}