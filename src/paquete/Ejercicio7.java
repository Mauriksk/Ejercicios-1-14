package paquete;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        var scan = new Scanner(System.in);

        int numero;
        do {
            System.out.println("Ingresa un numero igual o superir a 0");
            numero = Integer.parseInt(scan.nextLine());
        }while ( numero < 0  );

        System.out.println("El numero " + numero + " es correcto.");
    }
}
