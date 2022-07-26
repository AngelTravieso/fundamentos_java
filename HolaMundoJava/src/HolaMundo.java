
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
        /*
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
         */
        // Operadores de asignacion
        /*
        int a = 3, b = 2;
        int c = a + 5 - b;
        
        System.out.println("c = " + c);
        
        a += 1; // a = a +1
        
        System.out.println("a = " + a);
        
        
        a += 3; // a = a + 3
        System.out.println("a = " + a);
        
        a -= 2; // a = a - 2
        System.out.println("a = " + a);
        
        // *= , /= , %=
        a *= 2;
        System.out.println("a = " + a);
        
        a /= 2;
        System.out.println("a = " + a);
        
        a %= 2;
        System.out.println("a = " + a);
         */
 /*
        // Operadores unarios
        var a = 3;
        var b = -a;
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        var c = true;
        var d = !c;
        
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        
        // incremento
        // 1. Preincremento (simbolo antes de la variable)
        var e = 3;
        // tambien modifica el valor original (e = 4)
        var f = ++e; // Primero se incrementa la variable y despues se usa
        
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        
        // 2. Postincremento (simbolo despues de la variable)
        var g = 5;
        var h = g++; // Primero se usa y despues se incrementa
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        
        // decremento
        // 1. Predecremento
        var i = 2;
        var j = --i;
        
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        
         // 2. Postdecremento
         
         var k = 4;
         var l = k--; // Primero se usa el valor y queda pendiente el decremento
         
         System.out.println("k = " + k); // Tenia pendiente un decremento
         System.out.println("l = " + l); 
         */
        // Operadores de Igualdad y Relacionales
        /*
        var a = 3;
        var b = 2;

        // Igualdad
        var c = (a == b);
        System.out.println("c = " + c);

        // Diferente
        var d = (a != b);
        System.out.println("d = " + d);

        // Comparar cadenas
        var cadena = "Hola";
        var cadena2 = "Hola";

        // Compara referencias de objetos
        var e = cadena == cadena2;
        System.out.println("e = " + e);

        // Comparar contenido de la cadena
        var f = cadena.equals(cadena2);
        System.out.println("f = " + f);

        // Operadores relacionales
        // > , <, >=, <=
        var g = a > b;
        System.out.println("g = " + g);

        if (a % 2 == 0) {
            System.out.println("Es numero par");
        } else {
            System.out.println("Es numero impar");
        }
        
        var edad = 30;
        var adulto = 18;
        
        if(edad >= adulto) {
            System.out.println("Es un adulto");
        } else {
            System.out.println("Es menor de edad");
        }
         */
        // Operadores condicionales
        // &&, ||
        /*
        var a = 10;
        var valorMinimo = 0;
        var valorMaximo = 10;

        var resultado = (a >= valorMinimo) && (a <= valorMaximo);

        if (resultado) {
            System.out.println("Dentro de rango");
        } else {
            System.out.println("Fuera de rango");
        }
        
        var vacaciones = false;
        var diaDescanso = false;
        
        if(vacaciones || diaDescanso) {
            System.out.println("Padre puede asistir al juego del hijo");
        } else {
            System.out.println("El padre esta ocupado");
        }*/
        // Operador ternario    
        /*
        var resultado = ( 3 > 2 ) ? "verdadero" : "falso" ;
        System.out.println("resultado = " + resultado);
        
        var numero = 8;
        resultado = ( numero % 2 == 0 ) ? "Es par" : "Es impar";
        System.out.println("resultado = " + resultado);
         */
        // Precedencia de operadores
        /*
        var x = 5;
        var y = 10;
        var z = ++x + y--;
        
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        
        var resultado = 4 + 5 * 6 / 3;
        
        System.out.println("resultado = " + resultado);
        
        resultado = ( 4 + 5 ) * 6 / 3;
        
        System.out.println("resultado = " + resultado);*/
        // Ejercicio: Calcular el area y perimetro de un rectangulo
        /*
        Scanner console = new Scanner(System.in);
        
        System.out.println("Proporciona el alto: ");
        
        double alto = Double.parseDouble(console.nextLine());
        
        System.out.println("Proporciona el ancho: ");
        
        double ancho = Double.parseDouble(console.nextLine());
        
        var area = alto * ancho;
        var perimetro = (alto +  ancho ) * 2;
        
        System.out.println("Area = " + area);
        System.out.println("Perimetro = " + perimetro);
         */
        // Ejercicio: EL mayor de 2 numeros
        /*
        Scanner console = new Scanner(System.in);
        
        System.out.println("Proporciona el numero1: ");
        
        int numero1 = Integer.parseInt(console.nextLine());
        
        System.out.println("Proporciona el numero2: ");
        
        int numero2 = Integer.parseInt(console.nextLine());
        
        if(numero1 > numero2) {
            System.out.println("El numero " + numero1 + " es mayor");
        } else {
            System.out.println("El numero " + numero2 + " es mayor");
        }*/
        // If - else
        /*
        var condicion = false;

        if (condicion) {
            System.out.println("Condicion verdadera");
        } else {
            System.out.println("Condicion falsa");
        }
        
        var numero = 2;
        var numeroTexto = "Numero desconocido";
        
        if(numero == 1) {
            numeroTexto = "Numero uno";
        } else if(numero == 2) {
            numeroTexto = "Numero dos";
        } else if (numero == 3) {
            numeroTexto = "Numero tres";
        } else if (numero == 4) {
            numeroTexto = "Numero cuatro";
        } else {
            numeroTexto = "Numero no encontrado";
        }
        
        System.out.println("numeroTexto = " + numeroTexto);
         */
        // Ejercicio calculo del año con if - else
        /*
        Scanner console = new Scanner(System.in);
        
        System.out.println("Ingrese el mes: ");
        
        var mes = Integer.parseInt(console.nextLine());
        
        //var mes = 1;
        var estacion = "Estacion desconocida";
        
        if(mes == 1 || mes == 2 || mes == 12) {
            estacion = "invierno";
        } else if (mes == 3 || mes == 4 || mes == 5) {
            estacion = "primavera";
        } else if (mes == 6 || mes == 7 || mes == 8) {
            estacion = "verano";
        } else if(mes == 9 || mes == 10 || mes == 11) {
            estacion = "otoño";
        }
        
        System.out.println("Estas en " + estacion + "...");
         */
        // Switch
        /*
        var numero = 2;
        var numeroTexto = "Desconocido";
        
        switch( numero ) {
                
            case 1:
                numeroTexto = "Numero uno";
                break;
            case 2:
                numeroTexto = "Numero dos";
                break;
            case 3:
                numeroTexto = "Numero tres";
                break;
            case 4:
                numeroTexto = "Numero cuatro";
                break;
            default:
                numeroTexto = "Caso no encontrado";
         
        }
        
        System.out.println("numeroTexto = " + numeroTexto);
         */
        // Ejercicio: Calculo estacion del año con switch
        // var mes = 1;
        /*
        Scanner console = new Scanner(System.in);
        
        System.out.println("Ingrese un mes: ");
        
        var mes = Integer.parseInt(console.nextLine());
        
        var estacion = "Estacion desconocida";
        
        switch( mes ) {
            case 1: case 2: case 12:
                estacion = "Invierno";
                break;
            case 3: case 4: case 5:
                estacion = "Primavera";
                break;
            case 6: case 7: case 8:
                estacion = "Verano";
                break;
            case 9: case 10: case 11:
                estacion = "Otonio";
                break;
        }
        
        System.out.println("estacion = " + estacion);
         */
        // Ejercicio: Sistema de calificaciones
        /*
        Scanner console = new Scanner(System.in);
        
        System.out.println("Proporciona un valor entre 0 y 10:");
        
        var calificacion = Integer.parseInt(console.nextLine());
        var nota = "Desconocida";
        
        if(calificacion <= 6) {
            nota = "F";
        } else if (calificacion >= 6 && calificacion <= 7) {
            nota = "D";
        } else if (calificacion >= 7 && calificacion <= 8) {
            nota = "C";
        } else if (calificacion >= 8 && calificacion <= 9) {
             nota = "B";
        } else if (calificacion >= 9 && calificacion <= 10) {
            nota = "A";
        }
        
        System.out.println("Su nota es " + nota + "...");     
         */
 /*
        // Ciclos: while
        var contador = 0;
        
        while( contador < 3 ) {
            System.out.println("contador = " + contador);
            contador++;
        }
         */
        // Ciclos: Do while
        /*
        var contador = 0;
        
        do {
            System.out.println("contador = " + contador);
            contador++;
        } while ( contador < 3);
         */
        
        // Ciclos: for
        inicio:
        for(var contador = 0; contador < 3 ; contador++) {
            if( contador % 2 == 0) {
                System.out.println("contador = " + contador);
                continue inicio; // ir a la siguiente iteracion
            }
            
        }
        
//        for(var contador = 0; contador < 3 ; contador++) {
//            if( contador % 2 == 0) {
//                System.out.println("contador = " + contador);
//                break;
//            }
//        }
        
        
        
        
        
    }

}
