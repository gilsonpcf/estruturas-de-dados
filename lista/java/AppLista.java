public class AppLista {
    public static void main(String[] args) {
        //ListaEstatica lista = new ListaEstatica(10);
        ListaDinamica lista = new ListaDinamica();

        lista.adicionarFinal(30);
        lista.exibir();
        lista.adicionarFinal(13);
        lista.exibir();
        lista.adicionarFinal(1);
        lista.exibir();
        lista.adicionarFinal(9);
        lista.exibir();
        lista.adicionarFinal(25);
        lista.exibir();
        lista.adicionarInicio(7);
        lista.exibir();
        lista.removerFinal();
        lista.exibir();
        lista.removerInicio();
        lista.exibir();
    }
}
