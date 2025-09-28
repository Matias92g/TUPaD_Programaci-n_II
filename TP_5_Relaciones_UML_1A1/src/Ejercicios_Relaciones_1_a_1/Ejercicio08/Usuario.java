package Ejercicios_Relaciones_1_a_1.Ejercicio08;

public class Usuario {
    private String nombre;
    private String email;
    private FirmaDigital firmaDigital;

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public void setFirmaDigital(FirmaDigital firmaDigital) {
        this.firmaDigital = firmaDigital;
    }

    public FirmaDigital getFirmaDigital() {
        return firmaDigital;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", email=" + email + ", firmaDigital=" + firmaDigital + '}';
    }
    
}
