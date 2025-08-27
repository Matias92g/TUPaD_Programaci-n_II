
import java.util.Scanner;

public class Ejercicio_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad;
        System.out.println("Ingrese su edad: ");
        edad = Integer.parseInt(scanner.nextLine());

        if (edad < 12) {
            System.out.println("Tu etapa de vida es: Niño");
        } else if (edad >= 12 && edad < 18) {
            System.out.println("Tu etapa de vida es: Adolescente");
        } else if (edad >= 18 && edad < 60) {
            System.out.println("Tu etapa de vida es: Adulto");
        } else {
            System.out.println("Tu estapa de vida es: Adulto Mayor");
        }
    }
}
