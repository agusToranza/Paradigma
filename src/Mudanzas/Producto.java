package Mudanzas;

public abstract class Producto {

    private final int peso;

    public Producto(int peso) {
        this.peso = peso;
    }

    public int obtenerPeso() {
        return this.peso;
    }

    public abstract int volumen();
}
