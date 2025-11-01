package ViajandoConAmigos;

import java.util.HashSet;

public class Destino {

    private final int tasaDeTurismoPorDia;
    private final String nombreDestino;

    private final HashSet<Actividad> actividadesQueSeRealizan = new HashSet<>();

    public Destino(String nombreDestino, int tasaDeTurismoPorDia) {
        this.nombreDestino = nombreDestino;
        this.tasaDeTurismoPorDia = tasaDeTurismoPorDia;
    }

    public int getTasaDeTurismoPorDia() {
        return this.tasaDeTurismoPorDia;
    }

    public void agregarActividadEnDestino(Actividad actividad) {
        this.actividadesQueSeRealizan.add(actividad);
    }

    public HashSet<Actividad> getActividadesQueSeRealizanEnDestino() {
        return this.actividadesQueSeRealizan;
    }

    public String getNombreDestino() {
        return this.nombreDestino;
    }
}
