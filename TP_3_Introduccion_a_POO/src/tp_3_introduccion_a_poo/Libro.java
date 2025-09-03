package tp_3_introduccion_a_poo;

import java.time.LocalDate;

public class Libro {

    // Atributos Privados
    private String titulo;
    private String autor;
    private int anioPublicacion;

    // Getters and Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getautor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    //Método
    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion <= LocalDate.now().getYear()) {
            this.anioPublicacion = anioPublicacion;
        } else {
            System.out.println("Error: El año de publicación debe ser MENOR o IGUAL al año actual ");
        }
    }
    public void mostrarInfo() {
        System.out.println(titulo + " " + autor + " " + anioPublicacion + " ");
    }

}
