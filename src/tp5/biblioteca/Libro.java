package tp5.biblioteca;
import java.util.Objects;

public class Libro implements Comparable <Libro>{
    private String titulo;
    private String autor;
    private int anio;
    private String isbn;

    public Libro(String titulo, String autor, int anio, String isbn){
        this.titulo=titulo;
        this.autor=autor;
        this.anio=anio;
        this.isbn=isbn;
    }

    public int getAnio() {
        return anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }
    @Override
    public String toString() {
        return titulo + " - " + autor + " (" + anio + ") ISBN: " + isbn;
    }
    @Override
    public int compareTo(Libro otro) {
        return this.isbn.compareTo(otro.isbn);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Libro otro = (Libro) obj;
        return isbn.equals(otro.isbn);
    }
    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }
}
