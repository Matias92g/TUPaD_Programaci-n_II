package tp_6_colecciones;

import java.util.ArrayList;
import java.util.List;

public class Profesor {

    //atributos
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;

    //constructor
    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        cursos = new ArrayList<>();
    }

    //getters
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    //agrega un curso a la lista
    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
            c.setProfesor(this);
        }
    }

    //elimina un curso de la lista
    public void eliminarCurso(Curso c) {
        if (cursos.contains(c)) {
            cursos.remove(c);
            c.setProfesor(null);
        }
    }

    //muestra los cursos dictados por el profesor
    public void listarCursos() {
        for (Curso c : cursos) {
            System.out.println(c.getCodigo() + " = " + c.getNombre());
        }
    }

    //muestra la informacion del profesor
    public void mostrarInfo() {
        System.out.println("ID: " + id + ", Nombre: " + nombre + ", Especialidad: " + especialidad + ", Cursos dictados: " + cursos.size());
    }

}
