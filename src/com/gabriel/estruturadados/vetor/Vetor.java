package com.gabriel.estruturadados.vetor;

import java.util.Arrays;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    /*public void adicionar(String elemento){
        for (int i = 0; i < this.elementos.length; i++){
            if (this.elementos[i] == null){
                this.elementos[i] = elemento;
                break;
            }
        }
    }*/

    public boolean adicionar(String elemento){
        aumentarCapacidade();
        if (this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public boolean adicionar(int posicao, String elemento){
        if (!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posicao invalida");
        }
        for (int i = tamanho -1; i >= posicao; i--){
            this.elementos[i+1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        tamanho++;
        return true;
    }


    public int getTamanho(){
        return this.tamanho;
    }

    public String buscar(int posicao){
        if (!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posicao invalida");
        }
        return this.elementos[posicao];
    }

    public int busca(String elemento){
        for (int i = 0; i < tamanho; i++){
            if (this.elementos[i].equalsIgnoreCase(elemento)){
                return i;
            }
        }
        return -1;
    }

    private void aumentarCapacidade(){
        if (this.tamanho == this.elementos.length){
            String[] elementosNovos = new String[this.elementos.length *2];
            for (int i = 0; i < this.elementos.length; i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public void remover(int posicao){
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posicao invalida");
        }
        for (int i = posicao; i < this.tamanho -1; i++){
            this.elementos[i] = this.elementos[i+1];
        }
        tamanho--;
    }

    @Override
    public String toString() {
        StringBuilder s =new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.tamanho -1; i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }
        if (this.tamanho > 0){
            s.append(this.elementos[this.tamanho -1]);
        }
        s.append("]");
        return s.toString();
    }
}
