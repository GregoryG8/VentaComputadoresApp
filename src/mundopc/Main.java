package mundopc;

import mundopc.modelo.Computador;
import mundopc.modelo.Monitor;
import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;

public class Main {
    public static void main(String[] args) {
        Raton ratonLenovo = new Raton("bluetooth", "lenovo");
        System.out.println(ratonLenovo);

        Teclado tecladoLenovo = new Teclado("bluetooth", "lenovo");
        System.out.println(tecladoLenovo);

        Monitor monitorLenovo = new Monitor("Lenovo", 27);
        System.out.println(monitorLenovo);


        Computador computadorLenovo = new Computador("Computadora Lenovo", monitorLenovo, tecladoLenovo, ratonLenovo);
        System.out.println(computadorLenovo);
    }

}