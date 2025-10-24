package ViajandoConAmigos;

import java.util.HashSet;

public class ActividadConEdadMinima implements Actividad{

    private final int edadMinimaRequerida;
    private final int precioFijoPorPersona;
    private final Destino destino;

    public ActividadConEdadMinima(int edadMinimaRequerida, int precioFijoPorPersona, Destino destino) {
        this.edadMinimaRequerida = edadMinimaRequerida;
        this.precioFijoPorPersona = precioFijoPorPersona;
        this.destino = destino;
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

}
