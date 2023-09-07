package com.gabriel.estruturadados.vetor.teste;

import com.gabriel.estruturadados.vetor.VetorGenerico;

public class Aula11 {
    public static void main(String[] args) {

        VetorGenerico <String> v = new VetorGenerico<>(2);

        v.adicionar("G");
        v.adicionar("G");

        System.out.println(v);
    }
}
