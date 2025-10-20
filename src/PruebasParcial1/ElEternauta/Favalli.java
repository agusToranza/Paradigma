package PruebasParcial1.ElEternauta;

public class Favalli extends Helena{

    @Override
    public String verto() {
        return super.verto() + "_" + this.espar(false);
    }

    @Override
    public int paloria(int a) {
        return super.paloria(a) + a + this.infaro(2*a);
    }

    public int infaro(int b) {
        return (b + 3);
    }

    public boolean isMove() {
        String str = this.espar(true);
        return this.paloria(3) > 16;
    }

    public String inter(String c) {
        this.duplicar(3);
        return this.espar(c);
    }
}
