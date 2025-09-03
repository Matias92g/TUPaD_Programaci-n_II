package tp_3_introduccion_a_poo;

public class Main {

    public static void main(String[] args) {
        System.out.println("//----------- EJERCICIO 1 -----------//");
        // instancia de la clase Estudiante
        Estudiante est01 = new Estudiante();
        est01.mostrarInfo();
        System.out.println("-------------");
        // Aplicación del método subirCalificación
        est01.setCalificacion(5);
        est01.subirCalificacion();
        est01.mostrarInfo();
        System.out.println("-------------");
        // Aplicación del método bajarCalificación        
        est01.setCalificacion(0);
        est01.bajarCalificacion();
        System.out.println("-------------");
        est01.setCalificacion(10);
        est01.bajarCalificacion();
        est01.mostrarInfo();

        System.out.println("//----------- EJERCICIO 2 -----------//");
        Mascota mascota1 = new Mascota();
        mascota1.mostrarInfo();
        mascota1.setNombre("Tito");
        mascota1.setEdad(5);
        mascota1.cumplirAnios();
        mascota1.mostrarInfo();

        System.out.println("//----------- EJERCICIO 3 -----------//");
        Libro lb = new Libro();
        lb.mostrarInfo();
        lb.setAnioPublicacion(2026);
        lb.setAnioPublicacion(2001);
        lb.setTitulo("Think Python.");
        lb.setAutor("Allen Downey.");
        lb.mostrarInfo();

        System.out.println("//----------- EJERCICIO 4 -----------//");

        Gallina gal01 = new Gallina();
        Gallina gal02 = new Gallina();

        gal01.setIdGallina("G001");
        System.out.println("idGallina: " + gal01.getIdGallina());
        gal01.setEdad(1);
        System.out.println("Edad: " + gal01.getEdad());

        gal01.setHuevosPuestos(6);
        System.out.println("Huevos Puestos: " + gal01.getHuevosPuestos());
        gal01.envejecer();
        gal01.ponerHuevo();
        gal01.mostrarEstado();

        gal02.setIdGallina("G002");
        System.out.println("idGallina: " + gal02.getIdGallina());

        gal02.setEdad(7);
        System.out.println("Edad: " + gal02.getEdad());

        gal02.setHuevosPuestos(12);
        System.out.println("Huevos Puestos: " + gal02.getHuevosPuestos());

        gal02.envejecer();
        gal02.ponerHuevo();
        gal02.mostrarEstado();
        
        
        System.out.println("//----------- EJERCICIO 5 -----------//");
        NaveEspacial nave1 = new NaveEspacial();
        nave1.setNombre("Ovni");
        nave1.setcombustible(95);
        nave1.avanzar(100);
        nave1.recargarCombustible(50);
        nave1.avanzar(100);
        nave1.despegar();
        
    }
}
