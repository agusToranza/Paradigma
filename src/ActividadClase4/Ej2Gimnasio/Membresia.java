package ActividadClase4.Ej2Gimnasio;

public abstract class Membresia {

    protected int DNIsocio;

    public Membresia(int DNIsocio) {
        this.DNIsocio = DNIsocio;
    }

    public int getDNIsocio() {
        return DNIsocio;
    }

    public abstract boolean puedeRealizarActividad(Actividad actividad);



}
