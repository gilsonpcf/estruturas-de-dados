public class ListaDinamicaOrdenada {
	private No primeiro;
	private No ultimo;

	public ListaDinamicaOrdenada() {
		primeiro = null;
		ultimo = null;
	}

    public void adicionar(int valor) {
        No novo = new No(valor);

        if (primeiro == null) { // Lista vazia
            primeiro = novo;
            ultimo = novo;
        } else if (novo.valor < primeiro.valor) { // Inicio da lista
            novo.proximo = primeiro;
            primeiro = novo;
        } else if (novo.valor > ultimo.valor) { // Final da lista
            ultimo.proximo = novo;
            ultimo = novo;
        } else {
            No anterior = null;
            No atual = primeiro;

            while (atual != null && novo.valor > atual.valor) {
                anterior = atual;
                atual = atual.proximo;
            }

            anterior.proximo = novo;
            novo.proximo = atual;
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
		No atual = primeiro;

		while (atual != null) {
			System.out.print(atual.valor + " ");
			atual = atual.proximo;
		}

		System.out.println();
	}
}