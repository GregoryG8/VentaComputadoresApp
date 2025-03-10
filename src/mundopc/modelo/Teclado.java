package mundopc.modelo;

public class Teclado extends DispositivoEntrada{
    private final int idTeclado;
    private static int contadorTeclado = 0;

    public Teclado(String tipoDeEntrada, String marca) {
        super(tipoDeEntrada, marca);
        idTeclado = ++contadorTeclado;
    }

    @Override
    public String toString() {
        return "Teclado{" +
                "idTeclado=" + idTeclado +
                "} " + super.toString();
    }
}
