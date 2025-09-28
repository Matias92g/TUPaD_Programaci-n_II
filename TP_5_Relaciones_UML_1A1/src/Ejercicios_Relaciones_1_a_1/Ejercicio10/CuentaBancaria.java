package Ejercicios_Relaciones_1_a_1.Ejercicio10;

public class CuentaBancaria {

    private String cbu;
    private double saldo;
    private Titular titular;
    private ClaveSeguridad claveSeguridad;

    public CuentaBancaria(String cbu, double saldo, String codigo, String ultimaModificacion) {
        this.cbu = cbu;
        this.saldo = 0.00; // Inicializa la cuenta con saldo = $0.00.
        this.claveSeguridad = new ClaveSeguridad(codigo, ultimaModificacion);
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getCuentaBancaria() != this) {
            titular.setCuentaBancaria(this);
        }
    }

    public Titular getTitular() {
        return titular;
    }

    public ClaveSeguridad getClaveSeguridad() {
        return claveSeguridad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CuentaBancaria{");
        sb.append("cbu=").append(cbu);
        sb.append(", saldo=").append(saldo);
        sb.append(", titular=").append(titular);
        sb.append('}');
        return sb.toString();
    }
    

}
