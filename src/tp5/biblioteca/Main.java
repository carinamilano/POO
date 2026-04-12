package tp5.biblioteca;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Biblioteca b = new Biblioteca();
        Scanner sc = new Scanner(System.in);

        Libro l1 = new Libro("Java", "Ana", 2020, "1");
        Libro l2 = new Libro("Python", "Juan", 2018, "2");
        Libro l3 = new Libro("Algoritmos", "Pedro", 2022, "3");

        b.agregarLibro(l1);
        b.agregarLibro(l2);
        b.agregarLibro(l3);

        System.out.println("LIBROS:");
        b.mostrarLibros();

        System.out.println("\nOrdenados por título:");
        Collections.sort(b.getLibros(), new CompararPorTitulo());
        b.mostrarLibros();

        System.out.println("\nOrdenados por año:");
        Collections.sort(b.getLibros(), new CompararPorAnio());
        b.mostrarLibros();

        int opcion;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Agregar libro");
            System.out.println("2. Mostrar libros");
            System.out.println("3. Buscar libro");
            System.out.println("4. Eliminar libro");
            System.out.println("5. Salir\n");

            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese título:");
                    String titulo = sc.nextLine();

                    System.out.println("Ingrese autor:");
                    String autor = sc.nextLine();

                    System.out.println("Ingrese año:");
                    int anio = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese ISBN:");
                    String isbn = sc.nextLine();

                    Libro nuevo = new Libro(titulo, autor, anio, isbn);
                    b.agregarLibro(nuevo);
                    break;

                case 2:
                    b.mostrarLibros();
                    break;

                case 3:
                    System.out.println("Ingrese título a buscar:");
                    String buscado = sc.nextLine();
                    b.buscarLibro(buscado);
                    break;

                case 4:
                    System.out.println("Ingrese ISBN del libro a eliminar:");
                    String isbnEliminar = sc.nextLine();

                    for (Libro l : b.getLibros()) {
                        if (l.getIsbn().equals(isbnEliminar)) {
                            b.eliminarLibro(l);
                            break;
                        }
                    }
                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 5);
    }
}
