package PruebasParcial1.HarryPotter2;

public class Draco {
    private String key;
    protected int number = -5;

    public Draco() {

    }

    public String getKey() {
        return "KeyDraco";
    }

    public Draco(String key) {
        this.key = key;
    }

    public String year() {
        return "2001";
    }

    public boolean isDraco() {
        return this.getKey().equals(this.year());
    }
}
