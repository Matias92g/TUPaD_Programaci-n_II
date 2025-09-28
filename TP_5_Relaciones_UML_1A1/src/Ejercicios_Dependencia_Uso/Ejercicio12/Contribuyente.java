package Ejercicios_Dependencia_Uso.Ejercicio12;

public class Contribuyente {

    private String nombre;
    private String cuil;

    public Contribuyente(String nombre, String cuil) {
        this.nombre = nombre;
        this.cuil = cuil;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCuil() {
        return cuil;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Contribuyente{");
        sb.append("nombre=").append(nombre);
        sb.append(", cuil=").append(cuil);
        sb.append('}');
        return sb.toString();
    }

}
