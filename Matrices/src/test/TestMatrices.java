package test;

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
        
        
        
    }
}
