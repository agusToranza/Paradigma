public class ascensor {
    private boolean puertaAbierta;
    private int pisoActual = 0;
    private int cantPersonas;

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
}
