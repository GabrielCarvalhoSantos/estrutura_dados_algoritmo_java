package com.gabriel.estruturadados.vetor.teste;

import com.gabriel.estruturadados.vetor.Vetor;

public class Aula06 {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(5);

        vetor.adicionar("Elemento1");
        vetor.adicionar("Elemento2");
        vetor.adicionar("Elemento3");

        System.out.println(vetor.busca("elemento1"));
    }
}
