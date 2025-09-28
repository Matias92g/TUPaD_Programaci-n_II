package Ejercicios_Relaciones_1_a_1.Ejercicio09;

public class Paciente {

    private String nombre;
    private String obraSocial;
    private CitaMedica citaMedica;
    

    public Paciente(String nombre, String obraSocial) {
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }

    public CitaMedica getCitaMedica() {
        return citaMedica;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Paciente{");
        sb.append("nombre=").append(nombre);
        sb.append(", obraSocial=").append(obraSocial);
        sb.append('}');
        return sb.toString();
    }
    

}
