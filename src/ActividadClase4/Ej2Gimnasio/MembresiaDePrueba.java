package ActividadClase4.Ej2Gimnasio;

public class MembresiaDePrueba extends Membresia {

    public MembresiaDePrueba(int DNIsocio) {
        super(DNIsocio);
    }

    @Override
    public boolean puedeRealizarActividad(Actividad actividad) {
        boolean fueUsada = false;
        return !fueUsada;
    }
}
