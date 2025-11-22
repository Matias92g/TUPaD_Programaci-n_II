package tp_7_herencia_y_polimorfismo.Ejercicio_04;

public class Perro extends Animal {

    //Sobrescribimos comportamiento
    @Override
    public void hacerSonido() {
        System.out.println("Guau!");
    }
}
