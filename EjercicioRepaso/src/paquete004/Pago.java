package paquete004;

public abstract class Pago {

    protected double pagos;

    public double obtenerValorPago() {
        return pagos;
    }

    public abstract void calcularValorPago();

}
