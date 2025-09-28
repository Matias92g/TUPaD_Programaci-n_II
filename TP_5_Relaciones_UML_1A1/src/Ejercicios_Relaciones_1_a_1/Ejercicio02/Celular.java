package Ejercicios_Relaciones_1_a_1.Ejercicio02;

public class Celular {

    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria;
    private Usuario usuario;

    public Celular(String imei, String marca, String modelo) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        if (usuario != null && usuario.getCelular()!=(this)) {
            usuario.setCelular(this);
        }
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }
    

    @Override
    public String toString() {
        return "Celular{" + "imei=" + imei + ", marca=" + marca + ", modelo=" + modelo + ", bateria=" + bateria+ '}';
    }
    
    

}
