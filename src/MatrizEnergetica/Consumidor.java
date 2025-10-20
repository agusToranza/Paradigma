package MatrizEnergetica;

public class Consumidor {

    private int cuantoConsume;
    private String nombre;
    private Ciudad ciudad;

    public Consumidor(int cuantoConsume, String nombre, Ciudad ciudad) {
        this.cuantoConsume = cuantoConsume;
        this.nombre = nombre;
        this.ciudad = ciudad;
        ciudad.agregarConsumidor(this);

    }

    public void cambiarComsumo(int nuevoConsumo) {
        this.cuantoConsume = nuevoConsumo;
    }

    public int getCuantoConsume() {
        return this.cuantoConsume;
    }
}
