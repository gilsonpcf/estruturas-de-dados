public class No {
    public Produto dado;
    public No proximo;

    public No(Produto dado) {
        this.dado = dado;
        this.proximo = null;
    }

    public No(String codigo, double preco, int quantidade) {
        this.dado = new Produto(codigo, preco, quantidade);
        this.proximo = null;
    }
}