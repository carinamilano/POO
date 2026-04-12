package tp5.biblioteca;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Biblioteca {
    private List<Libro> libros = new ArrayList<>();

    public void agregarLibro(Libro libro) {
        if (!libros.contains(libro)) {
            libros.add(libro);
            System.out.println("Libro agregado");
        } else {
            System.out.println("El libro ya existe");
        }
    }
    public void eliminarLibro(Libro libro) {
        if (libros.remove(libro)) {
            System.out.println("Libro eliminado");
        } else {
            System.out.println("Libro no encontrado");
        }
    }
    public void buscarLibro(String titulo) {
        boolean encontrado = false;
        Iterator<Libro> it = libros.iterator();
        while (it.hasNext()) {
            Libro l = it.next();
            if (l.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Encontrado: " + l);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró el libro");
        }
    }
    /* MISMO METODO PERO CON FOR-EACH

public void buscarLibro(String titulo) {
    boolean encontrado = false;
    for (Libro l : libros) {
        if (l.getTitulo().equalsIgnoreCase(titulo)) {
            System.out.println("Encontrado: " + l);
            encontrado = true;
        }
    }
    if (!encontrado) {
        System.out.println("No se encontró el libro");
    }
}

     */
    public void mostrarLibros() {
        for (Libro l : libros) {
            System.out.println(l);
        }
    }

    public List<Libro> getLibros() {
        return libros;
    }

}
