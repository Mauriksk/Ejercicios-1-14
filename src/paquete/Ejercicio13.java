package paquete;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ejercicio13 {
    public static void main(String[] args) {
        DateTimeFormatter formateaFecha = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("La hora actual es =>  "+formateaFecha.format(LocalDateTime.now()));


    }
}
