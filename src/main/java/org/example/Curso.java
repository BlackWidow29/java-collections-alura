package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas;

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public List<Aula> getAulas() {
        if (aulas.isEmpty()) aulas = new LinkedList<>();
        return Collections.unmodifiableList(aulas);
    }

    public void setAulas(List<Aula> aulas) {
        this.aulas = aulas;
    }
}
