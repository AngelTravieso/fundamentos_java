package ventas;

// importar todas las clases del paquete
import com.ventas.*;

public class Ventas {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Camisa", 50.00);
        Producto producto2 = new Producto("Pantalon", 100.00);
        
        Orden orden1 = new Orden();
        
        // agregar productos
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        
        // mostrar orden 1
        orden1.mostrarOrden();
        
        Producto producto3 = new Producto("Lentes", 25.62);
        
        Orden orden2 = new Orden();
        
        orden2.agregarProducto(producto3);
        orden2.agregarProducto(producto1);
        orden2.mostrarOrden();
        
    }   
}
