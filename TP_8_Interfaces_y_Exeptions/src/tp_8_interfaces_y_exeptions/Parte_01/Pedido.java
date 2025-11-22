package tp_8_interfaces_y_exeptions.Parte_01;

import java.util.ArrayList;
import java.util.List;

//Clase Pedido representa una compra con varios productos
//Implementa Pagable para calcular el total del pedido
public class Pedido implements Pagable {

    //Lista de productos del pedido
    private List<Producto> productos = new ArrayList<>();

    //Estado del pedido
    private String estado = "Pendiente";

    // liente al cual se notificará cambios de estado
    private Notificable cliente;

    //Constructor del pedido
    public Pedido(Notificable cliente) {
        this.cliente = cliente;
    }

    //Metodo para agregar productos al pedido
    public void agregarProducto(Producto p) {
        productos.add(p); // Se añade el producto a la lista
    }

    //Implementación de calcularTotal()
    @Override
    public double calcularTotal() {
        double total = 0; // Acumulador del total
        for (Producto p : productos) {
            total += p.calcularTotal(); // Suma del precio de cada producto
        }
        return total;
    }

    //Método para cambiar estado y notificar al cliente
    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        cliente.notificar("El pedido cambió a: " + nuevoEstado);
    }
}
