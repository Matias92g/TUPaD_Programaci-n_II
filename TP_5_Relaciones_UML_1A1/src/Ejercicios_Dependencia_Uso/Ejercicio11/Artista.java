package Ejercicios_Dependencia_Uso.Ejercicio11;

public class Artista {
    private String nombre;
    private String genero;

    public Artista(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Artista{");
        sb.append("nombre=").append(nombre);
        sb.append(", genero=").append(genero);
        sb.append('}');
        return sb.toString();
    }
    
    
}
