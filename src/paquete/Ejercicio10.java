package paquete;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        String frase = scan.nextLine();
        frase = frase.replaceAll(" ","");
        System.out.println(frase);

    }
}
