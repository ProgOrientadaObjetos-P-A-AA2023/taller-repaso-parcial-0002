package paquete002;

public class Ciudad {

    String nombreCiudad;

    public Ciudad(String nC) {
        nombreCiudad = nC;
    }

    public String obtenerNombreCiudad() {
        return nombreCiudad;
    }

    public void establecerNombreCiudad(String nC) {
        nombreCiudad = nC;
    }

    @Override
    public String toString() {
        String mensaje;

        mensaje = String.format("Nombre de Ciudad: %s\n", nombreCiudad);

        return mensaje;
    }

}
