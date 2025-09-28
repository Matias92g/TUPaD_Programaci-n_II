package Ejercicios_Relaciones_1_a_1.Ejercicio09;

public class CitaMedica {

    private String fecha;
    private String hora;
    private Profesional profesional;
    private Paciente paciente;

    public CitaMedica(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }

    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "CitaMedica{" + "fecha=" + fecha + ", hora=" + hora + ", profesional=" + profesional + ", paciente=" + paciente + '}';
    }

}
