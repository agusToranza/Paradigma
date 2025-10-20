package MatrizEnergetica;

import java.util.HashSet;

public class Ciudad {

    private final HashSet<CentralProductora> centrales = new HashSet<>();

    public void agregarCentral(CentralProductora centralProductora) {
        centrales.add(centralProductora);
    }
}
