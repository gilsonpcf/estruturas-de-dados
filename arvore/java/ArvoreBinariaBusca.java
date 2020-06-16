public class ArvoreBinariaBusca {
	private No raiz;

	public ArvoreBinariaBusca() {
		raiz = null;
	}

	public void adicionar(int valor) {
		if (raiz == null) {
			raiz = new No(valor);
		}
		else {
			adicionar(valor, raiz);
		}
	}

	public void adicionar(int valor, No raiz) {
		if (valor < raiz.valor) {
			if (raiz.esquerda == null) {
				raiz.esquerda = new No(valor);
			}
			else {
				adicionar(valor, raiz.esquerda);
			}
		}
		else if (valor > raiz.valor) {
			if (raiz.direita == null) {
				raiz.direita = new No(valor);
			}
			else {
				adicionar(valor, raiz.direita);
			}
		}
	}

	public boolean pesquisar(int valor) {
		if (raiz == null) {
			return false;
		}
		else {
			return pesquisar(valor, raiz);
		}
	}

	public boolean pesquisar(int valor, No raiz) {
		if (valor == raiz.valor) {
			return true;
		}
		else if (valor < raiz.valor) {
			if (raiz.esquerda == null) {
				return false;
			}
			else {
				return pesquisar(valor, raiz.esquerda);
			}
		}
		else if (valor > raiz.valor) {
			if (raiz.direita == null) {
				return false;
			}
			else {
				return pesquisar(valor, raiz.direita);
			}
		}

		return false;
	}

	public void remover(int valor) {
		if (raiz != null) {
			remover(valor, raiz, null);
		}
	}

	public void remover(int valor, No raiz, No pai) {
		if (valor == raiz.valor) {
			if (raiz.esquerda == null && raiz.direita == null) {      // Nó não tem filhos
				if (raiz == pai.esquerda)    // Nó é filho esquerdo?
					pai.esquerda = null;
				else
					pai.direita = null;
			}
			else if (raiz.esquerda != null && raiz.direita == null) { // Nó tem um filho (esquerdo)
				if (raiz == pai.esquerda)    // Nó é filho esquerdo?
					pai.esquerda = raiz.esquerda;
				else
					pai.direita = raiz.esquerda;
			}
			else if (raiz.esquerda == null && raiz.direita != null) { // Nó tem um filho (direito)
				if (raiz == pai.esquerda)    // Nó é filho esquerdo?
					pai.esquerda = raiz.direita;
				else
					pai.direita = raiz.direita;
			}
			else if (raiz.esquerda != null && raiz.direita != null) { // Nó tem dois filhos
				raiz.valor = menorValor(raiz.direita);
				remover(raiz.valor, raiz.direita, raiz);
			}
		}
		else if (valor < raiz.valor) {
			if (raiz.esquerda != null)
				remover(valor, raiz.esquerda, raiz);
		}
		else if (valor > raiz.valor) {
			if (raiz.direita != null)
				remover(valor, raiz.direita, raiz);
		}
	}

	public int menorValor(No raiz) {
		if (raiz.esquerda == null)
			return raiz.valor;
		else
			return menorValor(raiz.esquerda);
	}

	public void exibirPreOrdem() {
		if (raiz != null) {
			exibirPreOrdem(raiz);
			System.out.println();
		}
	}

	public void exibirPreOrdem(No raiz) {
		System.out.print(raiz.valor + " ");

		if (raiz.esquerda != null) {
			exibirPreOrdem(raiz.esquerda);
		}

		if (raiz.direita != null) {
			exibirPreOrdem(raiz.direita);
		}
	}

	public void exibirEmOrdem() {
		if (raiz != null) {
			exibirEmOrdem(raiz);
			System.out.println();
		}
	}

	public void exibirEmOrdem(No raiz) {
		if (raiz.esquerda != null) {
			exibirEmOrdem(raiz.esquerda);
		}

		System.out.print(raiz.valor + " ");

		if (raiz.direita != null) {
			exibirEmOrdem(raiz.direita);
		}
	}

	public void exibirPosOrdem() {
		if (raiz != null) {
			exibirPosOrdem(raiz);
			System.out.println();
		}
	}

	public void exibirPosOrdem(No raiz) {
		if (raiz.esquerda != null) {
			exibirPosOrdem(raiz.esquerda);
		}

		if (raiz.direita != null) {
			exibirPosOrdem(raiz.direita);
		}

		System.out.print(raiz.valor + " ");
	}
}
