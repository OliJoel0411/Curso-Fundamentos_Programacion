package EjerciciosPropuestosEstructurasDeProgramacion;

import java.util.Scanner;

/**
 *
 * @author oliver
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        //Variables
        int base = 3, exponente = 3;
        int result = 1;
        
        System.out.println("Calculadora de Potencias");
        System.out.println("Ingrese la base");
        base = tc.nextInt();
        System.out.println("Ingrese el exponente");
        exponente = tc.nextInt();
        while (exponente != 0) {
            result = result * base;
            exponente--;
        }
        System.out.println("Resulto =  " + result);
             
    }
}
