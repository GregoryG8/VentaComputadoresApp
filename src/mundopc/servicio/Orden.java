package mundopc.servicio;

import mundopc.modelo.Computador;

import java.util.ArrayList;
import java.util.List;

public class Orden {
    private final int idOrden;
    private final List<Computador> computadores;
    private static int contadorOrdenes;

    public Orden(){
        computadores = new ArrayList<>();
        this.idOrden = contadorOrdenes++;
    }

    public void agregarComputador(Computador computador){
        computadores.add(computador);
    }

    public void mostrarOrden(){
        System.out.println("Orden #" + idOrden);
        System.out.println("Total computadores: " + computadores.size());
        computadores.forEach(System.out::println);
    }

}
