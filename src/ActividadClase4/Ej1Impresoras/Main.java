package ActividadClase4.Ej1Impresoras;

public class Main {
    public static void main(String[] args) {

        Impresora hp1 = new Impresora(1000,1000,1000,1000,500);

        Documento doc1 = new Documento(10, 20, 15, 5, 15);

        Documento doc2 = new Documento(10000, 14, 15, 20, 100);

        Documento doc3 = new Documento(12, 32, 12, 15, 9700);

        Documento doc4 = new Documento(3, 2, 1, 3, 8);

        System.out.println("Se puede imprimir doc1: " + hp1.podesImprimir(doc1));
        System.out.println("Se puede imprimir doc2: " + hp1.podesImprimir(doc2));
        System.out.println("Se puede imprimir doc3: " + hp1.podesImprimir(doc3));

        // hp1.imprimi(doc1);
        System.out.println("Se imprimio doc1: " + doc1.impreso());
        System.out.println("Cian: " + hp1.cuantoDeCianTeQueda() + " Amarillo: " + hp1.cuantoDeAmarilloTeQueda());

        System.out.println(hp1);

        ImpresoraByN byn1 = new ImpresoraByN(2000, 500);
        System.out.println("Se puede imprimir doc1: " + byn1.podesImprimir(doc2));
        System.out.println(byn1);

        ImpresoraPDF pdf1 = new ImpresoraPDF();
        System.out.println("Se puede imprimir doc2 (pdf): " + pdf1.podesImprimir(doc2));
        pdf1.imprimi(doc2);
        System.out.println("Se puede imprimir doc3 (pdf): " + pdf1.podesImprimir(doc3));
        pdf1.imprimi(doc3);
        System.out.println("Esta impreso (doc2 pdf): " + doc2.impreso());

        ImpresoraECO eco1 = new ImpresoraECO(1000, 1000, 1000, 1000, 500);
        System.out.println("Se puede imprimir doc1 (eco): " + eco1.podesImprimir(doc1));
        System.out.println("Se puede imprimir doc4 (eco): " + eco1.podesImprimir(doc4));
        eco1.imprimi(doc4);
        eco1.imprimi(doc1);
        System.out.println(doc4.impreso());
        System.out.println(doc1.impreso());
    }
}
