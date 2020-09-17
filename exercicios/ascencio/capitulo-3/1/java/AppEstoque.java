import java.util.Scanner;

public class AppEstoque {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ListaDinamica estoque = new ListaDinamica();
        String codigo;
        double preco, desconto;
        int quantidade;

        for (int i = 0; i < 5; i++) {
            System.out.print("\nCodigo: ");
            codigo = entrada.next();
            System.out.print("Preco: ");
            preco = entrada.nextDouble();
            System.out.print("Quantidade: ");
            quantidade = entrada.nextInt();

            estoque.adicionarFinal(codigo, preco, quantidade);
        }

        System.out.print("\nDesconto: ");
        desconto = entrada.nextDouble();

        estoque.aplicarDesconto(desconto);

        estoque.exibir();
    }
}