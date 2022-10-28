package EjerciciosPropuestosEstructurasDeProgramacion;

import java.util.Scanner;

/**
 *
 * @author oliver
 */
public class Ejercicio1 {
    public static void main(String[] args) {
         // Algorimos para diferencias números pares e impares
       
        Scanner tc = new Scanner(System.in);
        
        // Variables
        
        byte num = 0;
        
        System.out.println("Ingrese el numero a evaluar");
        num = tc.nextByte();
        if(num < 0){
            System.out.println("Ingreso un numero negativo");
        }else {
            if(num % 2 == 0){
                System.out.println(num + " es Par!");
            }else {
                System.out.println(num + " es Impar!");
            }
        }
    }
}
