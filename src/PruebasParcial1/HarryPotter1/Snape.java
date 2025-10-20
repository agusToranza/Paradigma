package PruebasParcial1.HarryPotter1;

public class Snape extends Hagrid {
    @Override
    public int inferius(int a) {
        return 10 + super.inferius(a);
    }
    public String horrocrux() {
        return "horrocrux" + this.parcel();
    }
    public String parcel(String c) {
        return "parcel:" + c;
    }
    @Override
    public String parcel() {
        return "10" + super.parcel();
    }
    @Override
    public String lumos() {
        return "super.lumos";
    }
}
