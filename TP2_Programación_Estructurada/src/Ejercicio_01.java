
import java.util.Scanner;

public class Ejercicio_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int anio;
        System.out.println("Ingrese un año: ");
        anio = Integer.parseInt(scanner.nextLine());
        
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("El año " + anio + " es bisiesto.");
        } else {
            System.out.println("El año " + anio + " no es bisiesto.");
        } 
    } 
    
}
