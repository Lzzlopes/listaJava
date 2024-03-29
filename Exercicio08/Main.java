package Exercicio08;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Pizza sabor = new Pizza();

        Pedido inf = new Pedido();

        Scanner ans = new Scanner(System.in);

        int i=1;

        sabor.addPizza(new Pizza(1,"Portuguesa", 25.50f, "mussarela, ovos, palmito, pimentão, ervilha, presunto e cebola"));
        sabor.addPizza(new Pizza(2,"Napolitana", 20.00f, "mussarela, rodelas de tomate, queijo parmesão e orégano"));
        sabor.addPizza(new Pizza(3,"Frango com Catupiry", 35.99f, "molho de tomate, mussarela, frango e catupiry"));
        sabor.addPizza(new Pizza(4,"Marguerita", 26.99f, "mussarela, rodelas de tomate e manjericão"));
        sabor.addPizza(new Pizza(5,"Mussarela", 26.00f, "mussarela, rodelas de tomate e orégano"));
        sabor.addPizza(new Pizza(6,"Vegetariana", 35.50f, "mussarela, pimentão, cebola, azeitona, ervilha, tomate, palmito, milho e orégano"));

        int resp;

        do {
            System.out.println("1-Gerenciar pedidos\n2-Adicionar sabor de pizza\n3-Sair");
            resp = Integer.parseInt(ans.nextLine());
            switch (resp){
                case 1:
                    System.out.println("1-Adicionar pedido\n2-Remover pedido\n3-Gerar relatório de pedidos");
                    int opcao = Integer.parseInt(ans.nextLine());
                    switch(opcao){
                        case 1:
                            System.out.println("Digite o endereço de entrega:");
                            String endereco = ans.nextLine();
                            System.out.println("Escolha uma pizza:");
                            Pizza p = sabor.mostrarPizzas();
                            float v = sabor.getValor();
                            inf.addPedido(new Pedido(i, p, endereco, v));
                            i++;
                            break;
                        case 2:
                            System.out.println("Digite o codigo do pedido que deseja remover:");
                            int cdg = Integer.parseInt(ans.nextLine());
                            inf.cancelarPedido(cdg);
                            break;
                        case 3:
                            inf.relatorioPedidos();
                            break;
                    }
                    break;

                case 2:
                    int cod = sabor.novoCodigo();
                    System.out.println("Digite o sabor da pizza");
                    String nmPzz = ans.nextLine();
                    System.out.println("Digite o valor da pizza:");
                    float vlr = Float.parseFloat(ans.nextLine());
                    System.out.println("Digite os ingredientes da pizza:");
                    String ing = ans.nextLine();
                    sabor.addPizza(new Pizza(cod, nmPzz, vlr, ing));
                    break;
            }
        } while(resp != 3);

    }
}
