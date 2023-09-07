package com.gabriel.estruturadados.vetor.teste.labs;

import com.gabriel.estruturadados.vetor.VetorGenerico;
import com.gabriel.estruturadados.vetor.teste.Contato;

import java.util.Scanner;

public class Exe06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        VetorGenerico<Contato> v = new VetorGenerico<>(20);

        criarContatosDinamicamente(5, v);

        int opcao = 1;
        while (opcao != 0){
           opcao = obterOpcaoMenu(input);

           switch (opcao){
               case 1:
                   adicionarContatoFinal(input, v);
                   break;
               case 2:
                   adicionarContatoPosicao(input, v);
                   break;
               case 3:
                   obtemContatoPosicao(input, v);
                   break;
               case 4:
                   obtemContato(input, v);
                   break;
               case 5:
                   pesquisarUtimoIndice(input, v);
                   break;
               case 6:
                   pesquisarContatoExiste(input, v);
                   break;
               case 7:
                   excluirPorPosicao(input, v);
                   break;
               case 8:
                   excluirContato(input, v);
                   break;
               case 9:
                   imprimeTamanhoVetor(v);
                   break;
               case 10:
                   limparVetor(v);
                   break;
               case 11:
                   imprimirVetor(v);
                   break;
               default:
                   break;
           }
        }
        System.out.println("Usuario digitou 0, programa encerrado");
    }

    private static void obtemContatoPosicao(Scanner input, VetorGenerico<Contato> v){
        int pos = lerInformacaoInt("Informe a posicao a ser pesquisada",input);

        try {
          Contato contato = v.busca(pos);

            System.out.println("Contato existe, seguem dados: ");
            System.out.println(contato);

        }catch (Exception e){
            System.out.println("Posicao invalida");
        }

    }

    private static void obtemContato(Scanner input, VetorGenerico<Contato> v) {
        int pos = lerInformacaoInt("Informe a posicao a ser pesquisada", input);

        try {
            Contato contato = v.busca(pos);

            System.out.println("Contato existe, seguem dados: ");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do contato encotrado:");
            pos = v.busca(contato);

            System.out.println("Contato encotrado na posicao " + pos);

        } catch (Exception e) {
            System.out.println("Posicao invalida");
        }
    }

    private static void pesquisarUtimoIndice(Scanner input, VetorGenerico<Contato> v) {
        int pos = lerInformacaoInt("Informe a posicao a ser pesquisada", input);

        try {
            Contato contato = v.busca(pos);

            System.out.println("Contato existe, seguem dados: ");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do utimo indicie do contato encotrado:");
            pos = v.utimoIndice(contato);

            System.out.println("Contato encotrado na posicao " + pos);

        } catch (Exception e) {
            System.out.println("Posicao invalida");
        }
    }

    private static void adicionarContatoFinal(Scanner input, VetorGenerico<Contato> v){
        System.out.println("Criando um contato, entre com as informacoes");
        String nome = lerInformacoes("Entre com o nome" , input);
        String telefone = lerInformacoes("Entre com o telefone" , input );
        String email = lerInformacoes("Entre com o email" , input);

        Contato contato = new Contato(nome, telefone, email);

        v.adicionar(contato);
        System.out.println("Contato adiconado com sucesso!");
        System.out.println(contato);
    }

    private static void adicionarContatoPosicao(Scanner input, VetorGenerico<Contato> v){
        System.out.println("Criando um contato, entre com as informacoes");
        String nome = lerInformacoes("Entre com o nome" , input);
        String telefone = lerInformacoes("Entre com o telefone" , input );
        String email = lerInformacoes("Entre com o email" , input);

        Contato contato = new Contato(nome, telefone, email);

        int pos = lerInformacaoInt("Entre com a posicao que deseja adicionar o contato", input);

        try {
            v.adicionar(pos,contato);

            System.out.println("Contato adiconado com sucesso!");
            System.out.println(contato);

        }catch (Exception e){
            System.out.println("Posicao invalida, contato nao adicionado");
        }
    }

    private static void pesquisarContatoExiste(Scanner input, VetorGenerico<Contato> v) {
        int pos = lerInformacaoInt("Informe a posicao a ser pesquisada", input);

        try {
            Contato contato = v.busca(pos);

            boolean existe = v.contem(contato);

            if (existe){
                System.out.println("Contato existe, seguem dados: ");
                System.out.println(contato);
            }else{
                System.out.println("Contato nao existe");
            }
        } catch (Exception e) {
            System.out.println("Posicao invalida");
        }
    }

    private static void excluirPorPosicao(Scanner input, VetorGenerico<Contato> v) {
        int pos = lerInformacaoInt("Informe a posicao a ser removida", input);

        try {

            v.remover(pos);

            System.out.println("Contato excluido");
        } catch (Exception e) {
            System.out.println("Posicao invalida");
        }
    }

    private static void excluirContato(Scanner input, VetorGenerico<Contato> v) {
        int pos = lerInformacaoInt("Informe a posicao a ser removida", input);

        try {

            Contato contato = v.busca(pos);

            v.remover(contato);

            System.out.println("Contato excluido");
        } catch (Exception e) {
            System.out.println("Posicao invalida");
        }
    }

    private static void imprimeTamanhoVetor(VetorGenerico<Contato> v){
        System.out.println("Tamanho do vetor e de: "+ v.getTamanho());
    }

    private static void limparVetor(VetorGenerico<Contato> v){
        v.limpar();

        System.out.println("Todos os contatos do vetor foram excluidos");
    }

    private static void imprimirVetor(VetorGenerico<Contato> v){

        System.out.println(v);
    }

    private static String lerInformacoes(String msg, Scanner input){
        System.out.println(msg);
        String entrada = input.nextLine();
        return entrada;
    }

    private static int lerInformacaoInt(String msg, Scanner input){
        boolean entradaValida = false;
        int num = 0;

        while (!entradaValida){
            try {
                System.out.println(msg);
                String entrada = input.nextLine();

                num  = Integer.parseInt(entrada);

                entradaValida = true;
            }catch (Exception e){
                System.out.println("Entrada invalida, digite novamente");
            }
        }
        return num;
    }
    private static int obterOpcaoMenu(Scanner input){

        boolean entradaValida = false;
        int opcao = 0;
        String entrada;

        while (!entradaValida){
            System.out.println("Digite a opcao desejada: ");
            System.out.println("1: Adiciona contato no final do vetor");
            System.out.println("2: Adiciona contato em uma posicao especifica");
            System.out.println("3: Obtem contato de uma posicao especifica");
            System.out.println("4: Consuta contato");
            System.out.println("5: Consuta utimo indicie do contato");
            System.out.println("6: Verifica se contato existe");
            System.out.println("7: Excluir por posicao");
            System.out.println("8: Excluir contato");
            System.out.println("9: Verifica tamanho do vetor");
            System.out.println("10: Excluir todos os contatos do vetor");
            System.out.println("11: Imprime vetor");
            System.out.println("0: Sair");

            try {
                entrada = input.nextLine();
                opcao = Integer.parseInt(entrada);

                if (opcao >= 0 && opcao <= 11){
                    entradaValida = true;
                }else{
                    System.out.println("Entada invalida digite novamente \n");
                }
            }catch (Exception e){
                System.out.println("Entada invalida digite novamente \n");
            }
        }
        return opcao;
    }
    private static void criarContatosDinamicamente(int quantidade, VetorGenerico<Contato> v){
        Contato contato;
        for (int i = 1; i <= quantidade; i++){
            contato = new Contato();
            contato.setNome("Contato "+ i);
            contato.setTelefone("111111111" +i);
            contato.setEmail("contato" +i+"email.com");

            v.adicionar(contato);
        }

    }
}
