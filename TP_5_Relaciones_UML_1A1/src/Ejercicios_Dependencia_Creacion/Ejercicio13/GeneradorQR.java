package Ejercicios_Dependencia_Creacion.Ejercicio13;

public class GeneradorQR {

    public void generar(String valor, String nombre, String email) {
        Usuario usuario07 = new Usuario(nombre, email);
        CodigoQR codigoQr = new CodigoQR(valor);
        System.out.println("Estimado " + usuario07.getNombre() + " escanee el CódigoQR que verá a continuación: " + codigoQr.getValor());
    }
}
