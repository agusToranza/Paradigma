package FamiliasMafiosas;

import java.util.ArrayList;

public class Criminal implements Integrante {

    private final int puntosDeHonor;
    private final ArrayList<Arma> armas = new ArrayList<>();
    private final Familia familiaAlaQuePertenece;

    public void agregarArmas(Arma arma) {
        this.armas.add(arma);
    }

    public Criminal (int puntosDeHonor, Familia familia) {
        this.puntosDeHonor = puntosDeHonor;
        this.familiaAlaQuePertenece = familia;
        familia.agregarIntegranteFamilia(this);
    }

    @Override
    public int obtenerPuntosDeHonor() {
        int sumatoriaPuntos = 0;
        for (Arma arma : armas) {
            sumatoriaPuntos += arma.getPuntosDeHonor();
        }
        return this.puntosDeHonor + sumatoriaPuntos;
    }

    @Override
    public boolean esDebil() {
        return this.obtenerPuntosDeHonor() < 50;
    }

    @Override
    public boolean seConsideraCapo() {
        boolean esCapo = false;
        boolean todasArmasHeavy = true;
        for (Arma arma : armas) {
            if (!arma.esArmaHeavy()) {
                todasArmasHeavy = false;
            }
        }
        return todasArmasHeavy && this.obtenerPuntosDeHonor() > 110;
    }

    @Override
    public boolean puedeAtacar() {
        return true;
    }
}
