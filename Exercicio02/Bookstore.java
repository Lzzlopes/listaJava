package Exercicio02;

import java.util.ArrayList;
import java.util.List;

public class Bookstore {

    private List<Livro> biblioteca;

    //Inicialiador da lista biblioteca para armazenar livros novos
    public Bookstore(){
        biblioteca = new ArrayList<>();
    }

    //adiciona obj Livro à biblioteca
    public void adicionarLivro(Livro livro){
        biblioteca.add(livro);
    }

    //Faz a busca do livro com base no id informado na Main buscando dentro da biblioteca se há um livro que corresponda ao id informado se não houver retorna null
    public Livro buscarLivroPorId(int id) {
        for (Livro livro : biblioteca) {
            if (livro.getId() == id) {
                return livro;
            }
        }
        return null;
    }
}


