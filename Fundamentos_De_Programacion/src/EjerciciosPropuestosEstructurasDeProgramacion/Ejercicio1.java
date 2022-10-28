/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosPropuestosEstructurasDeProgramacion;

import java.util.Scanner;

/**
 *
 * @author olive
 */
public class Ejercicio1 {
    public static void main(String[] args) {
         // Algorimos para diferencias números pares e impares
       
        Scanner tc = new Scanner(System.in);
        
        // Variables
        
        byte num = 0;
        
        System.out.println("Ingrese el numero a evaluar");
        tc.nextByte(num);
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
