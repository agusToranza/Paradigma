package ViajandoConAmigos;

import java.util.HashSet;

public class ActividadConEdadMinima extends Actividad{

    private final int edadMinimaRequerida;
    private int precioPorPersona;

    public ActividadConEdadMinima(String nombreActividad, int edadMinimaRequerida, int precioFijoPorPersona, Destino destino) {
        this.nombreActividad = nombreActividad;
        this.edadMinimaRequerida = edadMinimaRequerida;
        this.precioPorPersona = precioFijoPorPersona;
        this.destinoDondeSeRealiza = destino;
        destino.agregarActividadEnDestino(this);
    }


    @Override
    public boolean puedeRealizarActividad(GrupoDeAmigos grupo) {
        boolean puedeRealizarAct = true;
        HashSet<Viajero> viajerosEnElGrupo = grupo.getViajerosEnElGrupo();
        for (Viajero viajero : viajerosEnElGrupo) {
            if (viajero.getEdadViajero() < edadMinimaRequerida) {
                puedeRealizarAct = false;
                break;
            }
        }
        return puedeRealizarAct;
    }

    @Override
    public int getValorActividad() {
        return this.precioPorPersona;
    }

    @Override
    public int getValorTotalActividad(GrupoDeAmigos grupoDeAmigos) {
        return precioPorPersona * grupoDeAmigos.getCantidadViajeros();
    }

    public void cambiarPrecioPorPersona(int nuevoPrecio) {
        this.precioPorPersona = nuevoPrecio;
    }

    public int getPrecioPorPersona() {
        return this.precioPorPersona;
    }

}
