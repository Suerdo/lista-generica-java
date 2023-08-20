package aplicacao;

import estrutura.Lista;

public class MainInteiros {
    public static void main(String[]args){
        Lista<Integer> numeros = new Lista<Integer>();

        numeros.adicionar(29);
        numeros.adicionar(7);
        numeros.adicionar(2004);
        numeros.remover(18);
        numeros.adicionar(19);

        for(int i = 0; i < numeros.getTamanho(); i++){
            System.out.println(numeros.get(i).getValor());
        }
    }
}
