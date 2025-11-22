
package tp_7_herencia_y_polimorfismo.Ejercicio_01;

public class Vehiculo {

    //atributos visibles solo en la clase o clases hijas
    protected String marca;
    protected String modelo;

    //constructor que inicializa atributos del vehículo
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;   //Guarda la marca recibida
        this.modelo = modelo; //Guarda el modelo recibido
    }

    //metodo para mostrar información del vehículo
    public void mostrarInfo() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo);
    }
}