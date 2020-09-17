public class ListaDinamica {
    private No primeiro;
    private No ultimo;

    public ListaDinamica() {
        primeiro = null;
        ultimo = null;
    }

    public void adicionarFinal(String codigo, double preco, int quantidade) {
        No novo = new No(codigo, preco, quantidade);

        if (primeiro == null) { // Lista vazia
            primeiro = novo;
            ultimo = novo;
        } else {
            ultimo.proximo = novo;
            ultimo = novo;
        }
    }

    public void adicionarInicio(String codigo, double preco, int quantidade) {
        No novo = new No(codigo, preco, quantidade);

        if (primeiro == null) { // Lista vazia
            primeiro = novo;
            ultimo = novo;
        } else {
            novo.proximo = primeiro;
            primeiro = novo;
        }
    }

    public void removerFinal() {
        if (ultimo != null) { // Lista nao vazia
            if (primeiro == ultimo) { // So um elemento
                primeiro = null;
                ultimo = null;
            } else {
                No atual = primeiro;

                while (atual.proximo != ultimo)
                    atual = atual.proximo;

                ultimo = atual;
                ultimo.proximo = null;
            }
        }
    }

    public void removerInicio() {
        if (primeiro != null) { // Lista nao vazia
            if (primeiro == ultimo) { // So um elemento
                primeiro = null;
                ultimo = null;
            } else {
                //No aux = primeiro;
                primeiro = primeiro.proximo;
                //aux.proximo = null;
            }
        }
    }

    public void exibir() {
        int cont = 0;
        No atual = primeiro;

        while (atual != null) {
            System.out.printf("\nCodigo: %s\n", atual.dado.getCodigo());
            System.out.printf("Preco: %.2f\n", atual.dado.getPreco());
            System.out.printf("Quantidade: %d\n", atual.dado.getQuantidade());

            if (atual.dado.getQuantidade() > 500)
                cont++;

            atual = atual.proximo;
        }

        System.out.printf("\nProdutos com quantidade superior a 500: %d\n", cont);
    }

    public void aplicarDesconto(double taxa) {
        No atual = primeiro;

        while (atual != null) {
            atual.dado.setPreco(atual.dado.getPreco() - atual.dado.getPreco() * taxa / 100);
            atual = atual.proximo;
        }
    }
}