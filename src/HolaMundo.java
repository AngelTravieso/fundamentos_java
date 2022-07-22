
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
 /*
 
 
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
 
         */
 /* 
 tipos primitivos de tipo flotante: float y double
         */
        // 1.4E-45 a 3.4028235E38
        /*
        float numeroFloat = (float) 3.4028236E38D;
        System.out.println("numeroFloat = " + numeroFloat);

        System.out.println("Valor minimo tipo float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo tipo float: " + Float.MAX_VALUE);
         */
        // 4.9E-324 a 1.7976931348623157E308
        /*
        double numeroDouble = 1.7976931348623157E308;
        System.out.println("numeroDouble = " + numeroDouble);

        System.out.println("Valor minimo tipo double: " + Double.MIN_VALUE);
        System.out.println("Valor maximo tipo double: " + Double.MAX_VALUE);
         */
 /*
        
        var numeroEntero = 10;
        System.out.println("numeroEntero = " + numeroEntero);
        
           
        var numeroDouble = 10.0;
        System.out.println("numeroDouble = " + numeroDouble);
        
        var numeroFloat = 10.0F;
        System.out.println("numeroFloat = " + numeroFloat);
         */
 /*
        // 16bits
        char miCaracter = 'a';
        System.out.println("miCaracter = " + miCaracter);

        // codigo Unicode
        char varChar = '\u0021';
        System.out.println("varChar = " + varChar);

        // codigo decimal del caracter
        char varCharDecimal = 33;
        System.out.println("varCharDecimal = " + varCharDecimal);

        // directamente
        char varCharSimbolo = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo);

        // codigo Unicode
        var varChar1 = '\u0021';
        System.out.println("varChar1 = " + varChar1);

        // codigo decimal del caracter
        // con var imprime el valor literal
        // si se quiere el simbolo se hace un cast (char)33
        var varCharDecimal2 = 33;
        System.out.println("varCharDecimal2 = " + varCharDecimal2);

        // directamente
        var varCharSimbolo3 = '!';
        System.out.println("varCharSimbolo3 = " + varCharSimbolo3);

        // Esto imprime el codigo decimal asociado al simbolo
        int variableEnteraSimbolo = '!';
        System.out.println("variableEnteraSimbolo = " + variableEnteraSimbolo);

        int letra = 'a';
        System.out.println("letra = " + letra);
         */
 /*
 tipos primitivos booleanos
         */
 /*
         boolean varBoolean = false;
         System.out.println("varBoolean = " + varBoolean);
         
         if(varBoolean) {
             System.out.println("La bandera es verdadera");
         } else {
             System.out.println("La bandera es falsa");
         }
         
         var edad = 30;
         // var esAdulto = edad >= 18;
         
         if( edad >= 18 ) {
             System.out.println("Eres mayor de edad");
         } else {
             System.out.println("Eres menor de edad");
         }*/
        // Conversion de tipos primitivos en Java
        // Convertir tipo String a un tipo int
        /*
        var edad = Integer.parseInt("20");
        // var edad = "20";
        System.out.println("edad = " + (edad + 1));

        var valorPi = Double.parseDouble("3.1416");
        System.out.println("valorPi = " + valorPi);

        // Pedir un valor
        var consola = new Scanner(System.in);
//        System.out.println("Proporciona tu edad:");
//        edad = Integer.parseInt( consola.nextLine() );
//        System.out.println("edad = " + edad);

        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);

        // Recuperar caracter de una cadena
        var caracter = "hola".charAt(1);
        System.out.println("caracter = " + caracter);

        System.out.println("Proporciona un caracter:");
        caracter = consola.nextLine().charAt(0);

        System.out.println("caracter = " + caracter);
         */
 /*
        Scanner consola = new Scanner(System.in);
        
        System.out.println("Proporciona el nombre:");
        var nombre = consola.nextLine();
        
        System.out.println("Proporciona el id:");
        var id = Integer.parseInt(consola.nextLine());
        
        System.out.println("Proporciona el precio:");
        var precio = Double.parseDouble(consola.nextLine());
        
        System.out.println("Proporciona el envio gratuito:");
        var envio = Boolean.parseBoolean(consola.nextLine());
        
        System.out.println(nombre + " #" + id);
        System.out.println("Precio: $" + precio);
        System.out.println("Envio Gratuito: " + envio);
         */
        // Operadores aritméticos en Java
        
        int a = 3, b = 2;
        var resultado = a + b;
        
        System.out.println("suma = " + resultado);
        
        resultado = a - b;
        System.out.println("resta = " + resultado);
        
        resultado = a * b;
        System.out.println("multiplicacion = " + resultado);
        
        // 3.0, 3F, 3D
        var resultado2 = 3D / b;
        System.out.println("division = " + resultado2);
        
        resultado = a % b;
        System.out.println("resto = " + resultado);
        
        if( a % 2 == 0)
            System.out.println("Es numero par");
        else
            System.out.println("Es numero impar");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
                
        
    }

}
