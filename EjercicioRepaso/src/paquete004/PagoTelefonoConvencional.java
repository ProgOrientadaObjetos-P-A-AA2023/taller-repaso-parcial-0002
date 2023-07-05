package paquete004;

public class PagoTelefonoConvencional extends Pago {

    double tarifa;
    double minutosConsumidos;
    double costoMinuto;

    public PagoTelefonoConvencional(double t, double mC, double cM) {
        tarifa = t;
        minutosConsumidos = mC;
        costoMinuto = cM;
    }

    public double obtenerTarifa() {
        return tarifa;
    }

    public void establecerTarifa(double t) {
        tarifa = t;
    }

    public double obtenerMinutosConsumidos() {
        return minutosConsumidos;
    }

    public void establecerMinutosConsumidos(double mC) {
        minutosConsumidos = mC;
    }

    public double obtenerCostoMinuto() {
        return costoMinuto;
    }

    public void establecerCostoMinuto(double cM) {
        costoMinuto = cM;
    }

    @Override
    public void calcularValorPago() {
        pagos = tarifa + (minutosConsumidos * costoMinuto);
    }

    @Override
    public String toString() {
        return "El valor a pagar del Tel+efono Convencional es de: " + pagos;

    }

}
