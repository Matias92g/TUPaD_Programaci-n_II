package tp_8_interfaces_y_exeptions.Parte_01;
//Implementa Pago y PagoConDescuento porque puede pagar y tener descuento

public class TarjetaCredito implements Pago, PagoConDescuento {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con tarjeta realizado. Monto final: $" + monto);
    }

    @Override
    public double aplicarDescuento(double monto) {
        return monto * 0.90; //10% de descuento
    }
}
