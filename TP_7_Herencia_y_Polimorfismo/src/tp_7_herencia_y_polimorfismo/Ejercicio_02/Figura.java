package tp_7_herencia_y_polimorfismo.Ejercicio_02;

public abstract class Figura {

    //Nombre de la figura accesible en clases hijas
    protected String nombre;

    //Constructor para asignar nombre
    public Figura(String nombre) {
        this.nombre = nombre;
    }

    //Método abstracto: las clases hijas deben implementarlo
    public abstract double calcularArea();

    //Método común para mostrar datos
    public void mostrar() {
        System.out.println(nombre + " - Area: " + calcularArea());
    }
}
