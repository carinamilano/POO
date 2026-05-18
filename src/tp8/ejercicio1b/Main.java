package tp8.ejercicio1b;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numeros = {1, 2, 3};

        boolean valido = false;

        while (!valido) {
            System.out.print("Ingrese una posición (0 a 2): ");

            try {
                int posicion = scanner.nextInt();

                int valor = numeros[posicion];
                System.out.println("El valor es: " + valor);

                valido = true; //  sale del while

            } catch (InputMismatchException e) {
                System.out.println("Error: debe ingresar un número");
                scanner.nextLine();

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: posición fuera de rango");
            }
        }

        System.out.println("Programa finalizado");
    }
}