package ActividadPapaNoel;

public class Persona extends Habitante {


    public Persona(String nombre, int edad, Domicilio domicilio) {
        super(nombre, edad,  domicilio);
    }

    @Override
    public boolean mereceRegalo() {
        return this.getEdad() <= 12;
    }
}
