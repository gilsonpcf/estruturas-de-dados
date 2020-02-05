import java.util.Scanner;

public class Fatorial {

    public static int fat(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * fat(n-1);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
		
        System.out.print("Informe um número: ");
        num = entrada.nextInt();

        System.out.print("O fatorial de " + num + " é " + fat(num));
    }
}