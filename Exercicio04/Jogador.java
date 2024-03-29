package Exercicio04;

import java.util.*;

public class Jogador {
    private int id;
    private String nome;
    private int pontuacao;
    private int nivel;

    public Jogador(int id, String nome, int pontuacao){
        this.id = id;
        this.nome = nome;
        this.pontuacao = pontuacao;
        if (pontuacao >= 0 && pontuacao < 20){this.nivel = 1;}
        else if (pontuacao >= 20 && pontuacao <50){this.nivel = 2;}
        else if (pontuacao >= 50 && pontuacao <60){this.nivel = 3;}
        else if (pontuacao >= 60 && pontuacao <85){this.nivel = 4;}
        else if (pontuacao >= 85 && pontuacao <100){this.nivel = 5;}
    }

    private List<Jogador> jogo;

    public Jogador() {jogo = new ArrayList<>();}

    public void addJogador(Jogador profile) {jogo.add(profile);}

    public void setNovaPontuacao(int novaPontuacao){pontuacao = novaPontuacao;}
    public int getPontuacao(){
        return pontuacao;
    }

    public int getId(){
        return id;
    }

    public boolean alteracaoPontuacao(int jogadorProcurado, int pontuacaoAlterada){
        for (Jogador j : jogo){
            if(j.getPontuacao() == jogadorProcurado){
                j.setNovaPontuacao(pontuacaoAlterada);
                System.out.println("Alteração bem sucedida!");
                return true;
            }
        }
        System.err.println("Alteração não realizada.");
        return false;
    }

    public Jogador buscarJogador(int idJogador){
        for(Jogador j : jogo) {
            if(j.getId() == idJogador) {
                return j;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Jogador: " + nome +
                "\n pontuação: " +pontuacao +
                "\n nivel: " + nivel;
    }

}
