package Ejercicios_Dependencia_Uso.Ejercicio12;

public class Impuesto {
    private int monto;
    private Contribuyente contribuyente;

    public Impuesto(int monto) {
        this.monto = monto;
    }

    public void setContribuyente(Contribuyente contribuyente) {
        this.contribuyente = contribuyente;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Impuesto{");
        sb.append("monto=").append(monto);
        sb.append(", contribuyente=").append(contribuyente);
        sb.append('}');
        return sb.toString();
    }
    
}
