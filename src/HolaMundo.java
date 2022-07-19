
import java.util.Scanner;

// Mi clase en Java
public class HolaMundo {

    public static void main(String args[]) {
        /*   
        // Declaracion de variable entera
        int miVariableEntera = 10;
           
        // Imprimir
        System.out.println(miVariableEntera);
        
        // Reasignación
        miVariableEntera = 5;
        System.out.println(miVariableEntera);
        
        
        // Declaración de variable string
        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);
        
        
        miVariableCadena = "Adios";
        System.out.println(miVariableCadena);
        
        
        // var - Inferencia de tipos en Java (a partir del JDK 10)
        var miVariableEntera2 = 15;
        System.out.println(miVariableEntera2);
        
        
        var miVariableCadena2 = "Nueva Cadena";
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        
        
        // Valores permitidos en el nombre de variables
        var miVariable = 1;
        var _miVariable = 2;
        var $miVariable = 3;
        
        // var áVariable = 10; No se recomienda utilizar
        // var #miVariable = 2; No se permite utilizar caracteres especiales
         */

 /*
        var usuario = "Juan";
        var titulo = "Ingeniero";

        var union = usuario + " " + titulo;
        System.out.println("union = " + union);
        
        
        var i = 3;
        var j = 4;
        
        System.out.println(i + j); // se realiza la suma de numeros
        
        System.out.println(i + j + usuario); // se suma y concatena
        
        System.out.println(usuario + i + j); // se concatenan (contexto cadena)
        
        // El parentesis suma las variables, en vez de concatenarlas
        System.out.println(usuario + (i + j));
         */
 /*
        var nombre = "Karla";

        System.out.println("Nueva linea: \n " + nombre);
        System.out.println("Tabulador: \t" + nombre);
        System.out.println("Retroceso: \b\b" + nombre);
        System.out.println("Comilla simple: '" + nombre + "'");
        System.out.println("Comilla doble: \"" + nombre + "\"");
         */
 /*
        System.out.println("Escribe tu nombre: ");
        
        // Clase escanear para leer informacion de la consola
        Scanner consola = new Scanner(System.in);
        
        // El programa se detiene hasta que el programa escribe en la consola
        var usuario = consola.nextLine();
        System.out.println("usuario = " + usuario);
        
        System.out.println("Escribe el titulo: ");
        
        var titulo = consola.nextLine();
        System.out.println("Resultado = " + titulo + " " + usuario);
         */
 /*
 
           
         Scanner consola = new Scanner(System.in);
         
         System.out.println("Proporciona el titulo:");
         
         var titulo = consola.nextLine();
         
         System.out.println("Proporciona el autor");
         
         var autor = consola.nextLine();
         
         System.out.println(titulo + " fue escrito por " + autor);

         */
 /*
 tipos primitivos enteros: byte, short, int, long
         */
 
 
        // -128 a 127
        byte numeroByte = (byte)129;
        System.out.println("Valor byte: " + numeroByte);
        System.out.println("Valor minimo byte = " + Byte.MIN_VALUE);
        System.out.println("Valor maximo byte = " + Byte.MAX_VALUE);
        
        // -32768 a 32767
        short numeroShort = (short)32768;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Valor minimo short = " + Short.MIN_VALUE);
        System.out.println("Valor maximo short = " + Short.MAX_VALUE);
        
        // -2147483648 a 2147483647
        // agregar "L" para convetir a literal de tipo "long"
        int numeroInt = (int)2147483648L;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Valor minimo int = " + Integer.MIN_VALUE);
        System.out.println("Valor maximo int = " + Integer.MAX_VALUE);
        
       
        // -9223372036854775808 a 9223372036854775807
        // agregar "D" para convetir a literal de tipo "double"
        // agregar "F" para convetir a literal de tipo "float"
        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
            System.out.println("Valor minimo long = " + Long.MIN_VALUE);
        System.out.println("Valor maximo long = " + Long.MAX_VALUE);
        
        
        
        
        
        
         
         
 
 
    }

}
