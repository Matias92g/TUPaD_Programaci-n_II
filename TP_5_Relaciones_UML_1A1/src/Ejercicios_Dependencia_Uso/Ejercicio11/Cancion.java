package Ejercicios_Dependencia_Uso.Ejercicio11;

public class Cancion {
    private String titulo;
    private Artista artista;

    public Cancion(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cancion{");
        sb.append("titulo=").append(titulo);
        sb.append(", artista=").append(artista);
        sb.append('}');
        return sb.toString();
    }
    
}
