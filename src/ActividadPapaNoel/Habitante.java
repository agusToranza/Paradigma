package ActividadPapaNoel;

public abstract class Habitante {
    private String nombre;
    private final int edad;
    private Domicilio domicilioActual;

    public abstract boolean mereceRegalo();

    public Habitante(String nombre, int edad, Domicilio domicilio) {
        this.nombre = nombre;
        this.edad = edad;
        this.domicilioActual = domicilio;
        domicilioActual.agregarHabitante(this);
    }

    public int getEdad() {
        return this.edad;
    }

    public void mudarse(Domicilio nuevoDomicilio) {
        this.domicilioActual = nuevoDomicilio;
    }

    public String getNombre(){
        return this.nombre;
    }


}
