package PruebasParcial1.HarryPotter1;

public class MainHP {
    public static void main(String[] args) {
        Hagrid hagrid = new Hagrid();
        Malfoy malfoy = new Malfoy();
        Snape snape = new Snape();

        System.out.println(snape.inferius(2));
        System.out.println(malfoy.cruciatus());
        System.out.println(snape.parcel("accio"));
        System.out.println(hagrid.parcel());
        System.out.println(snape.horrocrux());
        System.out.println(malfoy.lumos());
        System.out.println(snape.parcel());
        //System.out.println(malfoy.inferius());
        System.out.println(snape.cruciatus());
        //System.out.println(hagrid.inferius("b"));
        System.out.println(snape.lumos());
        //System.out.println(snape.multipler());
        //System.out.println(hagrid.parcel("hello");
    }
}
