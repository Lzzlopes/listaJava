package Exercicio02;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner ans = new Scanner(System.in);

        char opcao = 's';

        Bookstore biblioteca = new Bookstore();

        // Add livros até o usuário não digitar s
        for(int i=1; opcao == 's' ; i++){
            biblioteca.adicionarLivro(new Livro(
                    i,
                    ans.nextLine(),
                    ans.nextLine(),
                    Integer.parseInt(ans.nextLine())
                    )
            );
            System.out.println("Gostaria de adicionar mais um livro? (s/n)");
            opcao = ans.next().charAt(0);
            ans.nextLine();
        }

        //busca do livro
        System.out.println("Digite o ID do livro que deseja procurar:");
        Livro livroProcurado = biblioteca.buscarLivroPorId(Integer.parseInt(ans.nextLine()));

        System.out.println(livroProcurado);

    }
}
