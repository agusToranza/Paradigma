package ViajandoConAmigos;

public abstract class Actividad {

    protected Destino destinoDondeSeRealiza;
    protected String nombreActividad;

    public abstract boolean  puedeRealizarActividad(GrupoDeAmigos grupo);

    public Destino getDestinoDondeSeRealizaActividad() {
        return this.destinoDondeSeRealiza;
    }

    public abstract int getValorTotalActividad(GrupoDeAmigos grupoDeAmigos);

    public String getNombreActividad() {
        return this.nombreActividad;
    }

    public abstract int getValorActividad();
}
