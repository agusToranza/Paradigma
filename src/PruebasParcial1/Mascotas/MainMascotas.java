package PruebasParcial1.Mascotas;

public class MainMascotas {
    public static void main(String[] args) {
        Persona golden = new Persona();
        golden.setMascota(new Mascota());
        Mascota m1 = golden.getMascota();
        System.out.println(m1.getOwner());

        Persona tamara = new Persona();
        Mascota luisa = new Mascota();
        luisa.setOwner(tamara);
        tamara.setPareja(luisa.getOwner());
        System.out.println(tamara.getPareja());
        System.out.println(tamara);



//        Persona rodo = new Persona();
//        rodo.setPareja(new Persona());
//        rodo = new Mascota();
//        rodo.setOwner(rodo.getPareja());
    }
}
