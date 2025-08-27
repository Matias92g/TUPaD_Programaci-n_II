
import java.util.Scanner;

public class Ejercicio_09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = scanner.nextDouble();

        System.out.print("Seleccione el tipo de envío (1 para nacional o 2 para internacioal): ");
        double tipoEnvio = scanner.nextDouble();
        if (tipoEnvio == 1) {
            tipoEnvio = 5;
        } else {
            tipoEnvio = 10;
        }
        System.out.print("Ingrese el peso del paquete: ");
        double pesoPaquete = scanner.nextDouble();

        double costoTotalEnvio = calcularCostoEnvio(pesoPaquete, tipoEnvio);
        double costoTotalCompra = calcularTotalCompra(precioProducto, costoTotalEnvio);
        System.out.println("El precio del paquete es: " + precioProducto);
        System.out.println("El costo del envío es: " + costoTotalEnvio);
        System.out.println("El costo total de la compra es: " + costoTotalCompra);

    }

    static public double calcularTotalCompra(double precioProducto, double costoEnvio) {
        double totalCompra = precioProducto + costoEnvio;
        return totalCompra;

    }

    static public double calcularCostoEnvio(double peso, double costoEnvio) {
        double envio = peso * costoEnvio;
        return envio;
    }

}
