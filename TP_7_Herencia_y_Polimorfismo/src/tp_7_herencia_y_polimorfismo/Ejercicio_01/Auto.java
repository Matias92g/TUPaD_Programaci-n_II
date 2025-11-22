
package tp_7_herencia_y_polimorfismo.Ejercicio_01;

public class Auto extends Vehiculo {

    //atributo propio de Auto
    private int cantidadPuertas;

    //constructor que recibe variables y llama al constructor padre con super(...)
    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo);            //Llama al constructor de Vehiculo
        this.cantidadPuertas = cantidadPuertas; //Guarda cantidad de puertas
    }

    //se sobreescribe el método mostrarInfo para agregar más datos
    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); //se llama al método mostrarInfo de Vehiculo
        System.out.println("Puertas: " + cantidadPuertas);
    }
}
