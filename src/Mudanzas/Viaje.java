package Mudanzas;

import java.util.HashSet;

public class Viaje {

    private final HashSet<Medible> productosMedibles = new HashSet<>();
    private final HashSet<Pesable> productosPesables = new HashSet<>();

    public int pesoTotalTransportado() {
        int pesoTotal = 0;
        for (Pesable productoPesable : productosPesables) {
            pesoTotal += productoPesable.obtenerPeso();
        }
        return pesoTotal;
    }

    public void cargarProductoMedible(Medible producto) {
        productosMedibles.add(producto);
    }

    public int volumenTransportado() {
        int volumenTotal = 0;
        for (Medible productoMedible : productosMedibles) {
            volumenTotal += productoMedible.obtenerVolumen();
        }
        return volumenTotal;
    }
}

