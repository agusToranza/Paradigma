package MatrizEnergetica;

import java.util.HashSet;

public class Ciudad {

    private final HashSet<CentralProductora> centrales = new HashSet<>();
    private final HashSet<Consumidor> consumidores = new HashSet<>();
    private final HashSet<String> propietarios = new HashSet<>();
    private final HashSet<CentralProductora> centralesContaminantes = new HashSet<>();

    public void agregarCentral(CentralProductora centralProductora) {
        centrales.add(centralProductora);
    }

    public void agregarConsumidor(Consumidor consumidor) {
    this.consumidores.add(consumidor);
    }

    public int consumoTotalCiudad() {
        int consumoTotal = 0;
        for (Consumidor consumidor : consumidores) {
            consumoTotal += consumidor.getCuantoConsume();
        }
        return consumoTotal;
    }

    public HashSet<CentralProductora> getCentralesContaminates() {
        for (CentralProductora centralProductora : centrales) {
            if (centralProductora.getNivelDeEmision() >= 70) {
                centralesContaminantes.add(centralProductora);
            }
        }
        return centralesContaminantes;
    }

    public boolean esUnaCiudadEficiente() {
        boolean esEficiente = true;
        for (CentralProductora central : centrales) {
            if (central.getNivelDeEmision() >= 82) {
                esEficiente = false;
            }
        }
        return esEficiente;
    }

    public HashSet<String> propietariosEnLaCiudad() {
        for (CentralProductora central : centrales) {
            this.propietarios.add(central.propietario.getNombre());
        }
        return propietarios;
    }

    public boolean esUnaCiudadSustentable() {
        int produccionTotal = 0;
        for (CentralProductora central : centrales) {
            produccionTotal += central.cantidadEnergiaAportada();
        }
        return this.consumoTotalCiudad() < produccionTotal;
    }

    public boolean esUnaCiudadPotencialmentePeligrosa() {
        boolean esPeligrosa = false;
        for (CentralProductora central : centrales) {
            if (central.superaMaximaPotencia()) {
                esPeligrosa = true;
            }
        }
        return esPeligrosa;
    }
}
