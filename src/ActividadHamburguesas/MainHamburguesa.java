package ActividadHamburguesas;

public class MainHamburguesa {
    public static void main(String[] args) {

        Hamburguesa hamburguesa1 = new Hamburguesa();
        Hamburguesa hamburguesa2 = new Hamburguesa();

        Medallon carne = new Medallon(2900);
        Medallon pollo = new Medallon(1500);
        Medallon verdura = new Medallon(1890);

        Adicional cheddar = new Adicional(600);
        Adicional berenjena = new Adicional(350);
        Adicional cebolla = new Adicional(250);
        Adicional bacon = new Adicional(500);

        Pan panDePapa = new Pan(4500);
        Pan panDeCampo = new Pan(5500);

        hamburguesa1.setPan(panDePapa);
        hamburguesa1.agregarMedallon(carne);
        hamburguesa1.agregarMedallon(pollo);
        hamburguesa1.agregarAdicional(cheddar);
        hamburguesa1.agregarAdicional(berenjena);

        hamburguesa2.setPan(panDeCampo);
        hamburguesa2.agregarMedallon(verdura);
        hamburguesa2.agregarAdicional(berenjena);
        hamburguesa2.agregarAdicional(cheddar);

        if (hamburguesa1.puedeFacturarse()) {
            System.out.println("Puede facturarse: OK");
            System.out.println("Precio total de la hamburguesa: " + hamburguesa1.precioTotalHamburguesa());
        } else {
            System.out.println("No puede ser facturada porque tiene más adicionales que medallones.");
        }

        if (hamburguesa2.puedeFacturarse()) {
            System.out.println("Puede facturarse: OK");
            System.out.println("Precio total de la hamburguesa: " + hamburguesa2.precioTotalHamburguesa());
        } else {
            System.out.println("No puede ser facturada porque tiene más adicionales que medallones.");
        }


    }
}
