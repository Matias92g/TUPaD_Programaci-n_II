package Ejercicios_Relaciones_1_a_1.Ejercicio09;

public class Profesional {

    private String nombre;
    private String especialidad;
    private CitaMedica citaMedica;

    public Profesional(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public CitaMedica getCitaMedica() {
        return citaMedica;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Profesional{");
        sb.append("nombre=").append(nombre);
        sb.append(", especialidad=").append(especialidad);
        sb.append('}');
        return sb.toString();
    }

}
