package paquete;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        Double precio = Double.parseDouble(scan.nextLine());
        Double calcularIva = (precio / 100)*121;
        System.out.println("El precio de su producto mas iva incluido es " + calcularIva);
    }
}
