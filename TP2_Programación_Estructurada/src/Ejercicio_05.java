
import java.util.Scanner;

public class Ejercicio_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.print("Ingrese un numero entero: ");
        num = Integer.parseInt(scanner.nextLine());
        int accu = 0;

        while (num != 0) {
            if (num % 2 == 0) {
                accu += num;
            }
            System.out.println("Ingrese otro número(0 para terminar): ");
            num = scanner.nextInt();
        }
        System.out.println("La sumatoria de todos los nros pares ingresados es: " + accu);
    }
}
