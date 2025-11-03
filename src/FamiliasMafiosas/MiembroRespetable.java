package FamiliasMafiosas;

import java.util.HashSet;

public class MiembroRespetable implements Integrante{

    private final int puntosDeHonor;
    private final int cantTitulosUniversitarios;
    private final Familia familiaAlaQuePertenece;


    public MiembroRespetable (int puntosHonor, int cantTitulosUniversitarios, Familia familia) {
        this.puntosDeHonor = puntosHonor;
        this.cantTitulosUniversitarios = cantTitulosUniversitarios;
        this.familiaAlaQuePertenece = familia;
        familia.agregarIntegranteFamilia(this);
    }

    @Override
    public int obtenerPuntosDeHonor() {
        return this.puntosDeHonor + (this.cantTitulosUniversitarios * 10);
    }

    @Override
    public boolean esDebil() {
        return this.obtenerPuntosDeHonor() < 50;
    }

    @Override
    public boolean seConsideraCapo() {
        return this.obtenerPuntosDeHonor() > 90 && cantTitulosUniversitarios >= 1;
    }

    @Override
    public boolean puedeAtacar() {
        return false;
    }
}
