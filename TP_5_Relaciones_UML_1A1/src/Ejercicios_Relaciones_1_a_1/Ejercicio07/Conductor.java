package Ejercicios_Relaciones_1_a_1.Ejercicio07;

public class Conductor {
    private String nombre;
    private String licencia;
    private Vehiculo vehiculo;

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        if(vehiculo != null && vehiculo.getConductor() != this){
            vehiculo.setConductor(this);
        }
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    @Override
    public String toString() {
        return "Conductor{" + "nombre=" + nombre + ", licencia=" + licencia + ", vehiculo=" + vehiculo + '}';
    }
    
    
    
    
}
