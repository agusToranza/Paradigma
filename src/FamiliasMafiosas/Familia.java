package FamiliasMafiosas;

import java.util.HashSet;

public class Familia {

    private final HashSet<Integrante> integrantes = new HashSet<>();

    public void agregarIntegranteFamilia(Integrante integrante) {
        this.integrantes.add(integrante);
    }

    private int cantidadTotalPuntosDeHonor() {
        int cantTotal = 0;
        for (Integrante integrante : integrantes) {
            if (integrante.puedeAtacar()) {
                cantTotal += integrante.obtenerPuntosDeHonor();
            }
        }
        return cantTotal;
    }

    public boolean leGanaA(Familia familia) {
        return this.cantidadTotalPuntosDeHonor() > familia.cantidadTotalPuntosDeHonor();
    }

    public HashSet<Integrante> getIntegrantesCapos() {
        HashSet<Integrante> integrantesCapos = new HashSet<>();
        for (Integrante integrante : integrantes) {
            if (integrante.seConsideraCapo()) {
                integrantesCapos.add(integrante);
            }
        }
        return integrantesCapos;
    }

    public boolean tieneAlMenos2IntegrantesDebiles() {
        int contador = 0;
        for (Integrante integrante : integrantes) {
            if (integrante.esDebil()) {
                contador += 1;
            }
        }
        return contador >= 2;
    }
}
