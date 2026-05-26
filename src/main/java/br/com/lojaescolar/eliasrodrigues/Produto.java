package br.com.lojaescolar.eliasrodrigues;

public class Produto {
    private String nome; // <- atributo da classe Produto
    private double preco;// <- atributo da classe Produto

    public Produto(String nome, double preco){ // <-- Construtor que recebe ESTES 2 atributos!
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void exibirDetalhes(){
        System.out.println("Produto: "+nome+ " - preço " +preco);
    }
}
