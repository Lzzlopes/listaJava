package Exercicio04;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Jogador perfil = new Jogador();

        Scanner ans = new Scanner(System.in);

        int escolha, id=1;

        do{
            System.out.println("O que deseja fazer?\n1-Criar novo jogador\n2-Alterar pontuação do jogador\n3-Exibir informações do jogador\n4-Sair");
            escolha = Integer.parseInt(ans.nextLine())
;
            if(escolha <0 || escolha > 4){
                System.err.println("Comando invalido");
                break;
            }
            switch(escolha){
                case 1:
                    System.out.println("Digite o nome do jogador:");
                    String nomeJogador = ans.nextLine();
                    System.out.println("Digite a pontuação do jogador");
                    int pontuacaoJogador = Integer.parseInt(ans.nextLine());
                    perfil.addJogador(new Jogador(id ,nomeJogador, pontuacaoJogador));
                    id++;
                    break;
                case 2:
                    System.out.println("Digite o id do jogador que deseja alterar a pontuação:");
                    int idProcurado = Integer.parseInt(ans.nextLine());
                    System.out.println("Qual a nova pontuação desse jogador?");
                    int novaPontuacao = Integer.parseInt(ans.nextLine());
                    perfil.alteracaoPontuacao(idProcurado, novaPontuacao);
                    break;
                case 3:
                    System.out.println("Qual o id do jogador que você deseja ver as informações: ");
                    idProcurado = Integer.parseInt(ans.nextLine());
                    System.out.println(perfil.buscarJogador(idProcurado));;
                    break;
            }
        } while(escolha != 4);
    }
}
