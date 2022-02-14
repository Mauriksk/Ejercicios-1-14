package paquete;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        int opcion;

    do {
        System.out.println("Ingresa el numero de dia correspondiente \n" +
                "1-Lunes \n" +
                "2-Martes \n" +
                "3-Miercoles \n" +
                "4-Jueves \n" +
                "5-Viernes \n" +
                "6-Sabado \n" +
                "7-Domingo \n"  );
        opcion = Integer.parseInt(scan.nextLine());
    }while ( opcion < 1 || opcion > 7 );

    switch (opcion){
        case 1: case 2: case 3: case 4: case 5:{
            System.out.println("El dia es laborable");
            break;
        }
        case 6: case 7:{
            System.out.println("El dia es libre");
            break;
        }
    }

    }
}
