package tp_7_herencia_y_polimorfismo.Ejercicio_03;

public abstract class Empleado {

    //Nombre del empleado
    public String nombre;

    //Constructor
    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    //metodo abstracto: cada tipo de empleado define su sueldo
    public abstract double calcularSueldo();
}
