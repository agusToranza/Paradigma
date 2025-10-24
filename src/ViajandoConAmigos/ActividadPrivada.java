package ViajandoConAmigos;

public class ActividadPrivada implements Actividad{

    private final int valorFijoPorActividad;
    private final int maximoParticipantes;
    private final Destino destino;

    public ActividadPrivada(int valorFijoPorActividad, int maximoParticipantes, Destino destino) {
        this.valorFijoPorActividad = valorFijoPorActividad;
        this.maximoParticipantes = maximoParticipantes;
        this.destino = destino;
    }

    @Override
    public boolean puedeRealizarActividad(GrupoDeAmigos grupo) {
      return grupo.getCantidadViajeros() < maximoParticipantes;
    }
}
