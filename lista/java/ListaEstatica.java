public class ListaEstatica {
	private int[] v;
	private int tamanho;

	public ListaEstatica(int n) {
		v = new int[n];
		tamanho = 0;
	}

	public void adicionarFinal(int valor) {
		if (tamanho < v.length) {
			v[tamanho] = valor;
			tamanho++;
		} else
			System.out.println("Lista cheia!");
	}

	public void adicionarPosicao(int valor, int pos) {
		if (pos < v.length) {
			for (int i = tamanho; i > pos; i--)
				v[i] = v[i-1];

			v[pos] = valor;
			tamanho++;
		} else
			System.out.println("Posicao informada nao existe.");
	}

	public void adicionarInicio(int valor) {
		adicionarPosicao(valor, 0);
	}

	public void removerFinal() {
		if (tamanho == 0)
			System.out.println("Lista vazia!");
		else
			tamanho--;
	}

	public void removerPosicao(int pos) {
		if (tamanho == 0)
			System.out.println("Lista vazia!");
		else if (pos < 0 || pos >= tamanho)
			System.out.println("Posicao invalida!");
		else {
			for (int i = pos; i < tamanho-1; i++) {
				v[i] = v[i+1];
			}
			tamanho--;
		}
	}

	public void removerInicio() {
		removerPosicao(0);
	}

	public int buscar(int valor) {
		for (int i = 0; i < tamanho; i++) {
			if (valor == v[i])
				return i;
		}

		return -1;
	}

	public boolean vazia() {
		if (tamanho == 0)
			return true;

		return false;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void exibir() {
		for (int i = 0; i < tamanho; i++) {
			System.out.print(v[i] + " ");
		}

		System.out.println();
	}
}
