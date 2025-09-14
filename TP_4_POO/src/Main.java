public class Main {

    public static void main(String[] args) {
        // Creación de los Objetos utilizando los distintos constructores
        Empleado emp01 = new Empleado("Juan Perez", "Tester");
        Empleado emp02 = new Empleado(12, "Jesica Flores", "Project Manager", 25000);
        Empleado emp03 = new Empleado("Robeto Garcia", "Developer");
        Empleado emp04 = new Empleado(4,"Rocio Gimenez", "Data Analytics",8800);
        
        // Uso del Método actualizarSalario()
        emp01.actualizarSalario(10);
        emp02.actualizarSalario(125);
        emp02.actualizarSalario(125.00);
        emp04.actualizarSalario(450.00);
        emp03.actualizarSalario(20);
        
        // Impresión en consola de la información de cada Empleado
        System.out.println(emp01);
        System.out.println(emp02);
        System.out.println(emp03);
        System.out.println(emp04);
        
        //Muestra de la cantidad de Empleados creados
        Empleado.mostrarTotalEmpleados();
        
        // Uso de Setter && Getters
        emp02.setId(2);
        System.out.println(emp02);
        System.out.println("ID_Empleado:"+emp03.getId());
        System.out.println(emp04);
        emp04.setSalario(12000);
        System.out.println(emp04.getSalario());
    }
    
}
