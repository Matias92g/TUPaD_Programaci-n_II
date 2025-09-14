
public class Empleado {

    private int id; //Identificador único del empleado
    private String nombre; // Nombre completo
    private String puesto; // Cargo que desempeña
    private double salario; // Salario actual
    private static int contadorId;
    private static int contadorEmpleados;
    private static int totalEmpleados; // Contador global de empleados creados.

    // Constructores
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        contadorEmpleados++;
        this.totalEmpleados = contadorEmpleados;
    }

    public Empleado(String nombre, String puesto) {
        contadorId++;
        this.id = contadorId;
        contadorEmpleados++;
        this.totalEmpleados = contadorEmpleados;
        this.salario = 10000;
        this.nombre = nombre;
        this.puesto = puesto;
    }
//    Métodos 

    public void actualizarSalario(int porcentaje) {
        if (porcentaje > 0 && porcentaje <= 100) {
            this.salario = salario + (salario * porcentaje / 100);
        } else {
            System.out.println("Si deseas actualizar el salario ingresando el monto, debes agregar decimales.");
        }
    }

    public void actualizarSalario(double monto) {
        if (monto > 0) {
            this.salario = salario + monto;
        }
    }

    static public void mostrarTotalEmpleados() {
        System.out.println("Total de Empleados: " + totalEmpleados);
    }

//    Getters && Setters
    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        }
    }

    public int getId() {
        return id;
    }

    public void setNombre(String nombre) {
        if (nombre != null) {
            this.nombre = nombre;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setPuesto(String puesto) {
        if (puesto != null) {
            this.puesto = puesto;
        }
    }

    public String getPuesto() {
        return puesto;
    }

    public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        }
    }

    public double getSalario() {
        return salario;
    }

//    toString()
    @Override
    public String toString() {
        return "\nEmpleado{" + " \nID: " + id + ", \nNombre_Completo: " + nombre + ", \nPuesto: " + puesto + ", \nSalario_Actual: " + salario + ", \nTotal_de_Empleados: " + totalEmpleados + " }\n";
    }

}
