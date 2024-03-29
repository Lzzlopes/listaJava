package Exercicio08;

import java.util.*;

public class Pedido {
    private int numeroPedido;
    private String sabor;
    private String endereco;
    private float valor;

    public Pedido(int numeroPedido, Pizza sabor, String endereco, float valor){
        this.numeroPedido = numeroPedido;
        this.sabor = sabor.getNome();
        this.endereco = endereco;
        this.valor = sabor.getValor();
    }

    private List<Pedido> listaPedidos;

    public Pedido(){listaPedidos = new ArrayList<>();}

    public void addPedido(Pedido info){listaPedidos.add(info);}

    public float getValor() {
        return valor;
    }

    public boolean cancelarPedido(int numeroPedido){
        for(int i=0; i < listaPedidos.size(); i++){
            Pedido p = listaPedidos.get(i);
            if(p.numeroPedido == numeroPedido){
                listaPedidos.remove(p);
                System.out.println("Pedido removido com sucesso!");
                return true;
            }
        }
        System.err.println("Erro ao remover pedido.");
        return false;
    }

    public void relatorioPedidos() {
        int i = 0;
        float media = 0;
        Pizza p;
        if (listaPedidos == null) {
            System.err.println("Nenhum pedido.");
        } else {
            for (Pedido pedido : listaPedidos) {
                media = media + pedido.getValor();
                i++;
            }
            media = media / i;
            System.out.println("Quantidade de pedidos: " + i);
            System.out.printf("Media de valor dos pedidos: R$%.2f\n", media );
        }
    }
}




