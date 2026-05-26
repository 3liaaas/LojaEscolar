package br.com.lojaescolar.eliasrodrigues;
// esta Classe é filha da Classe Produto

public class Caderno extends Produto {
    private int numDeFolhas;
    public Caderno(String nome, double preco, int numDeFolhas) {
        super(nome, preco); // <- super está substituindo a classe Produto
        this.numDeFolhas = numDeFolhas;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
    }
}
