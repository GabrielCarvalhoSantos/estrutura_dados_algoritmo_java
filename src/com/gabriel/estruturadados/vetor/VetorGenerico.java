package com.gabriel.estruturadados.vetor;

public class VetorGenerico<T> {
    private T[] elementos;
    private int tamanho;

    public VetorGenerico(int capacidade){
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }


    public boolean adicionar(T elemento){
        aumentarCapacidade();
        if (this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public boolean adicionar(int posicao, T elemento){
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

    public T obtem(int posicao){
        return this.busca(posicao);
    }
    public T busca(int posicao){
        if (!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posicao invalida");
        }
        return  this.elementos[posicao];
    }
    public boolean contem(T elemento){
        return  busca(elemento) > -1;
    }

    public int busca(T elemento){
        for (int i = 0; i < tamanho; i++){
            if (this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

    public int utimoIndice(T elemento){
        for (int i = this.tamanho -1; i >= 0; i--){
            if (this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

    private void aumentarCapacidade(){
        if (this.tamanho == this.elementos.length){
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
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

    public void remover(T elemento){
        int pos = this.busca(elemento);
        if (pos > -1){
            this.remover(pos);
        }
    }

    public void limpar(){
        /*opção 1
        this.elementos = (T[]) new Object[this.elementos.length];

        opção 2
        this.tamanho = 0;

        opção 3*/
        for (int i = 0; i < this.tamanho; i++){
            this.elementos[i] = null;
        }
        this.tamanho = 0;
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
