package mundopc;

import mundopc.modelo.Computador;
import mundopc.modelo.Monitor;
import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;
import mundopc.servicio.Orden;

public class VentaComputadoresApp {
    public static void main(String[] args) {
        Raton ratonLenovo = new Raton("bluetooth", "lenovo");
        //System.out.println(ratonLenovo);

        Teclado tecladoLenovo = new Teclado("bluetooth", "lenovo");
        //System.out.println(tecladoLenovo);

        Monitor monitorLenovo = new Monitor("Lenovo", 27);
        //System.out.println(monitorLenovo);


        Computador computadorLenovo = new Computador("Computadora Lenovo", monitorLenovo, tecladoLenovo, ratonLenovo);
        //System.out.println(computadorLenovo);

        Computador computadorDell = new Computador("Computadora Dell", monitorLenovo, tecladoLenovo, ratonLenovo);


        // se crea una orden

        Orden orden1 = new Orden();
        orden1.agregarComputador(computadorLenovo);
        orden1.agregarComputador(computadorDell);

        orden1.mostrarOrden();
    }

}