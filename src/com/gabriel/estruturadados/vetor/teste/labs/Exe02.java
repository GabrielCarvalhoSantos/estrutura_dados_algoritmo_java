package com.gabriel.estruturadados.vetor.teste.labs;

import com.gabriel.estruturadados.vetor.VetorGenerico;

public class Exe02 {
    public static void main(String[] args) {

        VetorGenerico<String> v = new VetorGenerico<>(5);

        v.adicionar("A");
        v.adicionar("B");
        v.adicionar("A");
        v.adicionar("A");

        System.out.println(v.utimoIndice("A"));
    }
}
