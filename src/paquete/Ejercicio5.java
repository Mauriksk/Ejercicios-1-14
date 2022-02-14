package paquete;

public class Ejercicio5 {
    public static void main(String[] args) {
        int i = 0;

        while (i< 200){
            if(i < 100 && i%2 == 1){
                System.out.println("Numeros Inpares del 1 al 100 => " + i);
            }
            else if(i > 100 && i <= 200 && i%2 == 0 ){
                System.out.println("Numeros Pares del 1 al 100 => " + (i-100));
            }
            i++;
        }
    }
}//usar un ciclo solo o puedo usar 2 ? ??
