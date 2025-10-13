package Colecciones;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        Libro quijote = new Libro("El quijote", "Cervantes");
        Libro martinFierro = new Libro("Martin Fierro", "Jose");
        Libro elPrincipito = new Libro("El Principito", "Saint Exupery");

        // SET

        HashSet<Libro> libros = new HashSet<Libro>();
        System.out.printf("Cantidad: %d %n", libros.size()); // 0

        libros.add(elPrincipito);
        System.out.printf("Cantidad: %d %n", libros.size()); // 1
        libros.add(quijote);
        System.out.printf("Cantidad: %d %n", libros.size()); // 2
        libros.add(elPrincipito);
        System.out.printf("Cantidad: %d %n", libros.size()); // 2
        System.out.println(libros);

        // LIST
        System.out.println("-------------LISTAS--------------");

        ArrayList<Libro> librosLeidos = new ArrayList<Libro>();
        System.out.printf("Cantidad: %d %n", librosLeidos.size());  // 0
        librosLeidos.add(quijote);
        librosLeidos.add(elPrincipito);
        librosLeidos.add(quijote);
        System.out.printf("Cantidad: %d %n", librosLeidos.size()); // 3
        System.out.println(librosLeidos);
    }
}
