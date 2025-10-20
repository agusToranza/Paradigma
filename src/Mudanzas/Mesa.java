package Mudanzas;

public class Mesa extends Producto {

    public Mesa(int peso) {
        super(peso);
    }

    @Override
    public int volumen() {
        return 0;
    }
}
