package tp8.ejercicio1c;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean valido = false;

        while (!valido) {
            try {
                System.out.print("Ingrese el primer número: ");
                int num1 = scanner.nextInt();

                System.out.print("Ingrese el segundo número: ");
                int num2 = scanner.nextInt();

                System.out.print("Ingrese operación (+, -, *, /): x para salir: ");
                String op = scanner.next();

                int resultado=0;

                switch (op) {
                    case "+":
                        resultado = num1 + num2;
                        break;
                    case "-":
                        resultado = num1 - num2;
                        break;
                    case "*":
                        resultado = num1 * num2;
                        break;
                    case "/":
                        resultado = num1 / num2;
                        break;
                    case "x":
                        break;
                    default:
                        System.out.println("Error: operación inválida");
                        continue; // vuelve a pedir todo
                }

                System.out.println("Resultado: " + resultado);
                valido = true;

            } catch (InputMismatchException e) {
                System.out.println("Error: debe ingresar números válidos");
                scanner.nextLine(); //  limpia buffer

            } catch (ArithmeticException e) {
                System.out.println("Error: división por cero");

            } finally {
                System.out.println("Operación finalizada");
            }
        }
    }
}