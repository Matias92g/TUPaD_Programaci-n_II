
import java.util.Scanner;

public class Ejercicio_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precioOriginal = scanner.nextDouble();

        System.out.print("Ingrese la categoría (A, B o C): ");
        String categoria = scanner.next().toUpperCase();
        double descuento = 0;

        switch (categoria) {
            case "A" ->
                descuento = 0.10;
            case "B" ->
                descuento = 0.15;
            case "C" ->
                descuento = 0.20;
            default ->
                System.out.println("Categoría inválida. No se aplica descuento.");
        }
        double montoDescuento = precioOriginal * descuento;
        double precioFinal = precioOriginal - montoDescuento;
        System.out.println("Precio original: $" + precioOriginal);
        System.out.println("Descuento aplicado: $" + montoDescuento);
        System.out.println("Precio final: $" + precioFinal);

    }
}
