package PruebasParcial1.HarryPotter2;

public class Hermione extends Ron{
    private Ron sister;
    private String key;

    public Hermione() {

    }

    public Hermione(Ron katniss) {
        this.sister = katniss;
    }

    public Ron getRon() {
        return sister;
    }

    public Hermione(int year) {
        super(year);
    }

    public String name(int number) {
        return "Hermione" + number;
    }

    public String getName(int n) {
        return this.name(10+n) + this.year();
    }

    public String year() {
        return super.year()
                + "+" + this.name(3);
    }
}
