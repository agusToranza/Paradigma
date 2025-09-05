package ActividadClase1;

public class Ascensor {
    private boolean puertaAbierta;
    private int pisoActual = 0;
    private int cantPersonas;
    private Persona quienViaja;

    public boolean estaAbiertaLaPuerta(){
        return puertaAbierta;
    }

    public void andaAlPiso(int piso) {
        this.cerrarPuerta();
        pisoActual = piso;
    }

    public void abrirPuerta() {
        puertaAbierta = true;
    }

    public void cerrarPuerta() {
        puertaAbierta = false;
    }

    public int enQuePisoEstas() {
        return pisoActual;
    }

    public void ingresa(Persona alguienQueViaja) {
        this.quienViaja = alguienQueViaja;
    }

    public void comenzarRecorrido() {
        this.cerrarPuerta();
        this.andaAlPiso(this.quienViaja.aQuePisoQueresIr());
    }

    public boolean hayAlguienAdentro() {
        return this.quienViaja != null;
    }
}
