package tp_7_herencia_y_polimorfismo.Ejercicio_03;

public class EmpleadoPlanta extends Empleado {

    private double sueldoBase;

    public EmpleadoPlanta(String nombre, double sueldoBase) {
        super(nombre); // enviamos nombre a la clase padre
        this.sueldoBase = sueldoBase;
    }

    //Implementamos sueldo fijo
    @Override
    public double calcularSueldo() {
        return sueldoBase;
    }
}
