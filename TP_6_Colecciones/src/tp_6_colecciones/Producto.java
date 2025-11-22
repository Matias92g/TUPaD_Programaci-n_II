package tp_6_colecciones;

public class Producto {

    //atributos
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;

    //constructor
    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    //getter
    public String getId() {
        return id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    //setter
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void mostrarInfo() {
        System.out.println("ID: " + id + ", Nombre: " + nombre + ", Precio: $" + precio + ", Cantidad: " + cantidad + ", Categoría: " + categoria + " (" + categoria.getDescripcion() + ")");
    }

    //representar el objeto como texto
    @Override
    public String toString() {
        return nombre + " [" + id + "]";
    }
}
