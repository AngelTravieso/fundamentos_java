package test;

// Importa todas las clases del paquete
//import mx.com.globalmentoring.*;
// import mx.com.globalmentoring.Utileria;

// utilizar un atributo o metodo estatico de una clase
import static mx.com.globalmentoring.Utileria.imprimir;



public class TestUtileria {
    public static void main(String[] args) {
        // llamada a metodo estatico
       // Utileria.imprimir("Saludos");
       
       // import static
       // imprimir("Adios");
       
       // llama con nombre calificado (no recomendable - confusion)
       mx.com.globalmentoring.Utileria.imprimir("Hola Mundo");
       
    }
}
