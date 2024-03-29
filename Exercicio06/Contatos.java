package Exercicio06;

public class Contatos {
    private int telefone;
    private String nome;

    public Contatos(int telefone, String nome){
        this.telefone = telefone;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString(){
        return "Nome: " + nome +
                "\nTelefone: " + telefone;
    }
}
