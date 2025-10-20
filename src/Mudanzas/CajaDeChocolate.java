package Mudanzas;

public class CajaDeChocolate implements Pesable {

    private final int peso;

    public CajaDeChocolate(int peso) {
        this.peso = peso;
    }

    @Override
    public int obtenerPeso() {
        return this.peso;
    }
}

