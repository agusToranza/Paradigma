package PruebasParcial1.Turnos;

public class MainTurnero {
    public static void main(String[] args) {
        Turnero turnero = new Turnero();
        Turno t1 = turnero.dameUnTurno();
        turnero.dameUnTurno();
        Turno t2 = turnero.dameUnTurno();

        boolean c1 = t1.queNumeroTiene() == t2.queNumeroTiene();
        boolean c2 = t1 == t2;
        boolean c3 = turnero.queNumeroVa() == turnero.dameUnTurno().queNumeroTiene();
        int i1 = turnero.queNumeroVa();
        boolean c4 = turnero.quienEstaPrimero(t1, t2) == t2;
        boolean c5 = turnero.quienEstaPrimero(t2, new Turno(1)) == new Turno(1);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(i1);
    }

}