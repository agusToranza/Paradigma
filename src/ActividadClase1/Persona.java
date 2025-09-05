package ActividadClase1;

public class Persona {
    private int enQuePisoEstas;
    private int aQuePisoQueresIr;

    public void estasEnPiso(int unNumeroDePiso) {
        this.enQuePisoEstas = unNumeroDePiso;
    }

    public void aQuePisoIr(int unNumeroDePiso) {
        this.aQuePisoQueresIr = unNumeroDePiso;
    }

    public int aQuePisoQueresIr() {
        return aQuePisoQueresIr;
    }


}
