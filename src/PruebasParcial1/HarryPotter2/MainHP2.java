package PruebasParcial1.HarryPotter2;

public class MainHP2 {
    public static void main(String[] args) {

        Ron ron = new Ron(2000);
        Draco draco = new Draco("1BC2");
        Hermione hermione = new Hermione();

        System.out.println(ron.getYear());
        System.out.println(ron.isDraco());
        System.out.println(hermione.getKey());
        System.out.println(hermione.getName(2));
        System.out.println(hermione.year());
    }
}
