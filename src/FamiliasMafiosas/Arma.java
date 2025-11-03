package FamiliasMafiosas;

public class Arma {

    protected int puntosDeHonor;
    protected int potenciaDestructiva;

    public boolean esArmaHeavy() {
        return this.potenciaDestructiva > 200 || this.puntosDeHonor > 10;
    }

    public int getPuntosDeHonor() {
        return puntosDeHonor;
    }
}
