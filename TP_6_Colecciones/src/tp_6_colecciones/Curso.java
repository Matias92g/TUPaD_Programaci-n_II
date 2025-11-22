package tp_6_colecciones;

public class Curso {

    private String codigo;
    private String nombre;
    private Profesor profesor;

    //constructor
    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    //getters
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    //setter
    public void setProfesor(Profesor p) {
        if (this.profesor != null) {
            this.profesor.getCursos().remove(this);
        }
        this.profesor = p;
        if (p != null && !p.getCursos().contains(this)) {
            p.getCursos().add(this);
        }
    }

    //muestra la informacion del curso
    public void mostrarInfo() {
        String nombreProfesor = (profesor != null) ? profesor.getNombre() : "Sin profesor";
        System.out.println("Código: " + codigo + ", Nombre: " + nombre + ", Profesor: " + nombreProfesor);
    }
}
