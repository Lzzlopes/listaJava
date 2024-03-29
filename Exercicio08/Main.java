package Exercicio08;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Pizza sabor = new Pizza();

        Pedido inf = new Pedido();

        Scanner ans = new Scanner(System.in);

        sabor.addPizza(new Pizza("Portuguesa", 25.50f, "mussarela, ovos, palmito, pimentão, ervilha, presunto e cebola"));
        sabor.addPizza(new Pizza("Napolitana", 20.00f, "mussarela, rodelas de tomate, queijo parmesão e orégano"));
        sabor.addPizza(new Pizza("Frango com Catupiry", 35.99f, "molho de tomate, mussarela, frango e catupiry"));
        sabor.addPizza(new Pizza("Marguerita", 26.99f, "mussarela, rodelas de tomate e manjericão"));
        sabor.addPizza(new Pizza("Mussarela", 26.00f, "mussarela, rodelas de tomate e orégano"));
        sabor.addPizza(new Pizza("Vegetariana", 35.50f, "mussarela, pimentão, cebola, azeitona, ervilha, tomate, palmito, milho e orégano"));

        int resp;


        do {
            System.out.println("1-Gerenciar pedidos\n2-Adicionar sabor de pizza\n3-Sair");
            resp = Integer.parseInt(ans.nextLine());
            switch (resp){
                case 1:
                    System.out.println("1-Adicionar pedido\n2-Remover pedido\n3-Gerar relatório de pedidos");
                    resp = Integer.parseInt(ans.nextLine());
                    switch(resp){
                        case 1:
                            System.out.println("Digite o endereço de entrega:");
                            String endereco = ans.nextLine();
                            System.out.println("Escolha uma pizza:");
                            Pizza p = sabor.mostrarPizzas();


                            break;
                        case 2:

                            break;
                        case 3:

                            break;
                    }
                    break;

                case 2:

                    break;
            }
        } while(resp != 3);

    }
}
