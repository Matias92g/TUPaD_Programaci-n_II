package Ejercicios_Relaciones_1_a_1.Ejercicio10;

public class Titular {

    private String nombre;
    private String dni;
    private CuentaBancaria cuentaBancaria;

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
        if (cuentaBancaria != null && cuentaBancaria.getTitular() != this){
            cuentaBancaria.setTitular(this);
        }
    }

    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Titular{");
        sb.append("nombre:").append(nombre);
        sb.append(", DNI:").append(dni);
        sb.append('}');
        return sb.toString();
    }



}
