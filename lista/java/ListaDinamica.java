public class ListaDinamica {
	private No primeiro;
	private No ultimo;
	private int tamanho;

	public ListaDinamica()
	{
		primeiro = null;
		ultimo = null;
		tamanho = 0;
	}

	public void adicionarFinal(int valor)
	{
		No novo = new No(valor);

		if (primeiro == null) {
			primeiro = novo;
			ultimo = novo;
		}
		else {
			ultimo.setProximo(novo);
			ultimo = novo;
		}

		tamanho++;
	}

	public void adicionarPosicao(int valor, int pos)
	{
	}

	public void adicionarInicio(int valor)
	{
		No novo = new No(valor);

		if (primeiro == null) {
			primeiro = novo;
			ultimo = novo;
		}
		else {
			novo.setProximo(primeiro);
			primeiro = novo;
		}

		tamanho++;
	}

	public void removerFinal()
	{
	}

	public void removerPosicao(int pos)
	{
	}

	public void removerInicio()
	{
	}

	public int buscar(int valor)
	{

		return -1;
	}

	public boolean vazia()
	{
		if (primeiro == null)
			return true;

		return false;
	}

	public int getTamanho()
	{
		return tamanho;
	}

	public void exibir()
	{
		No aux = primeiro;
		
		while (aux != null) {
			System.out.print(aux.getDado() + " ");
			aux = aux.getProximo();
		}
	}
}