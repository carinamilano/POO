package tp5.biblioteca;

import java.util.Comparator;

public class CompararPorAnio implements Comparator<Libro> {

    @Override
    public int compare(Libro l1, Libro l2) {
        return l1.getAnio() - l2.getAnio();
    }
}