package Ejercicios_Relaciones_1_a_1.Ejercicio10;

public class ClaveSeguridad {
    private String codigo;
    private String ultimaModificacion;
    private CuentaBancaria cuentaBancaria;

    public ClaveSeguridad(String codigo, String ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }

    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ClaveSeguridad{");
        sb.append("codigo=").append(codigo);
        sb.append(", ultimaModificacion=").append(ultimaModificacion);
        sb.append(", cuentaBancaria=").append(cuentaBancaria);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
