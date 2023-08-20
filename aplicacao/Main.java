package aplicacao;

import estrutura.Lista;

public class Main {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<String>();
        lista.adicionar("PB");
        lista.adicionar("BA");
        lista.adicionar("RJ");
        lista.adicionar("AM");

        System.out.println("Tamanho: " + lista.getTamanho());
        System.out.println("Primeiro: " + lista.getPrimeiro().getValor());
        System.out.println("Último: " + lista.getUltimo().getValor());

        for(int i = 0; i < lista.getTamanho(); i++){
            System.out.println(lista.get(i).getValor());
        }

        //Remover estado RJ
        lista.remover("RJ");
        System.out.println();
        for(int i = 0; i < lista.getTamanho(); i++){
            System.out.println(lista.get(i).getValor());
        }
    }
}
