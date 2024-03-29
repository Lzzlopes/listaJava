package Exercicio06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Agenda info = new Agenda();

        Scanner ans = new Scanner(System.in);

        int escolha;

        do{
            System.out.println("O que deseja fazer?\n1-Adicionar novo contato\n2-Buscar contatos\n3-Sair");
            escolha = Integer.parseInt(ans.nextLine())
            ;
            if(escolha <0 || escolha > 3){
                System.err.println("Comando invalido");
                break;
            }
            switch(escolha) {
                case 1:
                    System.out.println("Digite o nome do contato:");
                    String nome = ans.nextLine();
                    System.out.println("Digite o telefone do contato:");
                    int telefone = Integer.parseInt(ans.nextLine());
                    info.addContato(new Contatos(telefone, nome));
                    break;
                case 2:
                    System.out.println("Nome: ");
                    String nm = ans.nextLine();
                    System.out.println(info.buscarContato(nm));
                    break;
            }
        } while(escolha != 3);
    }

}
