package com.gabriel.estruturadados.vetor.teste.labs;

import com.gabriel.estruturadados.vetor.VetorGenerico;

public class Exe01 {
    public static void main(String[] args) {
        VetorGenerico<String> v = new VetorGenerico<>(5);

        v.adicionar("A");
        v.adicionar("B");
        v.adicionar("C");
        v.adicionar("D");

        System.out.println(v.contem("A"));
        System.out.println(v.contem("Z"));
    }
}
