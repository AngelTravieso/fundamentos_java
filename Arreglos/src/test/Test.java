package test;

public class Test {
   public static void main(String[] args) {
       // declarar arreglo de int
       // []edades
       
       // debemos indicar la cantidad de elementos que va a almacenar (3)
       // los arreglos no pueden crecer dinamicamente
       
       int edades[] = new int[3]; // los arreglos heredan de la clase object, por eso se usa new
       
       System.out.println("edades: " + edades); // edades: [I@682a0b20
       
       // acceder a los elementos del arreglo [indice]
       edades[0] = 10;
       
       System.out.println("edades 0 = " + edades[0]);
       
   } 
}
