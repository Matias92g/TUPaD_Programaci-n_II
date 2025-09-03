package tp_3_introduccion_a_poo;

public class Gallina {

    private String idGallina;
    private int edad;
    private int huevosPuestos;

    public int ponerHuevo() {
        huevosPuestos++;
        return huevosPuestos;
    }

    public int envejecer() {
        edad++;
        return edad;
    }

    public void mostrarEstado() {
        System.out.println("La gallina " + idGallina + " tiene " + edad + " años de edad y ha puesto " + huevosPuestos + " huevos");

    }
    // GETTERS AND SETTERS
    
    public String getIdGallina (){
        return idGallina;
    }
    public int getEdad (){
        return edad;
    }
    public int getHuevosPuestos (){
        return huevosPuestos;
    }
    public void setIdGallina (String idGallina){
        this.idGallina = idGallina;
    }
    public void setEdad (int edad){
        this.edad = edad;
    }
    public void setHuevosPuestos (int huevosPuestos){
        this.huevosPuestos = huevosPuestos;
    }
}
