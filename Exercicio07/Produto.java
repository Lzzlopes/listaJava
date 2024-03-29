package Exercicio07;

import java.util.*;

public class Produto {
    private String nome;
    private int codigo;
    private int qtdEstoque;
    private float preco;

    public Produto(int codigo, String nome, int qtdEstoque, float preco){
        this.codigo = codigo;
        this.nome = nome;
        this.qtdEstoque = qtdEstoque;
        this.preco = preco;
    }

    private List<Produto> estoque;

    public Produto(){estoque = new ArrayList<>();}
    public void addProduto(Produto info){estoque.add(info);}

    public float getPreco() {
        return preco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public boolean alterarInfo(int codigo){
        Scanner scan = new Scanner(System.in);
        for(Produto p : estoque){
            if(p.codigo == codigo){
                System.out.println("Qual informação você deseja alterar?\n1-Preço\n2-Quantidade em estoque");
                int resposta = Integer.parseInt((scan.nextLine()));
                switch (resposta){
                    case 1:
                        System.out.println("Digite o preço novo:");
                        p.setPreco(Float.parseFloat(scan.nextLine()));
                        break;
                    case 2:
                        System.out.println("Digite a quantidade do produto em estoque:");
                        p.setQtdEstoque(Integer.parseInt(scan.nextLine()));
                        break;
                }
                return true;
            }
        } return false;
    }

    public boolean removerProduto(int codigo){
        for (int i=0; i < estoque.size(); i++){
            Produto p = estoque.get(i);
            if(p.codigo == codigo){
                estoque.remove(p);
                return true;
            }
        }
        return false;
    }

    public void geral(){

        if(estoque == null){
            System.err.println("Estoque vazio");
        } else{
            for (Produto produto : estoque) {
                System.out.println(produto);
            }
        }
    }

    @Override
    public String toString(){
        return "-----------------------------------" +
                "\nCodigo: " + codigo +
                "\nProduto: " + nome +
                "\nPreço: " + preco +
                "\nQuantidade em estoque: " + qtdEstoque +
                "\n-----------------------------------";
    }
}
