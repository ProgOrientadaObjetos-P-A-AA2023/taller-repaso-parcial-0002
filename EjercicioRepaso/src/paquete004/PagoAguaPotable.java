package paquete004;

public class PagoAguaPotable extends Pago {

    private double tarifaFija;
    private double metrosCubicosConsumo;
    private double costoConsumoCubicos;
    private String tipo;

    public PagoAguaPotable(double tF, double mCC, double cCC, String t) {
        tarifaFija = tF;
        metrosCubicosConsumo = mCC;
        costoConsumoCubicos = cCC;
        tipo = t;
    }


    public double obtenerTarifaFija() {
        return tarifaFija;
    }

    public void establecerTarifaFija(double tF) {
        this.tarifaFija = tF;
    }

    public double obtenerMetrosCubicosConsumo() {
        return metrosCubicosConsumo;
    }

    public void establecerMetrosCubicosConsumo(double mCC) {
        this.metrosCubicosConsumo = mCC;
    }

    public double obtenerCostoConsumoCubicos() {
        return costoConsumoCubicos;
    }

    public void establecerCostoConsumoCubicos(double cCC) {
        this.costoConsumoCubicos = cCC;
    }

    public String obtenerTipo() {
        return tipo;
    }

    public void establecerTipo(String t) {
        this.tipo = t;
    }

    @Override
    public void calcularValorPago() {
        if (tipo.equals("comercial")) {
            pagos = tarifaFija + (metrosCubicosConsumo * costoConsumoCubicos) + 15;

        } else {
            pagos = tarifaFija + (metrosCubicosConsumo * costoConsumoCubicos);
        }

    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        if (tipo.equals("comercial")) {
            return "El valor a pagar del Agua Potable Comercial es de: " + pagos;

        } else {
            return "El valor a pagar del Agua Potable Casa es de: " + pagos;
        }

    }



}
