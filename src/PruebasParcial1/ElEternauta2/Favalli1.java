package PruebasParcial1.ElEternauta2;

public class Favalli1 extends Helena2{

    @Override
    public String urco() {
        return super.urco() + "_" + this.espar(false);
    }

    @Override
    public int pink(int a) {
        return super.pink(a) + a + this.infaro(2 * a);
    }

    public int infaro(int b) {
        return (b + 3);
    }

    public boolean isMove() {
        String str = this.espar(true);
        return this.pink(3) > 36;
    }

    public String inter(String c) {
        this.duplicar(3);
        return this.espar(c);
    }
}
