package FamiliasMafiosas;

public class MainFamiliasMafiosas {
    public static void main(String[] args) {

        Familia corleone = new Familia();
        Familia capone = new Familia();

        Criminal criminal1 = new Criminal(60, corleone);
        Criminal criminal2 = new Criminal(70, corleone);
        MiembroRespetable abogado = new MiembroRespetable(80, 1, corleone);
        Criminal criminal3 = new Criminal(120, corleone);

        Criminal criminal4 = new Criminal(30, capone);
        Criminal criminal5 = new Criminal(100, capone);
        MiembroRespetable contador = new MiembroRespetable(40, 2, capone);
        Criminal criminal6 = new Criminal(25, capone);
        Criminal criminal7 = new Criminal(4, capone);

        Cuchillo cuchillo1 = new Cuchillo(20);
        criminal1.agregarArmas(cuchillo1);
        Ametralladora ametralladora1 = new Ametralladora(15);
        criminal2.agregarArmas(ametralladora1);
        criminal2.agregarArmas(cuchillo1);
        Bomba bomba1 = new Bomba();
        criminal3.agregarArmas(bomba1);

        Cuchillo cuchillo2 = new Cuchillo(15);
        criminal4.agregarArmas(cuchillo2);
        Ametralladora ametralladora2 = new Ametralladora(9);
        criminal5.agregarArmas(ametralladora2);

        System.out.println(ametralladora2.esArmaHeavy());
        System.out.println(cuchillo2.esArmaHeavy());

        System.out.println(criminal2.obtenerPuntosDeHonor());
        System.out.println(criminal3.seConsideraCapo());
        System.out.println(criminal2.seConsideraCapo());

        System.out.println(corleone.getIntegrantesCapos());
        System.out.println(capone.getIntegrantesCapos());

        System.out.println(corleone.leGanaA(capone));
        System.out.println(capone.leGanaA(corleone));

        System.out.println(capone.tieneAlMenos2IntegrantesDebiles());
        System.out.println(corleone.tieneAlMenos2IntegrantesDebiles());

    }
}
