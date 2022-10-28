package EjerciciosPropuestosEstructurasDeProgramacion;

import java.util.Scanner;

/**
 *
 * @author oliver
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        
        //Variables
        int contador,i,numero;
 
        System.out.print("Ingresa un numero: ");
        numero = tc.nextInt();
 
        contador = 0;
        // Si hay mas de dos divisiones que den 0 no es primo
        
        for(i = 1; i <= numero; i++){
            if((numero % i) == 0){
                contador++;
            }
        }
        if(contador <= 2){
            System.out.println("El numero es primo");
        }else{
            System.out.println("El numero no es primo");
        }
    }
}
