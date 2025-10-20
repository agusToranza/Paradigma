package MatrizEnergetica;

public class Consumidor {

    private int cuantoConsume;
    private String nombre;

    public Consumidor(int cuantoConsume, String nombre) {
        this.cuantoConsume = cuantoConsume;
        this.nombre = nombre;
    }

    public void cambiarComsumo(int nuevoConsumo) {
        this.cuantoConsume = nuevoConsumo;
    }

    public int getCuantoConsume() {
        return this.cuantoConsume;
    }
}
