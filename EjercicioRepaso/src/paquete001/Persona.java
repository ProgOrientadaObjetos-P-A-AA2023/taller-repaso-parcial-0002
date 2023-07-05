package paquete001;

import paquete002.Ciudad;

public class Persona {

    String nombre;
    String apellido;
    int edad;
    String cedula;
    public Ciudad ciudad;

    public Persona(String n, String a, int e, String ce, Ciudad ci) {
        nombre = n;
        apellido = a;
        edad = e;
        cedula = ce;
        ciudad = ci;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public void establecerApellido(String a) {
        apellido = a;
    }

    public int obtenerEdad() {
        return edad;
    }

    public void establecerEdad(int e) {
        edad = e;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public void establecerCedula(String ce) {
        cedula = ce;
    }

    public Ciudad obtenerCiudad() {
        return ciudad;
    }

    public void establecerCiudad(Ciudad ci) {
        ciudad = ci;
    }
 @Override
    public String toString(){
        return String.format("Nombre: %s - Apellido %s - Edad %d - Cedula %s", 
                obtenerNombre(), obtenerApellido(), obtenerEdad(),obtenerCedula());
    }
}
