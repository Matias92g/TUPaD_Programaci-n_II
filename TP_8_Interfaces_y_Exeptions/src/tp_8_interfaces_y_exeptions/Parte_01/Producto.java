package tp_8_interfaces_y_exeptions.Parte_01;

public class Producto implements Pagable {

    //Atributos del producto
    private String nombre; // Nombre del producto
    private double precio; // Precio del producto

    //Constructor para inicializar nombre y precio
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    //Uso del método calcularTotal() de Pagable
    @Override
    public double calcularTotal() {
        return precio; // El total de un producto es su precio
    }

    //Getter para usarlo fuera de la clase
    public String getNombre() {
        return nombre;
    }
}
