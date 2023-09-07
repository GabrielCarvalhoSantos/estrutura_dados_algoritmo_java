package com.gabriel.estruturadados.vetor.teste;

import com.gabriel.estruturadados.vetor.VetorObjetos;

public class Aula10 {
    public static void main(String[] args) {

        VetorObjetos v = new VetorObjetos(1);

        v.adicionar(2);
        v.adicionar("eu");

        System.out.println(v);
    }
}
