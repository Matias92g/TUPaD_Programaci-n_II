package tp_3_introduccion_a_poo;

public class NaveEspacial {

    // Atributos 
    private String nombre;
    private double combustible;
    
    //Métodos   
    public void despegar() {
        if (combustible > 100) {
            System.out.println("Todo listo! " + nombre + " inicia proceso de despegue...");
            System.out.println("Despegando...");
        }
    }

    public void avanzar(double distancia) {
        if( combustible >= 100){
            System.out.println("Distancia a reccorer: " + distancia + " metros.");
        }else {
            System.out.println("Error. el combustible disponible es insuficiente para avanzar.");
            System.out.println("Recarga combustible.");
        }
    }

    public void recargarCombustible(double cantidad) {
        if (combustible <= 100) {
            combustible += cantidad;
            System.out.println("Ahora si! La nave tiene suficiente combustible para realizar nuestro viaje");
        }
    }

    public void mostrarEstado() {
        System.out.println("La nave " + nombre + " tiene " + combustible + " litros de combustible.");
    }
    
    //Setters
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setcombustible(double combustible){
        this.combustible = combustible;
    }

}
