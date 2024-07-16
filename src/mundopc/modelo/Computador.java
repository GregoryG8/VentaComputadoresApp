package mundopc.modelo;

public class Computador {
    private int idComputador;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private static int contadorComputadores;

    private Computador() {
        idComputador = contadorComputadores++;
    }

    public Computador(String nombre, Monitor monitor, Teclado teclado, Raton raton) {
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;

    }

    @Override
    public String toString() {
        return "Computador{" +
                "idComputador=" + idComputador +
                ", nombre='" + nombre + '\'' +
                "\n monitor=" + monitor +
                "\n teclado=" + teclado +
                "\n raton=" + raton +
                '}';
    }
}
