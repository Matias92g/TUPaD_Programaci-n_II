package tp_6_colecciones;

import java.util.ArrayList;
import java.util.List;

public class Universidad {

    //atributos
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    //constructor
    public Universidad(String nombre) {
        this.nombre = nombre;
        profesores = new ArrayList<>();
        cursos = new ArrayList<>();
    }

    //getter
    public String getNombre() {
        return nombre;
    }

    //agregar profesor
    public void agregarProfesor(Profesor p) {
        profesores.add(p);
    }

    //agregar curso
    public void agregarCurso(Curso c) {
        cursos.add(c);
    }

    //asignar profesor a un curso
    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor prof = buscarProfesorPorId(idProfesor);
        if (curso != null && prof != null) {
            curso.setProfesor(prof);
        }
    }

    //listados
    public void listarProfesores() {
        for (Profesor p : profesores) {
            p.mostrarInfo();
        }
    }

    public void listarCursos() {
        for (Curso c : cursos) {
            c.mostrarInfo();
        }
    }

    //busquedas
    //profesor por ID
    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    //curso por codigo
    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equals(codigo)) {
                return c;
            }
        }
        return null;
    }

    //remocion
    //eliminar curso    
    public void eliminarCurso(String codigo) {
        Curso c = buscarCursoPorCodigo(codigo);
        if (c != null) {
            if (c.getProfesor() != null) {
                c.getProfesor().getCursos().remove(c);
            }
            cursos.remove(c);
        }
    }

    //eliminar profresor
    public void eliminarProfesor(String id) {
        Profesor p = buscarProfesorPorId(id);
        if (p != null) {
            //se crea una copia de la lista para evitar ConcurrentModificationException
            ArrayList<Curso> cursosCopia = new ArrayList<>(p.getCursos());
            for (Curso c : cursosCopia) {
                c.setProfesor(null);
            }
            profesores.remove(p);
        }
    }
}
