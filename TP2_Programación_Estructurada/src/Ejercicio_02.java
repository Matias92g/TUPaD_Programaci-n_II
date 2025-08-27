import java.util.Scanner;
public class Ejercicio_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Ingrese un numero: ");
        num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese otro numero: ");
        num2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese otro numero: ");
        num3 = Integer.parseInt(scanner.nextLine());
        int numMayor = 0;
        if (num1 > num2 && num1 > num3){
            numMayor = num1;
        } else if (num2 > num1 && num2 > num3){
            numMayor = num2;
        } else {
            numMayor = num3;
        }
        System.out.println("El Numero mayor es "+ numMayor);
    }
}
