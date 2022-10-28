package EjerciciosPropuestosEstructurasDeProgramacion;

import java.util.Scanner;

/**
 *
 * @author oliver
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        
       int serie = 0, num1 = 0, num2 = 1, suma = 1;
       
        System.out.println("Serie de FIBONACCI");
        System.out.println("Ingrese el tamaño de la serie");
        serie = tc.nextInt();

        // Muestro el valor inicial
        System.out.println(num1);
         
        for (int i = 1; i < serie; i++) {
            // muestro la suma
            System.out.println(suma);
             
            //primero sumamos
            suma = num1 + num2;
            //Despues, cambiamos la segunda variable por la primera
            num1 = num2;
            //Por ultimo, cambiamos la suma por la segunda variable
            num2 = suma;
        }
        
    }
}
