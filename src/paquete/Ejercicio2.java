package paquete;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        var scan = new Scanner(System.in);

        System.out.println("Ingresa el valor X");
        int x =Integer.parseInt(scan.nextLine());

        System.out.println("Ingresa el valor y");
        int y = Integer.parseInt(scan.nextLine());



        if ( x > y ) {
            System.out.println("Y es mayor que x");
        }else if( x == y ){
            System.out.println("X es igual a Y");
        }
        else {
            System.out.println("X es menor que Y");
        }
    }

}
