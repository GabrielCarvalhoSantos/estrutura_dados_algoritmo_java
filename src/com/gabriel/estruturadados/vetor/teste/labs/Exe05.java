package com.gabriel.estruturadados.vetor.teste.labs;

import com.gabriel.estruturadados.vetor.VetorGenerico;

public class Exe05 {
    public static void main(String[] args) {
        VetorGenerico<String> v = new VetorGenerico<>(3);

        v.adicionar("A");
        v.adicionar("B");
        v.adicionar("C");

        v.limpar();

        System.out.println(v);
    }
}
