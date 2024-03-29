package Exercicio08;

import java.util.*;

public class Pizza {
    private int Codigo;
    private String nome;
    private float valor;
    private String ingrediente;

    public Pizza(int codigo, String nome, float valor, String ingrediente){
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
        this.ingrediente = ingrediente;
    }

    private List<Pizza> sabor;

    public Pizza(){sabor = new ArrayList<>();}

    public void addPizza(Pizza info){sabor.add(info);}

    public String getNome() {
        return nome;
    }

    public Pizza mostrarPizzas(){
        for(Pizza p : sabor){
            System.out.println(sabor);
        }
        System.out.println("Escolha um sabor");

        for(Pizza p : sabor){
            System.out.println(sabor);
        }
    }




}
