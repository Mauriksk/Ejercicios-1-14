package paquete;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numero = Integer.parseInt(scan.nextLine());

        while ( numero <= 1000 ){
            System.out.println( "Numero de 2 en 2 al mil => "+ numero );
            numero+=2;
        }

    }
}
