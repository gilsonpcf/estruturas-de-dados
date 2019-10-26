public class ListaDinamica {
	private No primeiro;
	private No ultimo;

	public ListaDinamica() {
		primeiro = null;
		ultimo = null;
	}

	public void adicionarFinal(int valor) {
		No novo = new No(valor);

		if (primeiro == null) {
			primeiro = novo;
			ultimo = novo;
		} else {
			ultimo.proximo = novo;
			ultimo = novo;
		}
	}

	public void adicionarInicio(int valor) {
		No novo = new No(valor);

		if (primeiro == null) {
			primeiro = novo;
			ultimo = novo;
		} else {
			novo.proximo = primeiro;
			primeiro = novo;
		}
	}

	public void removerInicio() {
		if (primeiro != null) {
			if (primeiro == ultimo) {
				primeiro = null;
				ultimo = null;
			} else {
				No aux = primeiro;
				primeiro = primeiro.proximo;
				aux.proximo = null;
			}
		}
	}

	public void removerFinal() {
		if (ultimo != null) {
			if (primeiro == ultimo) {
				primeiro = null;
				ultimo = null;
			} else {
				No atual = primeiro;

				while (atual.proximo != ultimo) {
					atual = atual.proximo;
				}

				ultimo = atual;
				ultimo.proximo = null;
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
