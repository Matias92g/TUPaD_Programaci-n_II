package tp_8_interfaces_y_exeptions.Parte_01;

public class PayPal implements Pago {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago vía PayPal realizado. Monto: $" + monto);
    }
}
