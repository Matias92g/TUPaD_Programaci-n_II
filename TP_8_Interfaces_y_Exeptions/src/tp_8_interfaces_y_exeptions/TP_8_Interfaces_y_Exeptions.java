package tp_8_interfaces_y_exeptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import tp_8_interfaces_y_exeptions.Parte_01.Cliente;
import tp_8_interfaces_y_exeptions.Parte_01.PayPal;
import tp_8_interfaces_y_exeptions.Parte_01.Pedido;
import tp_8_interfaces_y_exeptions.Parte_01.Producto;
import tp_8_interfaces_y_exeptions.Parte_01.TarjetaCredito;
import tp_8_interfaces_y_exeptions.Parte_02.EdadInvalidaException;

public class TP_8_Interfaces_y_Exeptions {

    public static void main(String[] args) {

        System.out.println("");
        System.out.println("//--------------------Parte 01------------------//");

        Cliente cliente = new Cliente("Matias");

        Pedido pedido = new Pedido(cliente);

        pedido.agregarProducto(new Producto("Heladera", 600000));
        pedido.agregarProducto(new Producto("Microondas", 50000));

        double total = pedido.calcularTotal();
        System.out.println("Total sin descuento: $" + total);

        TarjetaCredito tc = new TarjetaCredito();
        PayPal paypal = new PayPal();

        //Pago con tarjeta con descuento
        double totalDescuento = tc.aplicarDescuento(total);
        tc.procesarPago(totalDescuento);

        //Cambio de estado del pedido
        pedido.cambiarEstado("Preparando envio");

        //Pago con PayPal
        paypal.procesarPago(total);
        System.out.println("");
        System.out.println("//--------------------Parte 02------------------//");
        Scanner sc = new Scanner(System.in);

        //1. Division segura
        try {
            System.out.print("Ingrese dividendo: ");
            int a = sc.nextInt();
            System.out.print("Ingrese divisor: ");
            int b = sc.nextInt();
            System.out.println("Resultado: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Error: division por cero.");
        }

        sc.nextLine(); //limpiar buffer

        //2. Conversion segura
        try {
            System.out.print("Ingrese un número: ");
            String texto = sc.nextLine();
            int numero = Integer.parseInt(texto);
            System.out.println("Número ingresado: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: no es un número válido.");
        }

        //3. Lectura de archivo
        try {
            BufferedReader br = new BufferedReader(new FileReader("archivo.txt"));
            System.out.println("Contenido: " + br.readLine());
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: archivo no encontrado.");
        } catch (IOException e) {
            System.out.println("Error de lectura.");
        }

        //4. Excepción personalizada
        try {
            validarEdad(200);
        } catch (EdadInvalidaException e) {
            System.out.println(e.getMessage());
        }

        //5. Try-with-resources
        try (BufferedReader br = new BufferedReader(new FileReader("archivo.txt"))) {
            System.out.println("Leyendo archivo con try with resources...");
            System.out.println(br.readLine());
        } catch (IOException e) {
            System.out.println("Error al leer archivo.");
        }
    }

    //Metodo para validar edad
    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("Edad invalida: " + edad);
        }
    }
}
