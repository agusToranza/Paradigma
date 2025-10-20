package MatrizEnergetica;

import java.util.HashSet;

public class CentralNuclear extends CentralProductora{

    private final HashSet<Reactor> reactores = new HashSet<>();

    public CentralNuclear(int capacidadMaxima, Ciudad ciudad, Propietario propietario) {
        this.capacidadMaxima = capacidadMaxima;
        this.propietario = propietario;
        propietario.agregarCentral(this);
        this.ciudadDondeSeUbica = ciudad;
        ciudad.agregarCentral(this);
    }

    @Override
    public int getNivelDeEmision() {
        return reactores.size() * 41;
    }

    @Override
    public int cantidadEnergiaAportada() {
        int cantidadEnergiaTotal = 0;
        for (Reactor reactor : reactores) {
            cantidadEnergiaTotal += reactor.getPotenciaReactor();
        }
        return cantidadEnergiaTotal - 5;
    }

    public void agregarReactor(Reactor reactor) {
        if (reactores.size() <= 5) {
            reactores.add(reactor);
        }
    }


}
