package paquete004;

import paquete002.Ciudad;

public class PagoLuzElectrica extends Pago {

    private double tarifaBase;
    private double kilovatiosConsumidos;
    private double costoKilovatio;
    private Ciudad ciudad;

    public PagoLuzElectrica(double tB, double kC, double cK, Ciudad c) {
        tarifaBase = tB;
        kilovatiosConsumidos = kC;
        costoKilovatio = cK;
        ciudad = c;
    }

    public double obtenerTarifaBase() {
        return tarifaBase;
    }

    public void establecerTarifaBase(double tB) {
        tarifaBase = tB;
    }

    public double obtenerKilovatiosConsumidos() {
        return kilovatiosConsumidos;
    }

    public void establecerKilovatiosConsumidos(double kC) {
        kilovatiosConsumidos = kC;
    }

    public double obtenerCostoKilovatio() {
        return costoKilovatio;
    }

    public void establecerCostoKilovatio(double cK) {
        costoKilovatio = cK;
    }

    public Ciudad obtenerCiudad() {
        return ciudad;
    }

    public void establecerCiudad(Ciudad c) {
        ciudad = c;
    }

    @Override
    public void calcularValorPago() {
        if (ciudad.obtenerNombreCiudad().equals("Loja")) {
            pagos = tarifaBase + (kilovatiosConsumidos * costoKilovatio / 2);

        } else {
            pagos = tarifaBase + (kilovatiosConsumidos * costoKilovatio);
        }

    }

    @Override
    public String toString() {
        if (ciudad.obtenerNombreCiudad().equals("Loja")) {
            return "El valor a pagar de la Luz Électrica de Loja es de: " + pagos;

        } else {
            return "El valor a pagar de la Luz Électrica es de: " + pagos;
        }

    }

}
