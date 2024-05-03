public class MaiorValor {
    public static int max(int v[], int n) {
        if (n == v.length - 1) {
            return v[n];
        } else {
            int valor = max(v, n + 1);

            if (v[n] > valor)
                return v[n];
            else
                return valor;
        }
    }

    public static void main(String[] args) {
        int vetor[] = {7, 3, 1, 6, 5, 9, 2, 0, 4, 8};

        System.out.println(max(vetor, 0));
    }
}
