
import java.util.Scanner;

public class Ejercicio_06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.print("Ingrese un numero entero: ");
        num = Integer.parseInt(scanner.nextLine());
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        for (int i = 0; i < 10; i++) {
            if (num < 0) {
                negativos += 1;
            } else if (num > 0) {
                positivos += 1;
            } else {
                ceros += 1;
            }
            System.out.println("Ingrese otro número: ");
            num = scanner.nextInt();
        }
        System.out.println("La cantidad de numeros positivos ingresados es: " + positivos);
        System.out.println("La cantidad de numeros negativos ingresados es: " + negativos);
        System.out.println("La cantidad de ceros ingresados es: " + ceros);
    }
}
