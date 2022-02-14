package paquete;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = scan.nextLine();
        frase = frase.replaceAll(" ","");
        String sinVocales = frase.replaceAll("(?i)(a|e|i|o|u)","");
        System.out.println("La longitud de la frase es de "+ frase.length()+ " palabras" +
                " y de estos "+ (frase.length()-sinVocales.length()) + " son vocales" );


    }
}
