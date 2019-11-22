public class AppArvore {

	public static void main(String[] args) {
		ArvoreBinariaBusca a = new ArvoreBinariaBusca();

		a.adicionar(6);
		a.adicionar(2);
		a.adicionar(8);
		a.adicionar(1);
		a.adicionar(4);
		a.adicionar(7);
		a.adicionar(9);
		a.adicionar(3);
		a.adicionar(5);

		a.exibirPreOrdem();
		a.exibirEmOrdem();
		a.exibirPosOrdem();

		System.out.println(a.pesquisar(9));
		System.out.println(a.pesquisar(10));
	}

}