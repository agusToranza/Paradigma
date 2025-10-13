package ActividadPapaNoel;

public class Mascota extends Habitante{


    public Mascota(String nombre, int edad, Domicilio domicilio) {
        super(nombre, edad, domicilio);
    }

    @Override
    public boolean mereceRegalo() {
        return true;
    }

}
