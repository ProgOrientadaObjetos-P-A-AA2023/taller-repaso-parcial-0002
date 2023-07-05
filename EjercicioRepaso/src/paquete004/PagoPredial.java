package paquete004;

public class PagoPredial extends Pago {

    double valorPropiedad;
    private double porcentaje;

    public PagoPredial(double vP, double p) {
        valorPropiedad = vP;
        porcentaje = p;
    }

    public double obtenerValorPropiedad() {
        return valorPropiedad;
    }

    public void establecerValorPropiedad(double vP) {
        valorPropiedad = vP;
    }

    public double obtenerPorcentaje() {
        return porcentaje;
    }

    public void establecerPorcentaje(double p) {
        porcentaje = p;
    }

    @Override
    public void calcularValorPago() {
        pagos = valorPropiedad - ((valorPropiedad * porcentaje) / 100);
    }

    @Override
    public String toString() {
        return "El valor a pagar del Agua Potable Casa es de: " + pagos;

    }

}
