package Exercicio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();

        Scanner ans = new Scanner(System.in);

        int escolha;

        do {
            System.out.println("Escolha um:\n1- Abrir uma conta\n2- Depósito\n3- Saque\n4- Consulta de saldo\n5 - Sair");
            escolha = Integer.parseInt(ans.nextLine());

            switch (escolha) {

                case 1:
                    conta.addconta(new ContaBancaria(
                            Integer.parseInt(ans.nextLine()),
                            ans.nextLine(),
                            Float.parseFloat(ans.nextLine())
                            )
                    );
                    break;
                case 2:
                    System.out.println("Digite o número da conta que deseja fazer o depósito e o valor a ser depositado:");
                    conta.deposito(Integer.parseInt(ans.nextLine()), Float.parseFloat(ans.nextLine()));

                    break;
                case 3:
                    System.out.println("Digite o número da conta que deseja fazer o saque e o valor a ser depositado:");
                    conta.saque(Integer.parseInt(ans.nextLine()), Float.parseFloat(ans.nextLine()));
                    break;
                case 4:
                    System.out.println("Digite o numero da conta a ser exibida:");
                    ContaBancaria c = conta.buscarconta(Integer.parseInt(ans.nextLine()));
                    System.out.println(c);
                    break;
            }

        } while(escolha != 5);
        System.out.println("Saindo...");
    }
}
