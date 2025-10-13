package ActividadPapaNoel;

import java.util.ArrayList;
import java.util.HashSet;

public class PapaNoel {
    private final ArrayList<Domicilio> domiciliosPorVisitar = new ArrayList<>();
    private final ArrayList <Domicilio> domiciliosVisitados = new ArrayList<>();
    private final ArrayList<Domicilio> domiciliosBloqueados = new ArrayList<>();
    private final ArrayList<Habitante> habitanteQueRecibioRegalo = new ArrayList<>();
    private final HashSet<Domicilio> domicicliosAburridos = new HashSet<>();

    public void agregarDomicilioPendiente(Domicilio unDomicilio) {
        if (!domiciliosPorVisitar.contains(unDomicilio) || domiciliosVisitados.contains(unDomicilio)) {
            domiciliosPorVisitar.add(unDomicilio);
        } else {
            throw new RuntimeException("No se puede agregar el domicilio");
        }
    }

    public void visitarPrimerDomicilioPendiente() {
        if (!domiciliosPorVisitar.isEmpty()) {
            Domicilio domicilio = domiciliosPorVisitar.getFirst();
            visitarDomicilio(domicilio);
        }
    }

    public void visitarDomicilio(Domicilio domicilio) {
        if (domicilio.puedeIngresar() && !domicilio.esAburrido()) {
            entregarRegalo(domicilio);
            domiciliosVisitados.add(domicilio);
        } else if (!domicilio.puedeIngresar()) {
            domiciliosBloqueados.add(domicilio);
        } else if (domicilio.puedeIngresar() && domicilio.esAburrido()) {
            domicicliosAburridos.add(domicilio);
        }
        domiciliosPorVisitar.remove(domicilio);
    }

    private void entregarRegalo(Domicilio domicilio) {
        HashSet<Habitante> habitantes = domicilio.getHabitantes();
        for (Habitante habitante : habitantes) {
            if (habitante.mereceRegalo() && !habitanteQueRecibioRegalo.contains(habitante)) {
                habitanteQueRecibioRegalo.add(habitante);
            }
        }
    }

    public void visitarPrimerDomicilioBloqueado() {
        if (!domiciliosBloqueados.isEmpty()) {
            Domicilio domicilio = domiciliosBloqueados.getFirst();
            if (domicilio.puedeIngresar()) {
                entregarRegalo(domicilio);
                domiciliosBloqueados.remove(domicilio);
                domiciliosVisitados.add(domicilio);
            }
        }
    }

    public Habitante habitanteMasGrandeRecibioRegalo() {
        Habitante habitanteConMayorEdad = habitanteQueRecibioRegalo.getFirst();
        for (Habitante habitante : habitanteQueRecibioRegalo) {
            if (habitante.getEdad() > habitanteConMayorEdad.getEdad()) {
                habitanteConMayorEdad = habitante;
            }
        }
        return habitanteConMayorEdad;
    }

    private boolean domicilioEsAburrido(Domicilio domicilio) {
        return (domicilio.puedeIngresar() && domicilio.esAburrido());
    }

    public ArrayList<Domicilio> domiciliosVisitadosAburridos() {
        ArrayList<Domicilio> domiciliosYaVisitadosAburridos = new ArrayList<>();
        if (!domicicliosAburridos.isEmpty()) {
            for (Domicilio domicilio : domicicliosAburridos) {
                if (domiciliosVisitados.contains(domicilio)) {
                    domiciliosYaVisitadosAburridos.add(domicilio);
                }
            }
        }
        return domiciliosYaVisitadosAburridos;
    }

    public ArrayList<Domicilio> domiciliosPendientesAburridos() {
        ArrayList<Domicilio> domiciliosPendientesAburridos = new ArrayList<>();
        if (!domicicliosAburridos.isEmpty()) {
            for (Domicilio domicilio : domicicliosAburridos) {
                if (domiciliosPorVisitar.contains(domicilio)) {
                    domiciliosPendientesAburridos.add(domicilio);
                }
            }
        }
        return domiciliosPendientesAburridos;
    }

    public int cantidadHabitantesBarrioUltDomBloqueado() {
        Domicilio domicilio = domiciliosBloqueados.getLast();
        return domicilio.getBarrio().cantidadHabitantesPorBarrio();
    }

    @Override
    public String toString() {
        return "PapaNoel{" +
                "domiciliosPorVisitar=" + domiciliosPorVisitar +
                ", domiciliosVisitados=" + domiciliosVisitados +
                ", domiciliosBloqueados=" + domiciliosBloqueados +
                ", habitanteQueRecibioRegalo=" + habitanteQueRecibioRegalo +
                ", domicicliosAburridos=" + domicicliosAburridos +
                '}';
    }

//    private void imprimirDomiciliosPorVisitar() {
//        for (Domicilio domicilio : domiciliosPorVisitar) {
//            System.out.println(domicilio.);
//        }
//    }


}
