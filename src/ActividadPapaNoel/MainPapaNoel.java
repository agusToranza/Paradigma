package ActividadPapaNoel;

public class MainPapaNoel {
    public static void main(String[] args) {

        PapaNoel papaNoel = new PapaNoel();

        Barrio villaLaAngostura = new Barrio("Villa la Angostura");

        Casa casa1 = new Casa("Casa 1", villaLaAngostura, true);
        Persona martin = new Persona("Martin", 24, casa1);
        Persona melina = new Persona("Melina", 23, casa1);
        Mascota eva = new Mascota("Eva", 6, casa1);
        Mascota gollum = new Mascota("Gollum", 4, casa1);
        Mascota olivia = new Mascota("Olivia",7, casa1);

        papaNoel.agregarDomicilioPendiente(casa1);
        papaNoel.visitarDomicilio(casa1);
        System.out.println(papaNoel);

        Barrio CABA = new Barrio("CABA");
        Departamento departamento1 =  new Departamento("Departamento 1", CABA, false);
        Persona nicoles = new Persona("Nicolas", 45, departamento1);
        Persona mariana = new Persona("Mariana", 40, departamento1);
        Persona nino1 = new Persona("Niño 1", 6, departamento1);
        Persona nino2 = new Persona("Niño 2", 3, departamento1);

        papaNoel.agregarDomicilioPendiente(departamento1);
        papaNoel.visitarDomicilio(departamento1);
        System.out.println(papaNoel);

        Barrio miramar = new Barrio("Miramar");
        Casa casa2 = new Casa("casa2", miramar, true);
        Persona rogelio = new Persona("Rogelio", 60, casa2);
        Persona amanda = new Persona("Amanda", 60, casa2);

        papaNoel.agregarDomicilioPendiente(casa2);
        papaNoel.visitarDomicilio(casa2);
        System.out.println(papaNoel);



    }
}
