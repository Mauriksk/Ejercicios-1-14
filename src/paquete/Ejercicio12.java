package paquete;

import java.util.Scanner;



public class Ejercicio12 {
    public static void main(String[] args) {

        //No puedo hacerlo que funcione en todos los casos

        Scanner scan = new Scanner(System.in);
        System.out.println("Escribe una palabra");
        String primeraPalabra = scan.nextLine();
        System.out.println("Escribe una segunda palabra");
        String segundaPalabra = scan.nextLine();


        String palabraMasGrande = ( primeraPalabra.length() > segundaPalabra.length() )? primeraPalabra : segundaPalabra;


        String palabraMasChica = ( primeraPalabra.length() < segundaPalabra.length() )? primeraPalabra : segundaPalabra;

        String enEstoSonDiferentes = palabraMasGrande.replaceAll(palabraMasChica, "");
        System.out.println(enEstoSonDiferentes);

    }
}
