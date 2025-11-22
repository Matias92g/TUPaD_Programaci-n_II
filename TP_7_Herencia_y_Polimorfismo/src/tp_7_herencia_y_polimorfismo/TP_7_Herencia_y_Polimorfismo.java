package tp_7_herencia_y_polimorfismo;

import java.util.ArrayList;
import tp_7_herencia_y_polimorfismo.Ejercicio_01.Auto;
import tp_7_herencia_y_polimorfismo.Ejercicio_01.Vehiculo;
import tp_7_herencia_y_polimorfismo.Ejercicio_02.Circulo;
import tp_7_herencia_y_polimorfismo.Ejercicio_02.Figura;
import tp_7_herencia_y_polimorfismo.Ejercicio_02.Rectangulo;
import tp_7_herencia_y_polimorfismo.Ejercicio_03.Empleado;
import tp_7_herencia_y_polimorfismo.Ejercicio_03.EmpleadoPlanta;
import tp_7_herencia_y_polimorfismo.Ejercicio_03.EmpleadoTemporal;
import tp_7_herencia_y_polimorfismo.Ejercicio_04.Animal;
import tp_7_herencia_y_polimorfismo.Ejercicio_04.Gato;
import tp_7_herencia_y_polimorfismo.Ejercicio_04.Perro;
import tp_7_herencia_y_polimorfismo.Ejercicio_04.Vaca;

public class TP_7_Herencia_y_Polimorfismo {

    public static void main(String[] args) {
        System.out.println("// -----------------Ejercicio 01 ---------------------------//");
        //creamos un objeto Auto utilizando upcasting (tratado como Vehiculo)
        Vehiculo miAuto = new Auto("Toyota", "Corolla", 4);

        //llamamos al método que mostrará info
        miAuto.mostrarInfo();
        System.out.println("");
        System.out.println("// -----------------Ejercicio 02 ---------------------------//");
        //Creamos un arreglo de tipo Figura que almacena hijos
        Figura[] figuras = {
            new Circulo(4), //Circulo con radio 4
            new Rectangulo(5, 10)//Rectángulo 5x10
        };

        //Recorremos e invocamos métodos de polimorfismo
        for (Figura f : figuras) {
            f.mostrar(); //cada figura usa su propia versión de calcularArea
        }
        System.out.println("");
        System.out.println("// -----------------Ejercicio 03 ---------------------------//");

        ArrayList<Empleado> empleados = new ArrayList<>();

        //Agregamos distintos tipos de empleado
        empleados.add(new EmpleadoPlanta("Ana", 500000));
        empleados.add(new EmpleadoTemporal("Luis", 20, 15000));

        //Recorremos la lista y usamos polimorfismo
        for (Empleado e : empleados) {
            System.out.println(e.nombre + " cobra $" + e.calcularSueldo());

            //instanceof para identificar tipo real
            if (e instanceof EmpleadoTemporal) {
                EmpleadoTemporal temp = (EmpleadoTemporal) e; //downcasting
                System.out.println("Días trabajados: " + temp.getDiasTrabajados());
            }
        }

        System.out.println("");
        System.out.println("// -----------------Ejercicio 03 ---------------------------//");
        //Array de animales (con polimorfismo)
        Animal[] animales = {new Perro(), new Gato(), new Vaca()};

        //Llamamos métodos
        for (Animal a : animales) {
            a.describirAnimal();//método heredado
            a.hacerSonido();//método sobrescrito según el animal
            System.out.println("----");
        }

    }

}
