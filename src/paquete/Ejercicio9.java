package paquete;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        var scan = new Scanner(System.in);
        String frase = "La sonrisa sera la mejor arma contra la tristeza ";
        frase = frase.replaceAll("a","e");
        System.out.println("Ingresa una continuacion de la frase => La sonrisa sera la mejor arma contra la tristeza");
        String fraseCapturada = scan.nextLine();

        System.out.println( frase + fraseCapturada );
    }
}
