package TiposDeDatos;

/**
 *
 * @author oliver
 */
public class MainClass {
    public static void main(String[] args) {
         // Tipos de datos
        byte num = 100;
        short num2 = 3200;
        int num3 = 2000000;
        long num4 = 1213516516;
        float num5 = 1.2696516f; // se escribe una "F" al final para que identifíque que es float.
        double num6 = 1.956161919181;
        char caracter = 'a';
        boolean var = true; // o false

        System.out.println("byte: "+ num);
        System.out.println("short: "+ num2);
        System.out.println("int: "+ num3);
        System.out.println("long: "+ num4);
        System.out.println("float: "+ num5);
        System.out.println("double: "+ num6);
        System.out.println("char: "+ caracter);
        System.out.println("boolean: "+ var);
        
        // Conversión de tipos de datos implícita
        
        int dato1 = 1000;
        int dato2 = 100000;
        long resultado;
        resultado = dato1 * dato2;
        System.out.println("resultado = " + resultado);
        
        // Conversión de tipos de datos explícitas
        
        long datos1 = 10000;
        long datos2 = 1000000;
        int resultados;
        resultados = (int)(datos1 * datos2);
        System.out.println("resultados = " + resultados);
    }
}
