public class Produto {
    public String codigo;
    public double preco;
    public int quantidade;

    public Produto() {

    }

    public Produto(String codigo, double preco, int quantidade) {
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}