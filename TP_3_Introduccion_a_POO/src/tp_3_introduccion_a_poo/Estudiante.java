package tp_3_introduccion_a_poo;

public class Estudiante {
    //Atributos

    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    // Métodos
    public void mostrarInfo() {
        System.out.println(nombre + " " + apellido + " " + curso + " " + calificacion + " ");
    }

    public void subirCalificacion() {
        if (calificacion < 10) {
            calificacion++;
        } else {
            System.out.println("Error: La nota no puede ser mayor a 10!");
        }
    }

    public void bajarCalificacion() {
        if (calificacion > 0) {
            calificacion--;
        } else {
            System.out.println("Error: La nota no puede ser menor a 0!");
        }
    }
    // Getter Calificación
    public double getCalificacion() {
        return calificacion;
    }

    // Setter Calificación
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
}
