package tp_8_interfaces_y_exeptions.Parte_01;
//Clase Cliente implementa Notificable

public class Cliente implements Notificable {

    private String nombre; // Nombre del cliente

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void notificar(String mensaje) {
        System.out.println("Cliente " + nombre + " fue notificado: " + mensaje);
    }
}
