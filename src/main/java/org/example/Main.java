package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import static java.util.Comparator.comparing;

public class Main {
    public static void main(String[] args) {

        Aula aula = new Aula("Revisitando ArrayLists", 21);
        Aula aula2 = new Aula("Lista de Objetos", 20);
        Aula aula3 = new Aula("Relacionamento de lista e objetos", 15);

        ArrayList<Aula> aulas = new ArrayList<>();

        Collections.addAll(aulas, aula, aula2, aula3);

        System.out.println(aulas);

        aulas.sort(comparing(Aula::getTempo));

        System.out.println(aulas);

        Curso javaColecoes = new Curso("Java Collections: Dominando Listas, Sets e Mapas", "Paulo Silveira");
        javaColecoes.setAulas(aulas);


    }
}