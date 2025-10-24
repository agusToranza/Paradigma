package ViajandoConAmigos;

import java.util.ArrayList;
import java.util.HashSet;

public class PaqueteGrupal {

    private final ArrayList<Destino> destinosPaquete = new ArrayList<>();
    private final ArrayList<Actividad> actividadesEnElPaquete = new ArrayList<>();


    public void agregarDestino(Destino destino) {
        destinosPaquete.add(destino);
    }

    public void agregarActividadAPaquete(Actividad actividad) {

    }
}
