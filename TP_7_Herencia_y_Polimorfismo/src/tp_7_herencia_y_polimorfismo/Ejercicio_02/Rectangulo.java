package tp_7_herencia_y_polimorfismo.Ejercicio_02;

public class Rectangulo extends Figura {

    //Atributos exclusivos del rectángulo
    private double ancho;
    private double alto;

    //Constructor del rectángulo
    public Rectangulo(double ancho, double alto) {
        super("Rectangulo"); //Se envía el nombre a Figura
        this.ancho = ancho;
        this.alto = alto;
    }

    //Implementamos el cálculo del área
    @Override
    public double calcularArea() {
        return ancho * alto;
    }
}
