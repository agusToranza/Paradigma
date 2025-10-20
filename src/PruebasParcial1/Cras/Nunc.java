package PruebasParcial1.Cras;

public class Nunc extends Donec {
    @Override
    public String mauris() {
        return "NuncMauris" + " " + this.quam();
    }

    @Override
    public String lorem() {
        return super.lorem() + " " + "NuncLorem";
    }

    public String tempus() {
        return this.etiam() + " " + this.mauris();
    }
}
