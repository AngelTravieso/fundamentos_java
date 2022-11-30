package test;

import domain.Persona;

public class TestMatrices {
    public static void main(String[] args) {
        
        // declarar matriz (arreglo bidimensional) [fila][columna]
        int edades[][] = new int[3][2];
        
//        System.out.println("edades = " + edades);
        
        // modificar valor de matriz para la posicion dada
        edades[0][0] = 5;
        edades[0][1] = 7;
        
        edades[1][0] = 8;
        edades[1][1] = 4;
        
        edades[2][0] = 12;
        edades[2][1] = 21;
        
        // acceder a los elementos (for)
//        System.out.println("edades [0][0] = " + edades[0][0]);
        
        // recorrer matriz con ciclo for anidado
        for(int i = 0; i < edades.length; i++) {
            for(int j = 0; j < edades[i].length; j++) {
                System.out.println("edades[" + i + "][" + j + "]" + " = " + edades[i][j] );
            }
        }
        
        // declarar e inicializar matriz (sintaxis resumida)
        String frutas[][] = {
            {"Naranja", "Limon"},
            {"Fresa", "Zarzamora", "Mora"}
        };
        
        imprimir(frutas);
        
        
        // matriz de tipo object
        Persona personas[][] = new Persona[2][3];
        
        personas[0][0] = new Persona("Angel");
        personas[0][1] = new Persona("Gustavo");
        imprimir(personas);
        
    }
       
    // pasar referencia al objeto que se se pasa (la matriz)
    public static void imprimir(Object matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("matriz[" + i + "][" + j + "]" + " = " + matriz[i][j]);
            }
        }
    }
    
}
