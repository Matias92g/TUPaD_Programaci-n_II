
package Ejercicios_Relaciones_1_a_1.Ejercicio01;

public class Foto {
    private String imagen;
    private String formato;
    

    public Foto(String imagen, String formato) {
        this.imagen = imagen;
        this.formato = formato;
    }

    @Override
    public String toString() {
        return "Foto{" + "imagen=" + imagen + ", formato=" + formato + '}';
    }

    public String getImagen() {
        return imagen;
    }

    public String getFormato() {
        return formato;
    }
    
    
    
}
