package ViajandoConAmigos;

import java.util.ArrayList;


public class PaqueteGrupal {

    private final ArrayList<Destino> destinosPaquete = new ArrayList<>();
    private final ArrayList<Integer> diasPorDestino = new ArrayList<>();
    private final ArrayList<Actividad> actividadesEnElPaquete = new ArrayList<>();
    private final GrupoDeAmigos grupoDeAmigosDelPaquete;


    public void agregarDestino(Destino destino, int cantidadDeDias) {
        destinosPaquete.add(destino);
        diasPorDestino.add(cantidadDeDias);
    }

    public PaqueteGrupal(GrupoDeAmigos grupoDeAmigos) {
        this.grupoDeAmigosDelPaquete = grupoDeAmigos;
    }


    public void agregarActividadAPaquete(Actividad actividad) {
        if (actividadSeRealizaEnDestino(actividad) && esAptaParaElGrupo(actividad)) {
            actividadesEnElPaquete.add(actividad);
        }
    }

    private boolean actividadSeRealizaEnDestino(Actividad actividad) {
        return destinosPaquete.contains(actividad.getDestinoDondeSeRealizaActividad());
    }

    private boolean esAptaParaElGrupo(Actividad actividad) {
        return actividad.puedeRealizarActividad(grupoDeAmigosDelPaquete);
    }

    public int getImporteTotalPaquete() {
        return importeTotalPorAlojamiento() + importeTotalPorTasaDeTurismo() + importeTotalPorActividades(grupoDeAmigosDelPaquete);
    }

    private int importeTotalPorAlojamiento() {
        int totalDeDias = 0;
        for (int dia : diasPorDestino) {
            totalDeDias += dia;
        }
        return totalDeDias * 36 * this.grupoDeAmigosDelPaquete.getCantidadViajeros();
    }

    private int importeTotalPorTasaDeTurismo() {
        int i = 0;
        int importeTotal = 0;
        for (Destino destino : destinosPaquete) {
            importeTotal += destino.getTasaDeTurismoPorDia() * diasPorDestino.get(i);
            i += 1;
        }
        return importeTotal * grupoDeAmigosDelPaquete.getCantidadViajeros();
    }

    private int importeTotalPorActividades(GrupoDeAmigos grupoDeAmigos) {
        int total = 0;
        for (Actividad actividad : actividadesEnElPaquete) {
            total += actividad.getValorTotalActividad(grupoDeAmigos);
        }
        return total;
    }

    public Destino destinoDondeMasSeGastaEnActividades() {
        Destino destinoResultado = null;
        int totalMayor = 0;
        for (Actividad actividad : actividadesEnElPaquete) {
            if (actividad.getValorTotalActividad(grupoDeAmigosDelPaquete) > totalMayor) {
                totalMayor = actividad.getValorTotalActividad(grupoDeAmigosDelPaquete);
                destinoResultado = actividad.getDestinoDondeSeRealizaActividad();
            }
        }
        return destinoResultado;
    }

    public boolean paqueteDentroDelPresupuesto() {
        return grupoDeAmigosDelPaquete.getPresupuestoMaximo() > this.getImporteTotalPaquete();
    }

    public void eleminarActividadMasCara() {
        Actividad actividadMasCara = getActividadMasCara();
        this.actividadesEnElPaquete.remove(actividadMasCara);
    }

    public Actividad getActividadMasCara() {
        Actividad actividadMasCara = actividadesEnElPaquete.getFirst();
        int valorActividadMasCara = 0;
        for (Actividad actividad : actividadesEnElPaquete) {
            if (actividad.getValorActividad() > valorActividadMasCara) {
                valorActividadMasCara = actividadMasCara.getValorActividad();
                actividadMasCara = actividad;
            }
        }
        return actividadMasCara;
    }
}
