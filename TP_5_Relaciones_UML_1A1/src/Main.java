
import Ejercicios_Dependencia_Creacion.Ejercicio13.GeneradorQR;
import Ejercicios_Dependencia_Creacion.Ejercicio14.EditorVideo;
import Ejercicios_Dependencia_Uso.Ejercicio11.Artista;
import Ejercicios_Dependencia_Uso.Ejercicio11.Cancion;
import Ejercicios_Dependencia_Uso.Ejercicio11.Reproductor;
import Ejercicios_Dependencia_Uso.Ejercicio12.Calculadora;
import Ejercicios_Dependencia_Uso.Ejercicio12.Contribuyente;
import Ejercicios_Dependencia_Uso.Ejercicio12.Impuesto;
import Ejercicios_Relaciones_1_a_1.Ejercicio01.Pasaporte;
import Ejercicios_Relaciones_1_a_1.Ejercicio01.Titular;
import Ejercicios_Relaciones_1_a_1.Ejercicio02.Bateria;
import Ejercicios_Relaciones_1_a_1.Ejercicio02.Celular;
import Ejercicios_Relaciones_1_a_1.Ejercicio02.Usuario;
import Ejercicios_Relaciones_1_a_1.Ejercicio03.Autor;
import Ejercicios_Relaciones_1_a_1.Ejercicio03.Editorial;
import Ejercicios_Relaciones_1_a_1.Ejercicio03.Libro;
import Ejercicios_Relaciones_1_a_1.Ejercicio04.Banco;
import Ejercicios_Relaciones_1_a_1.Ejercicio04.Cliente;
import Ejercicios_Relaciones_1_a_1.Ejercicio04.TarjetaDeCredito;
import Ejercicios_Relaciones_1_a_1.Ejercicio05.Computadora;
import Ejercicios_Relaciones_1_a_1.Ejercicio05.Propietario;
import Ejercicios_Relaciones_1_a_1.Ejercicio06.Mesa;
import Ejercicios_Relaciones_1_a_1.Ejercicio06.Reserva;
import Ejercicios_Relaciones_1_a_1.Ejercicio07.Conductor;
import Ejercicios_Relaciones_1_a_1.Ejercicio07.Motor;
import Ejercicios_Relaciones_1_a_1.Ejercicio07.Vehiculo;
import Ejercicios_Relaciones_1_a_1.Ejercicio08.Documento;
import Ejercicios_Relaciones_1_a_1.Ejercicio09.CitaMedica;
import Ejercicios_Relaciones_1_a_1.Ejercicio09.Paciente;
import Ejercicios_Relaciones_1_a_1.Ejercicio09.Profesional;
import Ejercicios_Relaciones_1_a_1.Ejercicio10.CuentaBancaria;
import javax.swing.tree.DefaultTreeCellEditor;

public class Main {

    public static void main(String[] args) {
        //Ejercicio de relaciones 1 a 1
        System.out.println("--------------- Ejercicio 1 ----------------------");

        //1. Pasaporte - Foto - Titular       
        Titular titular01 = new Titular("Matias Gonzalez", "12345678");
        Pasaporte pasaporte01 = new Pasaporte(001, "01/01/2025", "Imagen001", "jpg");
        pasaporte01.setTitular(titular01);

        System.out.println(pasaporte01);
        System.out.println(titular01);
        System.out.println(pasaporte01.getTitular().getNombre());

        System.out.println("");
        System.out.println("--------------- Ejercicio 2 ----------------------");
        //2. Celular - Bateria - Usuario

        Usuario usuario01 = new Usuario("Matias Gonzalez", "12345678");
        Bateria bateria01 = new Bateria("Li-ion", "4000mAh");
        Celular celular01 = new Celular("123456789159753", "Samsung", "S25 Pro");

        celular01.setUsuario(usuario01);
        celular01.setBateria(bateria01);
        System.out.println(celular01);
        System.out.println(usuario01);

        System.out.println("");
        System.out.println("--------------- Ejercicio 3 ----------------------");
        //3. Libro - Autor - Editorial

        Autor autor01 = new Autor("Matias Gonzalez", "Argentino");
        Editorial editorial01 = new Editorial("Publicando Arte", "Av. Argentina 1123");
        Libro libro01 = new Libro("Las aventuras de Xtrike", "978-950-06-1234-5");

        libro01.setEditorial(editorial01);
        libro01.setAutor(autor01);

        System.out.println(libro01);
        System.out.println(libro01.getTitulo());
        System.out.println(libro01.getIsbn());
        System.out.println(libro01.getAutor());
        System.out.println(libro01.getEditorial());

        System.out.println("");
        System.out.println("--------------- Ejercicio 4 ----------------------");

        Cliente cliente01 = new Cliente("Matias Gonzalez", "12345678");
        TarjetaDeCredito tarjeta01 = new TarjetaDeCredito("1234-1234-1234-1234", "01/01/2100");
        Banco banco01 = new Banco("Nacional", "30-12345678-3");

        tarjeta01.setCliente(cliente01);
        tarjeta01.setBanco(banco01);
        System.out.println(tarjeta01);
        System.out.println(banco01);
        System.out.println(cliente01);

        System.out.println("");
        System.out.println("--------------- Ejercicio 5 ----------------------");

        Propietario propietario01 = new Propietario("Matias Gonzalez ", "12345678");
        Computadora computadora01 = new Computadora("Acer", "12345-22-23456-789456-52354", "DA0ZRWMB6C0", "Intel H570");

        computadora01.setPropietario(propietario01);
        System.out.println(computadora01);
        System.out.println(propietario01);

        System.out.println("");
        System.out.println("--------------- Ejercicio 6 ----------------------");
        Ejercicios_Relaciones_1_a_1.Ejercicio06.Cliente cliente02 = new Ejercicios_Relaciones_1_a_1.Ejercicio06.Cliente("Matias Gonzalez", "12345667");
        Mesa mesa01 = new Mesa(10, 4);
        Reserva reserva01 = new Reserva("25/12", "21:30");

        reserva01.setCliente(cliente02);
        reserva01.setMesa(mesa01);

        System.out.println(reserva01);

        System.out.println("");
        System.out.println("--------------- Ejercicio 7 ----------------------");

        Motor motor01 = new Motor("Naftero", "1234-5678910");
        Conductor conductor01 = new Conductor("Matias Gonzalez", "B1");
        Vehiculo vehiculo01 = new Vehiculo("AT532ZZ", "2030");

        vehiculo01.setConductor(conductor01);
        vehiculo01.setMotor(motor01);

        System.out.println(vehiculo01);
        System.out.println(motor01);
        System.out.println(conductor01);

        System.out.println("");
        System.out.println("--------------- Ejercicio 8 ----------------------");

        Ejercicios_Relaciones_1_a_1.Ejercicio08.Usuario usuario05 = new Ejercicios_Relaciones_1_a_1.Ejercicio08.Usuario("Matias Gonzalez", "matias.gonzalez@mail.com");
        Documento documento = new Documento("Trabajo Práctico - Relaciones UML 1 a 1", "Desarrollo del TP", "e3f1c3a6b2d4f9c8a1e7b6d5c4f3a2b1d0e9c8f7a6b5d4c3e2f1a0b9c8d7e6f5", "26/09/2025");

        System.out.println(documento);
        usuario05.setFirmaDigital(documento.getFirmaDigital());
        System.out.println(usuario05);

        System.out.println("");
        System.out.println("--------------- Ejercicio 9 ----------------------");

        Profesional profesional = new Profesional("Matias Gonzalez", "Oftalmología");
        Paciente paciente = new Paciente("Jose Gimenez", "Swiss Medical");
        CitaMedica citaMedica01 = new CitaMedica("30/09/2025", "15:30");

        citaMedica01.setPaciente(paciente);
        citaMedica01.setProfesional(profesional);
        System.out.println(citaMedica01);

        System.out.println("");
        System.out.println("--------------- Ejercicio 10 ----------------------");

        Ejercicios_Relaciones_1_a_1.Ejercicio10.Titular titular02 = new Ejercicios_Relaciones_1_a_1.Ejercicio10.Titular("Matias Gonzalez", "12345678");
        CuentaBancaria cuentaBancaria01 = new CuentaBancaria("1234567891234567891234", 0, "0012", "28/09/2025");

        titular02.setCuentaBancaria(cuentaBancaria01);

        System.out.println(cuentaBancaria01);
        System.out.println(cuentaBancaria01.getClaveSeguridad());
        System.out.println(titular02);

        // Ejercicios de Dependencia de Uso
        System.out.println("");
        System.out.println("--------------- Ejercicio 11 ----------------------");
        
        Artista artista01 = new Artista("Matias Gonzalez", "Rock&Roll");
        Cancion cancion01 = new Cancion("Thunderstuck");
        Reproductor reproductor01 = new Reproductor();
        
        cancion01.setArtista(artista01);
        reproductor01.reproducir(cancion01);
        
        System.out.println("");
        System.out.println("--------------- Ejercicio 12 ----------------------");
        
        Contribuyente contribuyente01 = new Contribuyente("Matias Gonzalez", "12345678910");
        Impuesto impuesto01 = new Impuesto(25000);
        Calculadora calculadora01 = new Calculadora();
        
        impuesto01.setContribuyente(contribuyente01);
        calculadora01.calcular(impuesto01);
        
        // Ejercicios de Dependencia de Creación
        System.out.println("");
        System.out.println("--------------- Ejercicio 13 ----------------------");
        
        GeneradorQR generadorQr01 = new GeneradorQR();
        generadorQr01.generar("qweqwe", "Matias Gonzalez", "matias.gonzalez@email.com");
        
        System.out.println("");
        System.out.println("--------------- Ejercicio 14 ----------------------");
        
        EditorVideo editor = new EditorVideo();
        editor.exportar("MP4", "Aprendiendo Java", 10.25);
    }

}
