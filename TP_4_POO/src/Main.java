public class Main {

    public static void main(String[] args) {
        // Creación de los Objetos utilizando los distintos constructores
        Empleado emp01 = new Empleado("Juan Perez", "Tester");
        Empleado emp02 = new Empleado(12, "Jesica Flores", "Project Manager", 25000);
        Empleado emp03 = new Empleado("Robeto Garcia", "Developer");
        Empleado emp04 = new Empleado(4,"Rocio Gimenez", "Data Analytics",8800);
        System.out.println(emp01);
        System.out.println(emp02);
        System.out.println(emp03);
        emp01.actualizarSalario(10);
        System.out.println(emp01);
        emp02.actualizarSalario(125);
        emp02.actualizarSalario(125.00);
        System.out.println(emp02);
        Empleado.mostrarTotalEmpleados();
        emp02.setId(2);
        System.out.println(emp02);
        System.out.println(emp03.getId());
        System.out.println(emp04);
        emp04.setSalario(12000);
        System.out.println(emp04.getSalario());
    }
    
}