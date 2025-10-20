package MatrizEnergetica;

import java.util.HashSet;

public class Propietario {

    private final int CUIT;
    private final String nombre;

    private final HashSet<CentralProductora> centrales = new HashSet<>();

    public Propietario(int CUIT, String nombre) {
        this.CUIT = CUIT;
        this.nombre = nombre;
    }

    public void agregarCentral(CentralProductora centralProductora) {
        centrales.add(centralProductora);
    }

    public HashSet<CentralProductora> getCentrales() {
        return centrales;
    }

    public String getNombre() {
        return this.nombre;
    }
}
