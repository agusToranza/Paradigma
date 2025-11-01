package ViajandoConAmigos;

public class ActividadPrivada extends Actividad{

    private int valorFijoPorActividad;
    private final int maximoParticipantes;

    public ActividadPrivada(String nombre, int valorFijoPorActividad, int maximoParticipantes, Destino destino) {
        this.nombreActividad = nombre;
        this.valorFijoPorActividad = valorFijoPorActividad;
        this.maximoParticipantes = maximoParticipantes;
        this.destinoDondeSeRealiza = destino;
        destino.agregarActividadEnDestino(this);
    }

    @Override
    public boolean puedeRealizarActividad(GrupoDeAmigos grupo) {
      return grupo.getCantidadViajeros() < maximoParticipantes;
    }

    @Override
    public int getValorTotalActividad(GrupoDeAmigos grupoDeAmigos) {
        return valorFijoPorActividad;
    }

    public void cambiarValorFijo(int valorNuevo) {
        this.valorFijoPorActividad = valorNuevo;
    }

    public int getValorFijoPorActividad() {
        return this.valorFijoPorActividad;
    }

    @Override
    public int getValorActividad() {
        return this.valorFijoPorActividad;
    }
}
