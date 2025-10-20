package ActividadClase4.Ej2Gimnasio;

public class MembresiaPorActividad extends Membresia {

    String tipoActividad;

    public MembresiaPorActividad(int DNIsocio, String tipoActividadPermitida) {
        super(DNIsocio);
        this.tipoActividad = tipoActividadPermitida;
    }


    @Override
    public boolean puedeRealizarActividad(Actividad actividad) {
        return this.tipoActividad.equalsIgnoreCase(actividad.getNombreActividad());
    }
}
