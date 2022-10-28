package EjerciciosPropuestosEstructurasDeProgramacion;

import java.util.Scanner;

/**
 *
 * @author oliver
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        
        //Variables 
        
        int n;
        int factorial = 1;
       
        
        System.out.println("Calculemos el factorial de un numero");
        System.out.println("Ingrese un numero");
        n = tc.nextInt();
        if(n == 0){
            System.out.println("El factorial de: " + n + " es: 1");
        }else if(n == 1 || n == 2){
            System.out.println("El factorial de: " + n + " es: " + n);
        }else {
            for (int i = n; i > 0; i--) {
                factorial = factorial*i;
            }
        }
        System.out.println(factorial);
    }
}
