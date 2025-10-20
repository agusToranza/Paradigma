package PruebasParcial1.HarryPotter2;

public class Ron extends Draco{
    protected int year;
    private Hermione sister;

    public Ron() {

    }

    public Ron(int year) {
        this.year = year;
    }

    public int getYear() {
        return this.year + this.number;
    }

    public void setSister(Hermione sister) {
        this.sister = sister;
    }

    public Hermione getSister() {
        return sister;
    }

    public boolean isDraco() {
        return super.isDraco();
    }
}
