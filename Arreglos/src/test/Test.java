package test;

public class Test {
   public static void main(String[] args) {
       // declarar arreglo de int
       // []edades
       
       // debemos indicar la cantidad de elementos que va a almacenar (3)
       // los arreglos no pueden crecer dinamicamente
       
       // longitud de un arreglo: n - 2
       
       int edades[] = new int[3]; // los arreglos heredan de la clase object, por eso se usa new
       
       System.out.println("edades: " + edades); // edades: [I@682a0b20
       
       // acceder a los elementos del arreglo [indice]
       edades[0] = 10;
       edades[1] = 15;
       edades[2] = 20;
       
//       System.out.println("edades 0 = " + edades[0]);
//       System.out.println("edades 2 = " + edades[1]);
//       System.out.println("edades 3 = " + edades[2]);
       
       // acceder a un elemento fuera del arreglo
       // esto dispara un error en tiempo de ejecucion
       // java.lang.ArrayIndexOutOfBoundsException = indice fuera del arreglo
//       edades[3] = 5;
        
        for(int i = 0; i < edades.length; i++) {
            System.out.println("edades: " + edades[i]);
        }
        
        
       
 
   } 
}
