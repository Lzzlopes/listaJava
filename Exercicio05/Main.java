package Exercicio05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Carro info = new Carro();

        Scanner ans = new Scanner(System.in);

        int escolha, id=1;

        do{
            System.out.println("O que deseja fazer?\n1-Registrar novo carro\n2-Acelerar carro\n3-Freiar carro\n4-exibir informações sobre um carro\n5-Sair");
            escolha = Integer.parseInt(ans.nextLine())
            ;
            if(escolha <0 || escolha > 5){
                System.err.println("Comando invalido");
                break;
            }
            switch(escolha) {
                case 1:
                    System.out.println("Digite a marca do carro:");
                    String marca = ans.nextLine();
                    System.out.println("Digite o modelo do carro:");
                    String modelo = ans.nextLine();
                    System.out.println("Digite o ano do carro:");
                    int ano = Integer.parseInt(ans.nextLine());
                    System.out.println("Digite a velocidade atual do carro:");
                    float vel = Float.parseFloat(ans.nextLine());
                    info.addCarro(new Carro(id, marca, modelo, ano, vel));
                    id++;
                    break;
                case 2:
                    System.out.println("Digite o id do carro que deseja acelerar:");
                    int idac = Integer.parseInt(ans.nextLine());
                    info.acelerar(idac);
                    break;
                case 3:
                    System.out.println("Qual id do carro que voce deseja reduzir a velocidade?");
                    int idred = Integer.parseInt(ans.nextLine());
                    info.freiar(idred);
                    break;
                case 4:
                    System.out.println("Qual o id do carro que você deseja ver as informações: ");
                    int idProcurado = Integer.parseInt(ans.nextLine());
                    System.out.println(info.buscarCarro(idProcurado));
                    break;
            }
        } while(escolha != 5);
    }
}
