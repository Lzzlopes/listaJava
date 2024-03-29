package Exercicio05;

import java.util.*;

public class Carro {
    private int id;
    private String marca;
    private String modelo;
    private int ano;
    private float velocidadeAtual;

    public Carro(int id, String marca, String modelo, int ano, float velocidadeAtual){
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = velocidadeAtual;
    }

    private List<Carro> garagem;

    public Carro() {garagem = new ArrayList<>();}

    public void addCarro( Carro infoCarro) {garagem.add(infoCarro);}

    public void setVelocidadeAtual(float velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public float getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public int getId() {
        return id;
    }

    public boolean acelerar(int cid){
        for (Carro c : garagem){
            if(c.id == cid){
                float novaVelocidade = (c.getVelocidadeAtual() + 10);
                c.setVelocidadeAtual(novaVelocidade);
                return true;
            }
        }
        return false;
    }

    public boolean freiar(int cid){
        for (Carro c : garagem){
            if(c.id == cid){
                float novaVelocidade = (c.getVelocidadeAtual() - 5);
                c.setVelocidadeAtual(novaVelocidade);
                return true;
            }
        }
        return false;
    }

    public Carro buscarCarro(int idCarro){
        for(Carro c : garagem){
            if(c.getId() == idCarro){
                return c;
            }
        }
        return null;
    }
    @Override
    public String toString(){
        return "\nMarca: " + marca +
                "\nModelo: " + modelo +
                "\nAno: " + ano +
                "\nVelocidade Atual: " + velocidadeAtual;
    }

}
