package mundopc;

import com.mundopc.*;

public class MundoPC {

    public static void main(String[] args) {
        // computadora 1
        Monitor monitorHP = new Monitor("HP", 13);
        Teclado tecladoHP = new Teclado("bluetooth", "HP");
        Raton ratonHP = new Raton("bluetooth", "HP");
        Computadora computadoraHP = new Computadora(
                "Computadora HP",
                monitorHP,
                tecladoHP,
                ratonHP
        );

        // computadora 2
        Monitor monitorGamer = new Monitor("Gamer", 34);
        Teclado tecladoGamer = new Teclado("bluetooth", "Gamer");
        Raton ratonGamer = new Raton("bluetooth", "Gamer");
        Computadora computadoraGamer = new Computadora(
                "Computadora Gamer",
                monitorGamer,
                tecladoHP,
                ratonGamer
        );

        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);

        orden1.mostrarOrden();

    }
}
