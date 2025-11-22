package tp_6_colecciones;

public class TP_6_Colecciones {

    public static void main(String[] args) {

        //Ejercicio 1: sistema de stock
        System.out.println("Resultados Ejercicio 1:");

        //se crea el inventario vacio
        Inventario inventario = new Inventario();

        //se crean los productos
        Producto p1 = new Producto("P001", "Carne", 1200, 50, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P002", "Computadora", 2500, 20, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P003", "Pantalon", 1500, 100, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P004", "Microondas", 2000, 30, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Celular", 3000, 15, CategoriaProducto.ELECTRONICA);

        //se agregan productos al inventario
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        System.out.println("Lista completa de productos:");
        inventario.listarProductos();

        //busqueda por ID
        System.out.println("Buscar producto por ID 'P003':");
        Producto buscado = inventario.buscarProductoPorId("P003");
        if (buscado != null) {
            buscado.mostrarInfo();
        }

        //filtrado por categoria
        System.out.println("Filtrar productos por categoria ELECTRONICA:");
        inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);

        //eliminar un producto y luego listar
        System.out.println("Eliminar producto 'P001' y listar nuevamente:");
        inventario.eliminarProducto("P001");
        inventario.listarProductos();

        //actualizar cantidad de stock de un producto
        System.out.println("Actualizar stock de 'P002' a 35 unidades:");
        inventario.actualizarStock("P002", 35);
        inventario.listarProductos();

        //mostrar total de stock de todos los productos
        System.out.println("Total de stock disponible: " + inventario.obtenerTotalStock());

        //mostrar el producto con mayor cantidad de stock
        System.out.println("Producto con mayor stock:");
        Producto mayorStock = inventario.obtenerProductoConMayorStock();
        if (mayorStock != null) {
            mayorStock.mostrarInfo();
        }

        //filtrar por rango de precio
        System.out.println("Filtrar productos con precio entre $1000 y $3000:");
        inventario.filtrarProductosPorPrecio(1000, 3000);

        //mostrar categorias del inventario
        System.out.println("Categorías disponibles:");
        inventario.mostrarCategoriasDisponibles();

        //Ejercicio 2: Biblioteca y libros
        System.out.println("Resultados ejercicio 2:");

        //se crea la biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        //se crean los autores
        Autor a1 = new Autor("A001", "Gabriel Garcia Marquez", "Colombiana");
        Autor a2 = new Autor("A002", "J.K. Rowling", "Británica");
        Autor a3 = new Autor("A003", "George Orwell", "Británica");

        //se agregan libros
        biblioteca.agregarLibro("L001", "Cien Años de Soledad", 1967, a1);
        biblioteca.agregarLibro("L002", "Harry Potter y la Piedra Filosofal", 1997, a2);
        biblioteca.agregarLibro("L003", "Harry Potter y la Cámara Secreta", 1998, a2);
        biblioteca.agregarLibro("L004", "1984", 1949, a3);
        biblioteca.agregarLibro("L005", "Animal Farm", 1945, a3);

        //se lista los libros de la biblioteca
        System.out.println("Lista completa de libros:");
        biblioteca.listarLibros();

        //se busca libro por ISBN
        System.out.println("Buscar libro por ISBN 'L002':");
        Libro libroBuscado = biblioteca.buscarLibroPorIsbn("L002");
        if (libroBuscado != null) {
            libroBuscado.mostrarInfo();
        }

        //filtrado por año
        System.out.println("Filtrar libros publicados en 1998:");
        biblioteca.filtrarLibrosPorAnio(1998);

        //eliminar un libro y luego listar
        System.out.println("Eliminar libro 'L005' y listar nuevamente:");
        biblioteca.eliminarLibro("L005");
        biblioteca.listarLibros();

        //mostrar cantidad de libros
        System.out.println("Cantidad total de libros: " + biblioteca.obtenerCantidadLibros());

        //mostrar autores disponibles
        System.out.println("Autores disponibles:");
        biblioteca.mostrarAutoresDisponibles();

        //Ejercicio 3: Universidad, profesor y curso
        System.out.println("Resultados ejercicio 3:");

        //se crea la universidad
        Universidad utn = new Universidad("UTN");

        //se crean profesores
        Profesor prof1 = new Profesor("P001", "Juan Perez", "Programacion");
        Profesor prof2 = new Profesor("P002", "Fulano Lopez", "Matematica");
        Profesor prof3 = new Profesor("P003", "Agustin Martinez", "Fisica");

        //se agregan profesores
        utn.agregarProfesor(prof1);
        utn.agregarProfesor(prof2);
        utn.agregarProfesor(prof3);

        //se crean los cursos
        Curso c1 = new Curso("C001", "Programación I");
        Curso c2 = new Curso("C002", "Matemática Discreta");
        Curso c3 = new Curso("C003", "Física I");
        Curso c4 = new Curso("C004", "Algoritmos");
        Curso c5 = new Curso("C005", "Cálculo");

        //se agregan los cursos
        utn.agregarCurso(c1);
        utn.agregarCurso(c2);
        utn.agregarCurso(c3);
        utn.agregarCurso(c4);
        utn.agregarCurso(c5);

        //se asignan profesores a los cursos
        System.out.println("Asignar profesores a cursos:");
        utn.asignarProfesorACurso("C001", "P001");
        utn.asignarProfesorACurso("C004", "P001");
        utn.asignarProfesorACurso("C002", "P002");
        utn.asignarProfesorACurso("C005", "P002");
        utn.asignarProfesorACurso("C003", "P003");

        //se listan todos los cursos
        System.out.println("Listado de cursos:");
        utn.listarCursos();

        //se listan los profesores
        System.out.println("Listado de profesores:");
        utn.listarProfesores();

        //se cambia el profesor de un curso
        System.out.println("Cambiar profesor de C004 a Ana Gomez:");
        utn.asignarProfesorACurso("C004", "P002");

        //tras el cambio se lista de nuevo los cursos y profesores
        System.out.println("Listado de cursos tras cambio:");
        utn.listarCursos();
        System.out.println("Listado de profesores tras cambio:");
        utn.listarProfesores();

        //se elimina un curso y se muestra lo actualizado
        System.out.println("Eliminar curso C005:");
        utn.eliminarCurso("C005");
        utn.listarCursos();
        utn.listarProfesores();

        //se elimina un profesor y se muestra el listado nuevo
        System.out.println("Eliminar profesor P003:");
        utn.eliminarProfesor("P003");
        utn.listarCursos();
        utn.listarProfesores();
    }

}
