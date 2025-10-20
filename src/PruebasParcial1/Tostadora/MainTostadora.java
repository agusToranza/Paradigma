package PruebasParcial1.Tostadora;

public class MainTostadora {
    public static void main(String[] args) {
        Tostadora tostadora = new Tostadora();
        Pan p1 = new Pan();
        Pan p2 = tostadora.dameUnPanTostado();
        Pan p3 = tostadora.cambialoPorUnoTostado(p1);
        p1 = p3;
        boolean b1 = tostadora.decimeSiEstaTostado(new Pan()) && tostadora.cambialoPorUnoTostado(p1).estaTostado();
        boolean b2 = p2.estaTostado() || tostadora.decimeSiEstaTostado(p3);
        boolean b3 = p3 == tostadora.dameUnPanTostado();
        boolean b4 = p1.estaTostado() == tostadora.decimeSiEstaTostado(p1);
        boolean b5 = tostadora.dameUnPanTostado() == p2;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
    }
}
