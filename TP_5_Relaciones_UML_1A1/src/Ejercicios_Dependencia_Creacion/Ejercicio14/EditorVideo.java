package Ejercicios_Dependencia_Creacion.Ejercicio14;

public class EditorVideo {

    public EditorVideo() {
    }

    public void exportar(String formato, String nombre, double duracionMin) {
        Render render = new Render(formato);
        Proyecto proyecto = new Proyecto(nombre, duracionMin);

        System.out.println("El proyecto " + proyecto.getNombre() + " fue renderizado en formato " + render.getFormato() + " y tiene una duración, en minutos, de " + proyecto.getDuracionMin());
    }

}
