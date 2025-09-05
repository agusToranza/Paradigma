package ActividadClase4.Ej1Impresoras;

public class Documento {
    private int consumoDeCian;
    private int consumoDeMagenta;
    private int consumoDeAmarillo;
    private int consumoDeNegro;
    private int cantidadHojasQueUsa;
    protected boolean seImprimio = false;
    private boolean fueAbrochado;

    public void fueImpreso() {
        this.seImprimio = true;
    }

    public boolean impreso() {
        return this.seImprimio;
    }

    public Documento(int consumoCian, int consumoMagenta, int consumoAmarillo, int consumoNegro, int cantidadHojas) {
        this.consumoDeCian = consumoCian;
        this.consumoDeMagenta = consumoMagenta;
        this.consumoDeAmarillo = consumoAmarillo;
        this.consumoDeNegro = consumoNegro;
        this.cantidadHojasQueUsa = cantidadHojas;
    }

    public int getConsumoDeCian() {
        return this.consumoDeCian;
    }

    public void abrochar() {
        this.fueAbrochado = true;
    }

    public int getConsumoDeMagenta() {
        return this.consumoDeMagenta;
    }

    public int getConsumoDeAmarillo() {
        return this.consumoDeAmarillo;
    }

    public int getConsumoDeNegro() {
        return this.consumoDeNegro;
    }

    public int getCantidadHojasQueUsa() {
        return this.cantidadHojasQueUsa;
    }
}
