public class AppArvore {
    public static void main(String[] args) {
        ArvoreBinariaBusca arvore = new ArvoreBinariaBusca();

        arvore.adicionar(7);
        arvore.adicionar(5);
        arvore.adicionar(12);
        arvore.adicionar(2);
        arvore.adicionar(6);
        arvore.adicionar(9);
        arvore.adicionar(21);
        arvore.adicionar(19);
        arvore.adicionar(25);

        arvore.exibirPreOrdem();
        arvore.exibirEmOrdem();
        arvore.exibirPosOrdem();

        System.out.println(arvore.pesquisar(9));
        System.out.println(arvore.pesquisar(10));

        arvore.remover(9);

        System.out.println(arvore.pesquisar(9));
    }
}
