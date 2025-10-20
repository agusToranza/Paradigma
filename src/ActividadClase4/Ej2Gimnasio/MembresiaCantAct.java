package ActividadClase4.Ej2Gimnasio;

public class MembresiaCantAct extends Membresia {
    private int creditosDisponibles;

    public MembresiaCantAct(int DNIsocio, int creditos) {
        super(DNIsocio);
        this.creditosDisponibles = creditos;
    }


    @Override
    public boolean puedeRealizarActividad(Actividad actividad) {
        if (creditosDisponibles > 0) {
            creditosDisponibles --;
            return true;
        }
        return false;
    }
}
