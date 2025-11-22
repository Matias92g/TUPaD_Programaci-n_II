package tp_6_colecciones;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private String nombre;
    private List<Libro> libros;

    //constructor que inicia el arraylist
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        libros = new ArrayList<>();
    }

    //agregar libro a la biblioteca
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        libros.add(new Libro(isbn, titulo, anioPublicacion, autor));
    }

    //listar libros
    public void listarLibros() {
        for (Libro l : libros) {
            l.mostrarInfo();
        }
    }

    //buscar libro por ISBN
    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro l : libros) {
            if (l.getIsbn().equals(isbn)) {
                return l;
            }
        }
        return null;
    }

    //eliminar libro por ISBN
    public void eliminarLibro(String isbn) {
        libros.removeIf(l -> l.getIsbn().equals(isbn));
    }

    //cantidad de libros de la biblioteca
    public int obtenerCantidadLibros() {
        return libros.size();
    }

    //filtra y muestra libros de determinado año
    public void filtrarLibrosPorAnio(int anio) {
        for (Libro l : libros) {
            if (l.getAnioPublicacion() == anio) {
                l.mostrarInfo();
            }
        }
    }

    //muestra los autores disponibles en biblioteca
    public void mostrarAutoresDisponibles() {
        List<String> autores = new ArrayList<>();
        for (Libro l : libros) {
            if (!autores.contains(l.getAutor().getNombre())) {
                autores.add(l.getAutor().getNombre());
            }
        }
        for (String nombre : autores) {
            System.out.println(nombre);
        }
    }
}
