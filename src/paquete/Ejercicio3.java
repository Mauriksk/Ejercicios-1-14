package paquete;

import java.util.Scanner;

import static java.lang.Math.PI;

public class Ejercicio3 {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        System.out.println("Caul es el radio del circulo?");
        Double radio =Double.parseDouble(scan.nextLine());
        Double area = (PI * Math.pow(radio,2));
        System.out.println("El area del circulo de radio "+ radio + " es de " + area);
    }
}
