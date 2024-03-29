package Exercicio07;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Produto info = new Produto();

        Scanner ans = new Scanner(System.in);

        int escolha, id=1;

        do{
            System.out.println("O que deseja fazer?\n1-Registrar novo produto\n2-Alterar informações do produto\n3-Remover produto do estoque\n4-Ver estoque\n5-Sair");
            escolha = Integer.parseInt(ans.nextLine())
            ;
            if(escolha <0 || escolha > 5){
                System.err.println("Comando invalido");
                break;
            }
            switch(escolha) {
                case 1:
                    System.out.println("Digite o nome do produto:");
                    String nome = ans.nextLine();
                    System.out.println("Digite a quantidade no estoque do produto:");
                    int qtd = Integer.parseInt(ans.nextLine());
                    System.out.println("Digite o preço do produto:");
                    float preco = Float.parseFloat(ans.nextLine());
                    info.addProduto(new Produto(id, nome, qtd, preco));
                    id++;
                    break;
                case 2:
                    System.out.println("Digite o id do produto que deseja alterar os dados:");
                    int idProd = Integer.parseInt(ans.nextLine());
                    info.alterarInfo(idProd);
                    break;
                case 3:
                    System.out.println("Qual id do produto que deseja remover:");
                    int idP = Integer.parseInt(ans.nextLine());
                    info.removerProduto(idP);
                    break;
                case 4:
                    info.geral();
                    break;
            }
        } while(escolha != 5);
    }
}
