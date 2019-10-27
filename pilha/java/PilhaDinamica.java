public class PilhaDinamica {
	private No topo;

	public PilhaDinamica() {
		topo = null;
	}

	public void push(Object item) {
		No novo = new No(item);

		novo.proximo = topo;
		topo = novo;
	}

	public Object pop() {
		if (topo != null) {
			No item = topo;

			topo = topo.proximo;
			item.proximo = null;

			return item.dados;
		}

		return null;
	}

	Object peek() {
		return topo.dados;
	}

	public void exibir() {
		No atual = topo;

		while (atual != null) {
			System.out.print(atual.dados.toString() + " ");
			atual = atual.proximo;
		}

		System.out.println();
	}
}