public class HeapMin {
	private int[] dados;
	private int tamanho;

	public HeapMin(int n) {
		dados = new int[n];
		tamanho = 0;
	}

	public int menor() {
		if (vazio())
			throw new RuntimeException("Heap vazio");
		else
			return dados[0];
	}

	public boolean vazio() {
		return (tamanho == 0);
	}

	public void inserir(int valor) {
		if (tamanho == dados.length)
			throw new RuntimeException("Heap lotado");
		else {
			tamanho++;
			dados[tamanho - 1] = valor;
			subir(tamanho - 1);
		}
	}    

	private void subir(int indice) {
		int indicePai, temp;

		if (indice != 0) {
			indicePai = (indice - 1) / 2;

			if (dados[indicePai] > dados[indice]) {
				temp = dados[indicePai];
				dados[indicePai] = dados[indice];
				dados[indice] = temp;
				subir(indicePai);
			}
		}
	}

	public void remover() {
		if (vazio())
			throw new RuntimeException("Heap vazio");
		else {
			dados[0] = dados[tamanho - 1];
			tamanho--;
			if (tamanho > 0)
				descer(0);
		}
	}

	private void descer(int indice) {
		int indiceFilhoEsq, indiceFilhoDir, indiceMin, temp;

		indiceFilhoEsq = 2 * indice + 1;
		indiceFilhoDir = 2 * indice + 2;

		if (indiceFilhoDir >= tamanho) {
			if (indiceFilhoEsq >= tamanho)
				return;
			else
				indiceMin = indiceFilhoEsq;
		} else {
			if (dados[indiceFilhoEsq] <= dados[indiceFilhoDir])
				indiceMin = indiceFilhoEsq;
			else
				indiceMin = indiceFilhoDir;
		}

		if (dados[indice] > dados[indiceMin]) {
			temp = dados[indiceMin];
			dados[indiceMin] = dados[indice];
			dados[indice] = temp;
			descer(indiceMin);
		}
	}

	public void exibir() {
		for (int i = 0; i < tamanho; i++) {
			System.out.print(dados[i] + " ");
		}

		System.out.println();
	}
}