package Exercicio08;

import java.util.*;

public class Pedido {
    private int numeroPedido;
    private String sabor;
    private String endereco;

    public Pedido(int numeroPedido, Pizza sabor, String endereco){
        this.numeroPedido = numeroPedido;
        this.sabor = sabor.getNome();
        this.endereco = endereco;
    }

    private List<Pedido> listaPedidos;

    public Pedido(){listaPedidos = new ArrayList<>();}

    public void addPedido(Pedido info){listaPedidos.add(info);}

    public boolean cancelarPedido(int numeroPedido){
        for (int i=0; i < listaPedidos.size(); i++){
            Pedido p = listaPedidos.get(i);
            if(p.numeroPedido == numeroPedido){
                listaPedidos.remove(p);
                return true;
            }
        }
        return false;
    }

    public void totalPedidos(){
        if(listaPedidos == null){
            System.err.println("Estoque vazio");
        } else{
            for (Pedido pedido : listaPedidos) {
                System.out.println(pedido);
            }
        }
    }
}
