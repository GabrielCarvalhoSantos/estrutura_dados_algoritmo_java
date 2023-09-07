package com.gabriel.estruturadados.vetor.teste;

import com.gabriel.estruturadados.vetor.Vetor;

public class Aula09 {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(1);

        vetor.adicionar("Elemento1");
        vetor.adicionar("Elemento2");
        vetor.adicionar("Elemento3");

        System.out.println(vetor);

        vetor.remover(0);
        System.out.println(vetor);
    }
}
