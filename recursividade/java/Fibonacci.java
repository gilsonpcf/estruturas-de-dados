import java.util.Scanner;

public class Fibonacci {

        public static int fib(int n) {
            if (n == 1)
                return 0;
            else if (n == 2)
                return 1;
            else
                return fib(n-2) + fib(n-1);
        }

        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            int num;
			
            System.out.print("Informe o número de termos da sequência: ");
            num = entrada.nextInt();

            for (int i = 1; i <= num; i++)
                System.out.print(fib(i) + " ");
        }
}