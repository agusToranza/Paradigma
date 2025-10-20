package PruebasParcial1.ElEternauta;

public class MainEternauta {
    public static void main(String[] args) {

        Favalli favalli = new Favalli();
        Helena helena = new Helena();

        System.out.println(favalli.verto());
        System.out.println(favalli.paloria(3));
        //System.out.println(helena.infaro(4));
        System.out.println(favalli.isMove());
        System.out.println(favalli.inter("Juan"));
    }
}
