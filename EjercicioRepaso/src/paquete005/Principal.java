package paquete005;

import java.util.Scanner;
import paquete001.Persona;
import paquete002.Ciudad;
import paquete003.BilleteraPagos;

public class Principal {

    public static void main(String[] args) {
        BilleteraPagos pago = new BilleteraPagos();
        System.out.println(pago);
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        System.out.println("Ingrese nombre");
        String n = entrada.nextLine();
        System.out.println("Ingrese apellido");
        String ap = entrada.nextLine();
        System.out.println("Ingrese edad");
        int edad = entrada.nextInt();
        System.out.println("Ingrese su N~Cedula");
        String ced = entrada.nextLine();
        System.out.println("Ingrese su Ciudad");
        String ciudad = entrada.nextLine();

        entrada.nextLine();
        Ciudad c = new Ciudad(ciudad);
        Persona per = new Persona(n, ap, edad, ced, c);
        while (bandera) {

            System.out.println("Que pago desea realizar?");
            System.out.println("1. Pago Agua Potable");
            System.out.println("2. Pago Luz Electrica");
            System.out.println("3. Pago Predial");
            System.out.println("4. Pago Telefono Convencional");
            int option = entrada.nextInt();
            System.out.println("Desea salir, pulse S");
            String opcion = entrada.nextLine();
            if (opcion.equals("S")) {
                bandera = false;
            }
        }
    }
}
