package tp_3_introduccion_a_poo;

public class Mascota {

    private String nombre;
    private String especie;
    private int edad;

    // MÉTODOS 
    public void mostrarInfo() {
        System.out.println(nombre + " " + especie + " " + edad + " ");
    }

    public void cumplirAnios() {
        if (edad >= 0) {
            edad++;
            System.out.println(nombre + " tiene " + edad + " años y/o " + edad * 7 + " años caninos de edad");
        }
    }

    // SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
