package Ejercicios_Relaciones_1_a_1.Ejercicio07;

public class Vehiculo {
    private String patente;
    private String modelo;
    private Conductor conductor;
    private Motor motor;

    public Vehiculo(String patente, String modelo) {
        this.patente = patente;
        this.modelo = modelo;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        if(conductor != null && conductor.getVehiculo() != this){
            conductor.setVehiculo(this);
        }
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public Motor getMotor() {
        return motor;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", modelo=" + modelo + ", motor=" + motor + '}';
    }
    
    
    
}
