public class FilaDinamica {
	private No primeiro;
	private No ultimo;

	public FilaDinamica() {
		primeiro = null;
		ultimo = null;
	}

	public void enqueue(Object item) {
		No novo = new No(item);

		if (primeiro == null) {
			primeiro = novo;
			ultimo = novo;
		} else {
			ultimo.proximo = novo;
			ultimo = novo;
		}
	}

	public Object dequeue() {
		if (primeiro != null) {
			No item = primeiro;

			primeiro = primeiro.proximo;
			item.proximo = null;

			return item.dados;
		}

		return null;
	}

	public void exibir() {
		No atual = primeiro;

		while (atual != null) {
			System.out.print(atual.dados.toString() + " ");
			atual = atual.proximo;
		}

		System.out.println();
	}
}