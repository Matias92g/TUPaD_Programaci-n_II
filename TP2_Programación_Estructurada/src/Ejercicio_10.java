
import java.util.Scanner;

public class Ejercicio_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el stock actual: ");
        int stockActual = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingrese la cantidad vendidad: ");
        int cantidadVendida = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingrese la cantidad recibida: ");
        int cantidadRecibida = Integer.parseInt(scanner.nextLine());

        int nuevoStock = calcularStock(stockActual, cantidadVendida, cantidadRecibida);

        System.out.println("El nuevo Stock es: " + nuevoStock);

    }

    static public int calcularStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        int nuevoStock = (stockActual - cantidadVendida) + cantidadRecibida;
        return nuevoStock;
    }

}
