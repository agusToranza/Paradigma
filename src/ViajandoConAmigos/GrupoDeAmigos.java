package ViajandoConAmigos;

import java.util.HashSet;

public class GrupoDeAmigos {

    private int presupuestoMaximo;
    private final HashSet<Viajero> viajerosEnElGrupo = new HashSet<>();

    public GrupoDeAmigos(int presupuestoMaximo) {
        this.presupuestoMaximo = presupuestoMaximo;
    }

    public HashSet<Viajero> getViajerosEnElGrupo() {
        return this.viajerosEnElGrupo;
    }

    public int getCantidadViajeros() {
        return viajerosEnElGrupo.size();
    }

    public void cambiarPresupuestoMaximo(int presupuestoNuevo) {
        this.presupuestoMaximo = presupuestoNuevo;
    }

    public void eliminarIntegranteGrupo(Viajero viajero) {
        viajerosEnElGrupo.remove(viajero);
    }
}
