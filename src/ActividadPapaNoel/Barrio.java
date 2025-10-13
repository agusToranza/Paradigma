package ActividadPapaNoel;

import java.util.HashSet;

public class Barrio {
    private String nombre;
    private final HashSet<Domicilio> domicilios = new HashSet<Domicilio>();

    public Barrio(String nombre) {
        this.nombre = nombre;
    }

    public void agregarDomicilio(Domicilio unDomicilio) {
        this.domicilios.add(unDomicilio);
    }

    public int cantidadHabitantesPorBarrio() {
        int total = 0;
        for (Domicilio domicilio : domicilios) {
            total += domicilio.cantidadHabitantes();
        }
        return total;
    }
}
