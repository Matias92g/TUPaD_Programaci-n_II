
import java.util.Scanner;

public class Ejercicio_08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = scanner.nextDouble();

        System.out.print("Ingrese el porcentaje de impuesto (ej. 10 para 10%): ");
        double porcentajeImpuesto = scanner.nextDouble();

        System.out.print("Ingrese el porcentaje de descuento (ej. 5 para 5%): ");
        double porcentajeDescuento = scanner.nextDouble();

        double impuesto = porcentajeImpuesto / 100;
        double descuento = porcentajeDescuento / 100;

        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);
        System.out.println("El precio final es: $" + precioFinal);
    }

    static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        double precioFinal = precioBase + (precioBase * impuesto) - (precioBase * descuento);
        return precioFinal;
    }
}
