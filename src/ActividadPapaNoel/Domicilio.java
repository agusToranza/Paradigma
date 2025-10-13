package ActividadPapaNoel;

import java.util.HashSet;

public abstract class Domicilio {
    private final HashSet<Habitante> habitantes = new HashSet<>();
    private Barrio barrio;


    public abstract boolean puedeIngresar();

    public void agregarHabitante(Habitante habitante) {
        this.habitantes.add(habitante);
    }

    public void setBarrio (Barrio unBarrio){
        this.barrio = unBarrio;
        barrio.agregarDomicilio(this);
    }

    public int cantidadHabitantes() {
        return habitantes.size();
    }

    public HashSet<Habitante> getHabitantes() {
        return this.habitantes;
    }

    public boolean esAburrido() {
        boolean esAburrido = true;
        for (Habitante habitante : habitantes) {
            if (habitante.mereceRegalo()) {
                esAburrido = false;
                break;
            }
        }
        return esAburrido;
    }

    public Barrio getBarrio() {
        return this.barrio;
    }

}
