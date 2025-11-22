package tp_6_colecciones;

public class Libro {

    //atributos
    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor;

    //constructor
    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }

    //getters
    public String getIsbn() {
        return isbn;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }

    //muestra la informacion del libro
    public void mostrarInfo() {
        System.out.println("Título: " + titulo + ", ISBN: " + isbn + ", Año: " + anioPublicacion + ", Autor: " + autor.getNombre());
    }
}
