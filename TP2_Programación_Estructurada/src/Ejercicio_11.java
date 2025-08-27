
import java.util.Scanner;

public class Ejercicio_11 {

    static double DESCUENTO = 0.10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        calcularDescuentoEspecial(precio);

    }

    static public void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * DESCUENTO;
        double precioFinal = precio - descuentoAplicado;
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }
}
