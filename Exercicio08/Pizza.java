package Exercicio08;

import java.util.*;

public class Pizza {
    private int codigo;
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

    public float getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }

    public int novoCodigo(){
        int i=0;
        for(Pizza p : sabor){
            i++;
        }
        return (i+1);
    }

    public Pizza mostrarPizzas(){
        for(Pizza p : sabor){
            System.out.println(sabor);
        }
        System.out.println("Escolha um sabor");

        Scanner scan = new Scanner(System.in);
        int opcao = Integer.parseInt(scan.nextLine());

        for(Pizza p : sabor){
            if(opcao == p.codigo){
                return p;
            }
        } return null;
    }


    @Override
    public String toString(){
        return "-----------------------------------" +
                "\nCodigo: " + codigo +
                "\nsabor: " + nome +
                "\nvalor: " + valor +
                "\nIngredientes: " + ingrediente +
                "\n-----------------------------------";
    }


}
