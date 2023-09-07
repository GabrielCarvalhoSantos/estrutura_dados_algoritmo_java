package com.gabriel.estruturadados.vetor.teste;

import com.gabriel.estruturadados.vetor.Vetor;

public class Aula05 {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(5);

        vetor.adicionar("elemento1");
        vetor.adicionar("elemento2");
        vetor.adicionar("elemento3");

        vetor.getTamanho();
        System.out.println(vetor.buscar(2));

        System.out.println(vetor.toString());
    }
}
