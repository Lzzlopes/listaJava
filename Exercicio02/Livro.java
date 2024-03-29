package Exercicio02;

class Livro {

    // info do livro
    private int id;
    private String titulo;
    private String autor;
    private int anoPublicacao;

    //construtor dos Livros
    public Livro(int id, String titulo, String autor, int anoPublicacao){
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    // Retorna o valor de id para a busca do livro
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "id= " + id +
                ", titulo= '" + titulo + '\'' +
                ", autor= '" + autor + '\'' +
                ", ano de publicação= '" + anoPublicacao + '\'' +
                '}';
    }
}
