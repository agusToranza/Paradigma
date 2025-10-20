package Mudanzas;

public class Heladera implements Pesable, Medible {

    private final int peso;
    private final int dimension;

    public Heladera(int peso, int dimension) {
        this.peso = peso;
        this.dimension = dimension;
    }

    @Override
    public int obtenerPeso() {
        return 0;
    }

    @Override
    public int obtenerVolumen() {
        return 0;
    }
}
